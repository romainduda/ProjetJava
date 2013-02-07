package com.exia.jsim.view;

import com.exia.jsim.controller.event.MouseEvent;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Quentin
 */
public class Grid {
    
    private int mWidth;
    private int mHeight;
    private JFrame mWindow;
    private JPanel mContent;
    private JPanel mScrollContent;
    private JScrollPane mScroll;
    private Cell[][] mCells;
    
    public Grid(int width, int height, JFrame window) {
        this.mWidth = width;
        this.mHeight = height;
        this.mWindow = window;
        
        this.mContent = new JPanel();
        this.mScrollContent = new JPanel(new BorderLayout());
        
        this.mScroll = new JScrollPane(this.mContent);
        this.mScroll.getVerticalScrollBar().setUnitIncrement(16);
        this.mScroll.getHorizontalScrollBar().setUnitIncrement(16);
        this.mScrollContent.add(this.mScroll);
        this.mWindow.add(this.mScrollContent, BorderLayout.CENTER); 
        
        mContent.setBackground(Color.WHITE);
        // Layout Manager
        mContent.setLayout(new GridBagLayout());
        // Objet servant à positionner les composants
        
        
    }

    public JPanel getScrollContent() {
        return this.mScrollContent;
    }
    
    public void setCells(Cell[][] cells) {
        this.mCells = cells;
    }
    
    public Cell[][] getCells() {
        return this.mCells;
    }
    
    public int getWidth(){
        return this.mWidth;
    }
    
    public int getHeight(){
        return this.mHeight;
    }
    
    public void refresh() {
        this.mContent.removeAll();
        this.mContent.setBackground(Color.WHITE);
        this.mContent.setLayout(new GridBagLayout());
        for(int x=0; x<this.mWidth; x++)
        {   
            for(int y=0; y<this.mHeight; y++)
            {
                int cellState = this.mCells[x][y].getState();
                switch(cellState) {
                    case 0:
                        this.mCells[x][y].setBackground(Color.white);
                        break;
                   case 1:
                        this.mCells[x][y].setBackground(Color.decode("#92d050"));
                        break;
                   case 2:
                        this.mCells[x][y].setBackground(Color.decode("#339933"));
                        break;
                   case 3:
                        this.mCells[x][y].setBackground(Color.decode("#339933"));
                        break;
                   case 4:
                        this.mCells[x][y].setBackground(Color.decode("#004800"));
                        break;
                   case 5:
                        this.mCells[x][y].setBackground(Color.decode("#ff0000"));
                        break;
                   case 6:
                        this.mCells[x][y].setBackground(Color.gray);
                        break;
                   case 7:
                        this.mCells[x][y].setBackground(Color.decode("#7030a0"));
                        break;
                }
                 this.mContent.add(this.mCells[x][y]);
                 this.mContent.repaint();
            } 
        }
    }
    
    public void initGrid(JFrame window, JPanel content, Cell cellTemp) {
        GridBagConstraints gbc = new GridBagConstraints();
        // Case de Départ
        gbc.gridx = 0;
        gbc.gridy = 0;
        // informe le layout que c'est la fin de la ligne
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        //Taille de la cellule
        gbc.gridheight = 1;
        gbc.gridwidth = 1;       
        // on parcourt le layout pour créer les cellules de chaque Cases
        this.mCells = new Cell[this.mWidth][this.mHeight]; //Création de l'objet Cellule
        for(int x=0; x<this.mWidth; x++)
        {
            gbc.gridx = x;
            
            for(int y=0; y<this.mHeight; y++)
            {
               gbc.gridy = y ;
               this.mCells[x][y] = new Cell(x, y, 0); //Création de l'objet Cellule               
               this.mCells[x][y].setBackground(Color.white); // Couleur de la cellule
               
               this.mContent.add(this.mCells[x][y], gbc); // ajout de la cellule
               this.mContent.addMouseListener(new MouseEvent(this, cellTemp));
            } 
        }
        window.setContentPane(content);
    }

    
}
