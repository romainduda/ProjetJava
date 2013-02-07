/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exia.jsim.model;
import com.exia.jsim.view.*;
import com.exia.jsim.view.window.Window;
import java.sql.*;

/**
 *
 * @author Romain
 */
public class GridDAO  {
    private Connection mConnect;
    private Window mWindow;
    private Grid mGrid;
   
    
    public GridDAO(Window window, Grid grid, Connection connect) {
        this.mWindow = window;
        this.mGrid = grid;
        mConnect = connect;
        
    }

    

    
    public void selectSave() throws SQLException
    {
        String sqlSelect = "SELECT name_grid, FROM grid";
        PreparedStatement select = mConnect.prepareStatement(sqlSelect);
        select.executeQuery();
    }
    

    
    
public void loadGrid() throws SQLException 
{
    String sqlLoad = "SELECT * FROM grid WHERE name_grid= ?";
    
    
    PreparedStatement load = mConnect.prepareStatement(sqlLoad);
    load.setString(1, "test2"); 
    ResultSet result = load.executeQuery(sqlLoad);
    
    String name = result.getString(1);
    String state = result.getString(2);
    int height = result.getInt(3);
    int width = result.getInt(4);
    int numberStep = result.getInt(5);
    int speedStep = result.getInt(6);
    int actualStep = result.getInt(7);
    int id = result.getInt(8);
    
    String[] splitArray = null; //tableau de chaînes
  
  splitArray = state.split("");

  for(int i = 0; i< splitArray.length;i++){
   // On affiche chaque élément du tableau
   System.out.println("élement n° " + i + "=[" + splitArray[i]+"]");

  }


}
@Override
    public String toString()
{
    
    
    int height = this.mGrid.getHeight();
    int width = this.mGrid.getWidth();
    String state = "";
    String stateSave = "";
    for (int x=0;x<height;x++)
    {
        for (int y=0;y<width;y++)
        {
            state += this.mGrid.getCells()[x][y].getState(); 
            stateSave = String.valueOf(state);
            
        }
    }
    System.out.println(stateSave);
    return stateSave;
    
}

public void saveGrid() throws SQLException
{
    String sqlSave = "INSERT INTO grid (name_grid,state_grid,height_grid,width_grid,number_step,speed_step,actual_step) VALUES (?,?,?,?,?,?,?) ";
    PreparedStatement statement;
   
    
    String name = "test3"; //relier sur textbox Maxence pour nom sauvegarde
    String saveState = toString();
    int height = mGrid.getHeight();
    int width = mGrid.getWidth();
    int stepNbr = 2; //avec class Step
    int speedStep = 3; //avec class Step
    int actualStep = 1; //avec class Step
    
    statement = mConnect.prepareStatement(sqlSave);


    statement.setObject(1,name); //nom de la grille
    statement.setObject(2,saveState); //états stockés 
    statement.setObject(3,height); //height
    statement.setObject(4,width); //width
    statement.setObject(5,stepNbr); //number of step
    statement.setObject(6,speedStep); //speed of step
    statement.setObject(7,actualStep); //actual step
    try
    {
        statement.executeUpdate();
        System.out.println("Enregistrement réussi");
    }
    catch (SQLException e)
    {
        System.out.println(e);
        System.out.println("Enregistrement non réussi");
    }
}
}
