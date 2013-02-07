package com.exia.jsim.view.menu;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Hk
 */
public class InfoMenu {
    
    private JPanel mInfoContent;
    
    public InfoMenu()
    {
        this.mInfoContent = new JPanel();
        this.mInfoContent.setLayout(new FlowLayout());

        JLabel  Sapling = new JLabel(" Jeune Pousse :  ");
        JLabel  Bush = new JLabel(" Arbuste :  ");
        JLabel  Tree = new JLabel("Arbre : ");
        JLabel Fire = new JLabel("Incendi :");
        JLabel Bug = new JLabel("Insecte :");
        JLabel Step = new JLabel("Pas Actuel :");
        // -----------------------------------------------------------------//
       JLabel NbrSapling = new JLabel("nbr1   ||");
       JLabel NbrBush = new JLabel("nbr2    ||");
       JLabel  NbrTree = new JLabel("nbr3    ||");
       JLabel NbrFire = new JLabel("nbr4    ||");
       JLabel NbrBug = new JLabel("nbr5    ");
       JLabel NbrStep = new JLabel("nbr6    ||");
        // -----------------------------------------------------------------// 
       

       this.mInfoContent.add(Step);
       this.mInfoContent.add(NbrStep);
       this.mInfoContent.add(Sapling);
       this.mInfoContent.add(NbrSapling);
       this.mInfoContent.add(Bush);
       this.mInfoContent.add(NbrBush);
       this.mInfoContent.add(Tree);
       this.mInfoContent.add(NbrTree);
       this.mInfoContent.add(Fire);
       this.mInfoContent.add(NbrFire);
       this.mInfoContent.add(Bug);
       this.mInfoContent.add(NbrBug);
     

       
    }
    
    public JPanel getContent() {
        return this.mInfoContent;
    }
    
}
