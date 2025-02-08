package examenes.matrices.anulado.correcciones.alumno659727;

public class Ejercicio3 {
    public static void main(String[] args) {
        //No funciona porque solo hace el turno de las O
        Tablero t=new Tablero(4);
        //He eliminado el char turno porque al final no lo utilicé
        int pulsado_x=0;
        int pulsado_o=0;
        while (t.nextCasilla(1)) {
            //En las funciones no pase el tablero como parámetro para función pero es necesario
            pulsado_x=juegox(pulsado_x,t);//en el escrito tache el pulsado_x=juegox...
                                        // pero no tenia que haberlo quitado, aunque hay mejores formas de hacerlo
            pulsado_o=juegoo(pulsado_o,t);
        }
        if (pulsado_x>pulsado_o)
            t.setCartelUsuario("Gana jugador X");
        else if(pulsado_o>pulsado_x)
            t.setCartelUsuario("Gana el jugador O");
        else
            t.setCartelUsuario("Empate");
        t.close();
        }
    private static int juegox(int pulsaciones, Tablero t){
        if (t.getPulsado()){
            int fila=t.getFila();
            int columna=t.getColumna();
            t.writeCasilla(fila,columna,'X');
            return(pulsaciones+1);
        }
        else
            return pulsaciones;
    }

    private static int juegoo(int pulsaciones, Tablero t){
        if (t.getPulsado()){
            int fila=t.getFila();
            int columna=t.getColumna();
            t.writeCasilla(fila,columna,'O');
            return(pulsaciones+1);
        }
        else
            return pulsaciones;
    }
    }

