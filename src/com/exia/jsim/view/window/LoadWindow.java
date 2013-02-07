package com.exia.jsim.view.window;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.exia.jsim.model.GridDAO;
/**
*
* @author Amandine
*/
public class LoadWindow extends JFrame implements ActionListener, ItemListener{
    private int mWidth = 300;
    private int mHeight = 300;
    private String mTitle = "J-Sim Forest";
    private Box mBox;
    private JComboBox mCombo;
    private JButton mButtonOpen;
    
    private String[] mSaved = {"saved 1", "saved 2"};
   
    
    public LoadWindow(){
        super();
        init();
       
    }
   
 
    public void init(){
       
        this.setTitle(this.mTitle);
        this.setSize(this.mWidth, this.mHeight);
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       
        Container contenu = getContentPane();
        this.mBox = Box.createHorizontalBox();
       
        contenu.setBackground(Color.WHITE);
        contenu.add(this.mBox);
       
        this.mBox.add(Box.createHorizontalStrut(20));
       
        this.mCombo = new JComboBox(mSaved);
        this.mCombo.setEditable(false);
        this.mCombo.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.mCombo.setMaximumSize(new Dimension(150,30));
        this.mBox.add(this.mCombo);
        this.mCombo.addActionListener(this);
        this.mCombo.addItemListener(this);
       
        this.mBox.add(Box.createHorizontalStrut(20));
       
        this.mButtonOpen = new JButton("Charger");
        this.mButtonOpen.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.mBox.add(this.mButtonOpen);
        this.mButtonOpen.addActionListener(this);
       
        this.mBox.add(Box.createHorizontalStrut(20));
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
 
    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}