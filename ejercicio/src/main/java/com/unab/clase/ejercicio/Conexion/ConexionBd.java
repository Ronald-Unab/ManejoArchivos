package com.unab.clase.ejercicio.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionBd {
    
    private Connection con;
    
    public ConexionBd()
    {
    	
    try{
    	Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/imagen","root","root");
        System.out.println("CONECTADO A LA BD");
        
    }catch (Exception e)
    {
        System.out.println("ERROR DE CONEXION A LA BD "+ e);
    }
    }
    public Connection RetornarConexion(){   
        return con;   
    }
    
}