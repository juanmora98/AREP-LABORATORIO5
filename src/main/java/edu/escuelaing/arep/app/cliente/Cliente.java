package edu.escuelaing.arep.app.cliente;

import java.io.*;
import java.net.*;



public class Cliente implements Runnable { 

  //Atributos
  private String[] pagina;


public Cliente(String[] pagina){
  this.pagina = pagina;
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
    URL url = new URL(pagina[0]); 
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) 
    { 
      String inputLine = null; 
      while ((inputLine = reader.readLine()) != null) { 
        System.out.println(inputLine); 
      }

    } catch (IOException x) { 
             System.err.println(x); 
    } 
  }



}