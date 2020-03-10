package edu.escuelaing.arep.app.cliente;



public class MainCliente{


    public static void main(String[] args) {
        int numeroThreads = Integer.parseInt(args[0]);
        IniciadorThreadsCliente iniciadorThreadsCliente = new IniciadorThreadsCliente(numeroThreads);
        iniciadorThreadsCliente.Iniciar("https://secure-garden-73536.herokuapp.com");
        
    }


}