package edu.escuelaing.arep.app.cliente;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IniciadorThreadsCliente{

    private ExecutorService executorService;
    public int tamanioPool;

    public IniciadorThreadsCliente(int tamanioPool) {
        executorService = Executors.newFixedThreadPool(tamanioPool);
        this.tamanioPool = tamanioPool;
      }
    
      public void Iniciar(String args) {
          long tiempoDuracion = System.nanoTime();
          for (int i = 0; i < tamanioPool; i++) {
            executorService.execute(new Cliente(args, tiempoDuracion));
          }
          executorService.shutdown();
      }


}