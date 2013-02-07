package com.exia.jsim.view.menu;

import com.exia.jsim.controller.event.menu.EventElementMenu;
import com.exia.jsim.view.Cell;
import com.exia.jsim.view.Grid;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author Quentin
 */
public class ElementMenu {
    
    private JPanel mElementContent;
    private JButton mBtnSapling;
    private JButton mBtnBush;
    private JButton mBtnTree;
    private JButton mBtnFire;
    private JButton mBtnBug;
    private JButton mBtnErase;
    private Box Box;

    public ElementMenu(Grid grid, Cell cellTemp) {
        this.mElementContent = new JPanel();
        Box = Box.createVerticalBox();
        this.mElementContent.add(Box);

        JLabel plant = new JLabel("  Elements Forestier :");
        // -----------------------------------------------------------------//
        this.mBtnSapling = new JButton("Jeune Pousse");
        this.mBtnSapling.setBackground(Color.decode("#92d050"));
        this.mBtnSapling.addActionListener(new EventElementMenu(this, grid, cellTemp));
        // -----------------------------------------------------------------//
        this.mBtnBush = new JButton("Arbuste");
        this.mBtnBush.setBackground(Color.decode("#339933"));
        this.mBtnBush.addActionListener(new EventElementMenu(this, grid, cellTemp));
        // -----------------------------------------------------------------//
        this.mBtnTree = new JButton("Arbre");
        this.mBtnTree.setBackground(Color.decode("#004800"));
        this.mBtnTree.addActionListener(new EventElementMenu(this, grid, cellTemp));
        
                      // -----------------------------------------------------------------//
                     // -----------------------------------------------------------------//
        
        JLabel hazard = new JLabel("  Risques :");
         // -----------------------------------------------------------------//
        this.mBtnFire = new JButton("Feu");
        this.mBtnFire.setBackground(Color.decode("#ff0000"));
        this.mBtnFire.addActionListener(new EventElementMenu(this, grid, cellTemp));
       // -----------------------------------------------------------------//
        this.mBtnBug = new JButton("Insectes");
        this.mBtnBug.setBackground(Color.decode("#7030a0"));
        this.mBtnBug.addActionListener(new EventElementMenu(this, grid, cellTemp));
       // -----------------------------------------------------------------//       
        this.mBtnErase= new JButton("Effacer");
        this.mBtnErase.setBackground(Color.white);
        this.mBtnErase.addActionListener(new EventElementMenu(this, grid, cellTemp));
          
          
         Box.add(Box.createVerticalStrut(25));
         Box.add(plant);
         Box.add(Box.createVerticalStrut(25));
        //--------------------------------------------//
        Box.add(this.mBtnSapling);
        Box.add(Box.createVerticalStrut(2));
        Box.add(this.mBtnBush);
        Box.add(Box.createVerticalStrut(2));
        Box.add(this.mBtnTree);
        Box.add(Box.createVerticalStrut(25));
       // -----------------------------------------------------------------//     
        Box.add(hazard); 
        Box.add(Box.createVerticalStrut(25));
        Box.add(this.mBtnFire); 
        Box.add(Box.createVerticalStrut(2));
        Box.add(this.mBtnBug);
        Box.add(Box.createVerticalStrut(2));
        // -----------------------------------------------------------------//
        Box.add(this.mBtnErase);
    }
    
    public JPanel getContent() {
        return this.mElementContent;
    }

    public JButton getBtnErase() {
        return this.mBtnErase;
    }

    public JButton getBtnSapling() {
        return this.mBtnSapling;
    }

    public JButton getBtnBush() {
        return this.mBtnBush;
    }

    public JButton getBtnTree() {
        return this.mBtnTree;
    }
    
    public JButton getBtnFire() {
        return this.mBtnFire;
    }

    public JButton getBtnBug() {
        return this.mBtnBug;
    }
}
