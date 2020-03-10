package edu.escuelaing.arep.app.cliente;

import java.io.*;
import java.net.*;



public class Cliente implements Runnable { 

  //Atributos
  private String pagina;
  private long tiempo;

/**
 * Inicializados de la clase Cliente
 * @param pagina
 * @param tiempo 
 */
public Cliente(String pagina, long tiempo){
  this.pagina = pagina;
  this.tiempo = tiempo;
}



/**
 * Metodo heredado de Runnable en la cual se va a ejecutar al correr el thread
 */
  @Override
  public void run() {

    try {
      AnalisisPagina();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

/**
 * Metodo encargado de mostrar en pantalla el tiempo que duro el thread y asi mismo la info de la pagina
 * @throws MalformedURLException 
 */
  public void AnalisisPagina() throws MalformedURLException {
    URL url = new URL(pagina); 
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) 
    { 
      String inputLine = null; 
      while ((inputLine = reader.readLine()) != null) { 
        System.out.println(inputLine); 
      }

    } catch (IOException x) { 
             System.err.println(x); 
    } 
    
    long tiempoTermino = System.nanoTime();
    System.out.println("Tiempo de ejecucion :" + (double)((tiempoTermino - tiempo) / 1000000000.0));
    
    
  }



}