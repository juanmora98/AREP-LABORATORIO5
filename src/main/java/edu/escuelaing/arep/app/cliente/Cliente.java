package edu.escuelaing.arep.app.cliente;

import java.io.*;
import java.net.*;



public class Cliente implements Runnable { 

  //Atributos
  private String pagina;
  private long tiempo;


public Cliente(String pagina, long tiempo){
  this.pagina = pagina;
  this.tiempo = tiempo;
}



  @Override
  public void run() {

    try {
      AnalisisPagina();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }


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