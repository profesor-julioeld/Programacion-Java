package examenes.matrices.anulado.correcciones.alumno599238;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;


    import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

    // Desarrollo de  un tablero que se pueda usar de forma asíncrona
    // Aunque su desarrollo se basa en Programación dirigida a Eventos, su uso
    // enmarcara la gestión de eventos.
    // Aunque sea un poco cutre, para la implementación del bloqueo en nextPosicion
    // bloqueo el propio hilo main del programa principal
    // Para no complicar la clase, no incorporo control de excepciones
    // en su lugar, cada función que reciba un parámetro inadecuado
    // >>>> Hay que eliminar todo el harcodeo, como mínimo sustituir por constantes
    //      Hago una lista de todos los casos:
    //   - Tamaño del tablero 500x600
    //   - Tamaño de fuente para carteles y para botones
    //   - Valor máximo de tiempo para NextCasilla , valor 30 segundos
    //   - TaskTimer se ejecuta cada 1000 msg
    //   - Espera para ver texto de sistema de 500 msg
    //   - caracter devuelto cuando no hay contenido en la casilla '\0'
    public class Tablero extends JFrame implements ActionListener {
        private static final long serialVersionUID = 1L;
        private int n;
        private JPanel panelBotones;
        private JButton botones[][];
        // Habrá dos carteles:
        //   El primero es para mensajes de sistema (estará abajo)
        //   El segundo es para los mensajes del usuario (estará arriba)
        private JLabel cartelUsuario;
        private JLabel cartelSistema;

        private boolean activo;

        // Para no tener que explicar hilos para poder usar esta clase
        // he decido que sea la ventana y el objeto compartido a la vez
        // la información compartida es la de la posición donde se pulsa
        private int fila;
        private int columna;
        private char letra;

        /**
         * Contruye un tablero gráfico compuesto de nxn casillas.
         * Permite gestionar la casilla en la que pulsemos y contener una letra.
         * @param n El parámetro indica el número de filas del tablero (igual al de columnas)
         */
        public Tablero(int n) {
            super("");
            this.n=n;
            // Harcodeo a tope
            setSize(500,600);
            setResizable(false);
            activo=false;
            Font f; // Fuente que usaré para los componentes
            f=new Font( Font.MONOSPACED, Font.PLAIN, 20);
            setLayout(new BorderLayout());
            // Construyo carteles
            cartelUsuario=new JLabel();
            cartelUsuario.setFont(f);
            add(cartelUsuario,BorderLayout.NORTH);
            cartelSistema=new JLabel();
            cartelSistema.setFont(f);
            add(cartelSistema,BorderLayout.SOUTH);

            // Construyo casillas
            panelBotones=new JPanel();
            panelBotones.setLayout(new GridLayout(n, n));
            f = new Font( Font.MONOSPACED, Font.PLAIN, 100);
            botones = new JButton[n][n];
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++){
                    botones[i][j] = new JButton();
                    botones[i][j].setActionCommand((i+1)+"-"+(j+1));
                    botones[i][j].addActionListener(this);
                    botones[i][j].setFont(f);
                    panelBotones.add(botones[i][j]);
                }
            add(panelBotones,BorderLayout.CENTER);
            // Al pulsar en cerrar no hago nada
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            // Pone los carteles iniciales
            setCartelUsuario("");
            setCartelSistema("");
            repaint();
            setVisible(true);
        }

        /**
         * Es muy importante que cierres el recurso una vez terminado su uso, sino no se podrá
         * cerrar la máquina virtual Java
         */
        public void close() {
            dispose();
        }

        // Devuelve cierto si todavía quedan casillas activas
        // Es una codificación poco eficiente, sería mejor gestionarlo con una matriz
        // boolean
        private boolean hayCasillasActivas() {
            for (int i=0;i<n;i++)
                for (int j=0;j<n;j++)
                    if (botones[i][j].isEnabled()) return true;
            return false;
        }
        private int contador;
        /**
         * El tablero está por defecto desactivado (no gestiona clicks).
         * Cuando se ejecuta, se activa siempre que haya casillas activas, en ese caso
         * se queda bloqueado hasta que el usuario pulse en una casilla, una vez pulsada
         * se desactiva la casilla por lo que no puede volver a ser pulsada (salvo que la
         * vuelvas a activar con enableCasilla()
         * Existe un tiempo de espera, si el usuario no pulsa en ninguna casilla pasado dicho
         * tiempo, se desbloquea nextCasilla indicando que no se ha pulsado nada con getPulsado()
         * @param time Tiempo de espera en segundos, valores de 1 a 30
         * @return devuelve true si quedaban casillas activas antes de pulsar.
         */
        public synchronized boolean nextCasilla(int time) {
            // Utilizo una Exception no checked, por ello no es necesario throws
            if (time<1 || time>30)
                throw new IllegalArgumentException("Tiempo debe estar entre 1 y 30");
            // Sólo iniciamos el método si hay alguna casilla activa
            if (hayCasillasActivas()) {
                activo=true;
                // despierto el contador para que inicie la cuenta
                contador=time+1;
                // Aquí se crea el reloj
                java.util.Timer reloj = new Timer();
                TimerTask timerTask= new TimerTask(){
                    public void run(){
                        contador--;
                        setCartelSistema(String.format("Pierdes turno en %02d sg",contador));
                    }
                };
                reloj.scheduleAtFixedRate(timerTask, 0, 1000); // Ejecuta cada segundo
                try {wait(time*1000);} catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!activo) {
                    disableCasilla(fila,columna);
                    setCartelSistema(String.format("Pulsada en %02d,%02d",fila,columna));
                }
                else
                    setCartelSistema("Paso el turno");
                reloj.cancel();
                // Si activo sigue a true no se ha pulsado nada
                try {Thread.sleep(500);} catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            }
            else {
                setCartelSistema("No quedan casillas");
                try {Thread.sleep(500);} catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return false;
            }
        }

        /**
         * Devuelve el número de fila de la casilla pulsada (de 1 a n)
         * @return
         */
        public synchronized int getFila() {
            return fila;
        }

        /**
         * Devuelve el número de columna de la casilla pulsada (de 1 a n)
         * @return
         */
        public synchronized int getColumna() {
            return columna;
        }

        /**
         * Devuelve la letra que está en la casilla pulsada
         * @return
         */
        public synchronized char getLetra() {
            return letra;
        }

        /**
         * Devuelve cierto si se ha pulsado en alguna casilla sin que pase el tiempo de espera
         * @return valor cierto o falso
         */
        public synchronized boolean getPulsado() {
            return !activo;
        }

        /**
         * Escribe <letra> en la casilla seleccionada por fila/columna
         * @param i fila, valores de 1 a n
         * @param j columna, valaores de 1 a n
         * @param letra letra a escribir
         */
        public void writeCasilla(int i,int j,char letra){
            // Utilizo una Exception no checked, por ello no es necesario throws
            if (i<1 || i>n || j<1 || j>n)
                throw new IllegalArgumentException("Parametro i,j entre 1 y "+n);
            i--; // EL usuario usa de 1 a n, en la clase de 0 a n-1
            j--;
            botones[i][j].setText(letra+"");
            botones[i][j].setEnabled(false);
            repaint();
        }

        /**
         * Devuelve la letra graba en esa casilla en posición fila/columna
         * En caso de que no se hubiera grabado nada devuelve un espacio
         * @param i Fila de la casilla (valor de 1 a n)
         * @param j Columna de la casilla (valor de 1 a n)
         * @return letra escrita
         */
        public char readCasilla(int i,int j) {
            // Utilizo una Exception no checked, por ello no es necesario throws
            if (i<1 || i>n || j<1 || j>n)
                throw new IllegalArgumentException("Parametro i,j entre 1 y "+n);
            i--;
            j--;
            String texto=botones[i][j].getText();
            if (texto==null||texto.length()==0) return '\0';
            else return texto.charAt(0);
        }

        /**
         * Activa la casilla en esa fila/columna para que se pueda hacer click en ella
         * @param i Fila de la casilla (valor de 1 a n)
         * @param j Columna de la casilla (valor de 1 a n)
         */
        public void enableCasilla(int i,int j) {// Utilizo una Exception no checked, por ello no es necesario throws
            if (i<1 || i>n || j<1 || j>n)
                throw new IllegalArgumentException("Parametro i,j entre 1 y "+n);
            botones[i-1][j-1].setEnabled(true);
        }

        /**
         * Desactiva la casilla en esa fila/columna, ya no se podrá hacer click en ella
         * @param i Fila de la casilla (valor de 1 a n)
         * @param j Columna de la casilla (valor de 1 a n)
         */
        public void disableCasilla(int i,int j) {
            // Utilizo una Exception no checked, por ello no es necesario throws
            if (i<1 || i>n || j<1 || j>n)
                throw new IllegalArgumentException("Parametro i,j entre 1 y "+n);
            botones[i-1][j-1].setEnabled(false);
        }

        // Gestión de eventos: Gestiona el click sobre las casillas
        @Override
        public void actionPerformed(ActionEvent e){
            synchronized(this){
                if (activo){
                    activo=false;
                    String [] aux=(e.getActionCommand()).split("-");
                    fila=Integer.parseInt(aux[0]);
                    columna=Integer.parseInt(aux[1]);
                    // Si no hay nada devuelvo el caracter '\0'
                    String contenido=botones[fila-1][columna-1].getText();
                    letra=contenido.length()>0?contenido.charAt(0):'\0';
                    notifyAll();
                }
            }
        }

        /**
         * Cambio el título de la ventana
         * @param cartel Título nuevo
         */
        public void setTitulo(String cartel){
            setTitle(cartel);
        }

        /**
         * Cambio el cartel de usuario, puedes poner el mensaje que quieras
         * @param cartel Nuevo mensaje a poner
         */
        public void setCartelUsuario(String cartel) {
            cartelUsuario.setText(cartel);
        }

        // Cambio el cartel de sistema
        private void setCartelSistema(String cartel) {
            cartelSistema.setText("SISTEMA: "+cartel);
        }

    }
