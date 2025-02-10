package examenes.matrices.correcciones.alumno599238;

public class Ejercicio3 {
    public static void main(String[] args) {
        Tablero t=new Tablero(4);
        char turno='x';
        int cuantasX=0;
        int cuantasO=0;
        int fila=0;
        int col=0;
        Boolean hanpulsado=true;
        boolean hayespacio=true;

        t.setTitulo("JUEGO DE LOS CODAZOS");
        do{
            t.setCartelUsuario("le toca a " +turno );
            hayespacio= t.nextCasilla(1);
            hanpulsado=t.getPulsado();
            if(hanpulsado){
                fila=t.getFila();
                col=t.getColumna();
                t.writeCasilla(fila,col,turno);
                if(t.readCasilla(fila,col)=='x'){
                    cuantasX++;
                }
                else{
                    cuantasO++;
                }
                if(!hayespacio){
                    if(cuantasX>cuantasO)
                        t.setCartelUsuario("Ha ganado" + turno);
                }
            }
            turno=turno=='x'?'o':'x';
        }while ((hayespacio));

    }
}
