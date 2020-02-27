package edu.escuelaing.arep.app.iniciador;

import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import edu.escuelaing.arep.app.puerto.Puerto;

public class IniciadorThreadServer {

    int puerto;
    ServerSocket socketServidor;
    private Map<String, Method> mapeoURL = new HashMap<String, Method>();
    private ExecutorService executorService;

    public IniciadorThreadServer(int numeroThreads){

        puerto = Puerto.getPuerto();
        mapeoURL = ManejadorAnotaciones.getPathClase();
        executorService = Executors.newFixedThreadPool(numeroThreads);
        
    }







}