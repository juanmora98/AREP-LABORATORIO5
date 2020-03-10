package edu.escuelaing.arep.app.cliente;



public class MainCliente{


    /**
     * Metodo main para iniciar todo el proceso del cliente y asi iniciar el pool de los threads
     * @param args 
     */
    public static void main(String[] args) {
        int numeroThreads = Integer.parseInt(args[0]);
        IniciadorThreadsCliente iniciadorThreadsCliente = new IniciadorThreadsCliente(numeroThreads);
        iniciadorThreadsCliente.Iniciar("https://secure-garden-73536.herokuapp.com");
        
    }


}