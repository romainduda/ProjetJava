package com.exia.jsim.view.window;
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
*
* @author Amandine
*/
public class OpenWindow extends JDialog implements ActionListener{
    private int mWidth = 400;
    private int mHeight = 400;
    private String mTitle = "J-Sim Forest";
    private Box mBox;
    private ImageIcon mImage = null;
    private JButton mButtonCreate;
    private JButton mButtonOpen;
    private JLabel mLabelVide;
   
    public OpenWindow(){
       super();
       init();
      
    }
   
    public void init(){
       
       this.setTitle(this.mTitle);
       this.setSize(this.mWidth, this.mHeight);
       this.setBackground(Color.WHITE);
       this.setResizable(false);
       this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       this.setLocationRelativeTo(null);
      
       Container contenu = getContentPane();
      
       this.mBox = Box.createVerticalBox();
      
       contenu.setBackground(Color.WHITE);
       contenu.add(this.mBox);
      
      
       this.mBox.add(Box.createVerticalStrut(20));
      
       this.mImage = new ImageIcon("img.jpg");
       this.mLabelVide = new JLabel(mImage);
       this.mLabelVide.setAlignmentX(Component.CENTER_ALIGNMENT);
       this.mBox.add(mLabelVide);
      
       this.mBox.add(Box.createVerticalGlue());
      
       this.mButtonCreate = new JButton("Nouveau");
       this.mButtonCreate.setAlignmentX(Component.CENTER_ALIGNMENT);
       this.mButtonCreate.addActionListener(this);
       this.mBox.add(mButtonCreate);
      
       this.mBox.add(Box.createVerticalStrut(10));
      
       this.mButtonOpen = new JButton("Charger");
       this.mButtonOpen.setAlignmentX(Component.CENTER_ALIGNMENT);
       this.mButtonOpen.addActionListener(this);
       this.mBox.add(mButtonOpen);
      
       this.mBox.add(Box.createVerticalStrut(20));
      
       
       
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if(source == this.mButtonCreate)
        {
            new DimWindow();
            this.dispose();
        }
       
        if(source == this.mButtonOpen)
        {
            new LoadWindow();
            this.dispose();
        }
    }
   
 
}