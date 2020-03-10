package edu.escuelaing.arep.app.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase{

    public static String InicializarDataBase()
    {
        String res = "";
        try {  
            Class.forName("org.postgresql.Driver");
            String host = "ec2-52-202-185-87.compute-1.amazonaws.com";
            String database = "d8034dh4j9kgqd";
            String port = "5432";
            String user = "xkpkuliigtmwfy";
            String passwd = "9c391d9b069e561fecd88d75a893c97f487885d6b78533d97b4bf81733f6b4f7";
            Connection con = DriverManager.getConnection( "jdbc:postgresql://"+ host + ":" + port + "/" + database, user, passwd);
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from editores");
            int i = 0;
            while(rs.next()){
                res += "Line" + i + ": " + rs.getInt(1) + "  " + rs.getString(2) + "</br>";
                i++;
            }
                
            con.close();  
        } catch(Exception e) { 
            System.out.println(e);
        }
        return res;
    }

}