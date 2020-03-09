package edu.escuelaing.arep.app.cliente;



public class MainCliente{


    public static void main(String[] args) {

        IniciadorThreadsCliente iniciadorThreadsCliente = new IniciadorThreadsCliente(10);
        iniciadorThreadsCliente.Iniciar(args);
        
    }


}