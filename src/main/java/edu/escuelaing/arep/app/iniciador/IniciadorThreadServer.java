package edu.escuelaing.arep.app.iniciador;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import edu.escuelaing.arep.app.puerto.Puerto;
import edu.escuelaing.arep.app.servidor.Servidor;

public class IniciadorThreadServer {

    int puerto;
    ServerSocket socketServidor;
    private Map<String, Method> mapeoURL = new HashMap<String, Method>();
    private ExecutorService executorService;
    private boolean bandera;

    public IniciadorThreadServer(int numeroThreads) throws IOException {

        puerto = Puerto.getPuerto();
        socketServidor = new ServerSocket(puerto);
        mapeoURL = ManejadorAnotaciones.getPathClase();
        executorService = Executors.newFixedThreadPool(numeroThreads);
        bandera = true;
        
    }


    public void Iniciar(){
        while (bandera) {
            try {
                executorService.execute(new Servidor(mapeoURL, socketServidor));
            } catch (IOException e) {
                executorService.shutdown();
            }
        }
    }






}