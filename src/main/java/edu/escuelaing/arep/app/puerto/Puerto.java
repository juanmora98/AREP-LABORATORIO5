package edu.escuelaing.arep.app.puerto;




public class Puerto{


    /**
     * Metodo encargado de encontrar el puerto por el que se ara la conexion
     * @return int que es el puerto para realizar la conexion
     */
    public static int getPuerto(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
         }
        return 4567;
    }


}