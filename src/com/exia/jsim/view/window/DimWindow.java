package com.exia.jsim.view.window;
 
import com.exia.jsim.controller.event.window.EventDimWindow;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
/**
*
* @author Amandine
*/
public class DimWindow extends JDialog{
    private int mWidth = 400;
    private int mHeight = 300;
    private String mTitle = "J-Sim Forest";
    private JTextField mTFHeight;
    private JTextField mTFWidth;
    private JButton mButtonNext;
    private JLabel mLabelPresentation;
    private JLabel mLabelHeight;
    private JLabel mLabelWidth;
   
    public int mTFheight;
    public int mTFwidth;
   
    
    
    public DimWindow ()
    {
        super();
        init();
    }
   
    public void init(){
       
       this.setTitle(this.mTitle);
       this.setSize(mWidth, mHeight);
       this.setBackground(Color.WHITE);
       this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setVisible(true);
       
        GridBagLayout Grid = new GridBagLayout();
        GridBagConstraints constraint;
        Container contain = getContentPane();
       
        contain.setLayout(Grid);
        // on crée la fiche technique pour le label de présentation
        constraint = new GridBagConstraints();
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.gridwidth = 2;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.NONE;
        constraint.weightx = 20;
        constraint.weighty = 25;
        //Grid.setConstraints(mLabelPresentation, constraint);
       
        this.mLabelPresentation = new JLabel("Entrez la taille de la grille ou garder la taille par défaut");
        contain.add(this.mLabelPresentation, constraint);
       
        //on crée la fiche technique pour le label de la hauteur
        constraint = new GridBagConstraints();
        constraint.gridx = 0;
        constraint.gridy = 1;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.NONE;
        constraint.weightx = 12.5;
        constraint.weighty = 15;
        //Grid.setConstraints(this.mLabelHeight, constraint);
       
        this.mLabelHeight = new JLabel("Hauteur : ");
        contain.add(this.mLabelHeight, constraint);
       
        //on crée la fiche technique pour le textfield de la hauteur
        constraint = new GridBagConstraints();
        constraint.gridx = 1;
        constraint.gridy = 1;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.NONE;
        constraint.weightx = 12.5;
        constraint.weighty = 15;
        //Grid.setConstraints(mTFHeight, constraint);
       
        this.mTFHeight = new JTextField("100");
        contain.add(this.mTFHeight, constraint);
      
        
        //on crée la fiche technique pour le label de la largeur
        constraint = new GridBagConstraints();
        constraint.gridx = 0;
        constraint.gridy = 2;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.NONE;
        constraint.weightx = 12.5;
        constraint.weighty = 15;
        //Grid.setConstraints(mLabelWidth, constraint);
       
        this.mLabelWidth = new JLabel("Largeur : ");
        contain.add(this.mLabelWidth, constraint);
       
        //on crée la fiche technique pour le textfield de la largeur
        constraint = new GridBagConstraints();
        constraint.gridx = 1;
        constraint.gridy = 2;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.NONE;
        constraint.weightx = 12.5;
        constraint.weighty = 15;
        //Grid.setConstraints(mTFWidth, constraint);
       
        this.mTFWidth = new JTextField("100");
        contain.add(this.mTFWidth, constraint);
      
        
        // on crée la fiche technique pour le bouton suivant
        constraint = new GridBagConstraints();
        constraint.gridx = 0;
        constraint.gridy = 3;
        constraint.gridwidth = 2;
        constraint.gridheight = 1;
        constraint.fill = GridBagConstraints.NONE;
        constraint.weightx = 25;
        constraint.weighty = 20;
        //Grid.setConstraints(mButtonNext, constraint);
       
        this.mButtonNext = new JButton("Suivant");
        this.mButtonNext.addActionListener(new EventDimWindow(this));
        contain.add(this.mButtonNext, constraint);
       
       
    }
    
    public JButton getBtnNext() {
        return this.mButtonNext;
    }
    
    public void setGridWidth(int gridWidth) {
        this.mTFwidth = gridWidth;
    }
    
    public int getGridWidth() {
        return this.mTFwidth;
    }
    
    public void setGridHeight(int gridHeight) {
        this.mTFheight = gridHeight;
    }
    
    public int getGridHeight() {
        return this.mTFheight;
    }
    
    public String getTfWidth() {
        return this.mTFWidth.getText();
    }
 
    public String getTfHeight() {
        return this.mTFHeight.getText();
    }
     
}