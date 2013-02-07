/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exia.jsim.model;

import java.sql.*;



/**
 *
 * @author Romain
 */
public class Connect  {
    
   
    private Connection con;
    
    

    public Connect(Connect con) {
        
    }
    public Connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("ok 1");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("classe de connection non trouvée");
        }
        
        try
        {    
            String url = "jdbc:mysql://localhost/jsim_db";
            this.con = DriverManager.getConnection(url, "root", "");
            System.out.println("ok 2");
            
        }
        catch(SQLException e)
        {
            System.out.println("connexion non réussie");
        }
    }
    
    
    public void disconnect()
    {
        try
        {
        this.con.close();
                }
        catch (SQLException e)
        {
            System.out.println("erreur fermeture connexion");
        }  
    }
    
    
    public Connection getCon()
    {
        return this.con;
    }
    
    

}

    
