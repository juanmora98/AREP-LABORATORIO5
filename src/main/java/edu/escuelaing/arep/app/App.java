package edu.escuelaing.arep.app;

import java.io.IOException;

import edu.escuelaing.arep.app.iniciador.IniciadorThreadServer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException
    {
        IniciadorThreadServer iniciadorThreadServer = new IniciadorThreadServer(30);
        iniciadorThreadServer.Iniciar();
    }
}
