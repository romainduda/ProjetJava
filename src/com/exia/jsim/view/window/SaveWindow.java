package com.exia.jsim.view.window;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Hk
 */
public class SaveWindow extends JDialog {
    
    private JPanel mSaveMenu;
    private JTextField mSaveName = new JTextField();
    private JButton mBtnSave = new JButton();
    private JButton mBtnCancel = new JButton();
   
    public SaveWindow()
    {
     JDialog saveWindow = new JDialog();
     saveWindow.setTitle("Sauvegarder");
     saveWindow.setSize(390, 100);
     GridBagConstraints gbc;
     saveWindow.setLocationRelativeTo(null);
     saveWindow.setModal(rootPaneCheckingEnabled);
     saveWindow.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
             
     this.mSaveMenu = new JPanel();
     this.mSaveMenu.setLayout(new GridBagLayout());
     JLabel NameSave = new JLabel("Nom de la sauvegarde :");
     
     this.mBtnSave = new JButton("Sauvegarder");
     this.mBtnSave.setPreferredSize(new Dimension(120, 35));
     this.mBtnCancel = new JButton("Annuler");
     this.mBtnCancel.setPreferredSize(new Dimension(120, 35));
     this.mSaveName = new JTextField();
      this.mSaveName.setPreferredSize(new Dimension(200, 20));
     
    gbc = new GridBagConstraints();
     gbc.gridx = 0;
     gbc.gridy = 1;
     gbc.gridwidth = 1;
     gbc.gridheight = 1;
     gbc.weightx = 25;
     gbc.weighty = 25;
     this.mSaveMenu.add(NameSave, gbc);
      //--------------------------------------------//
      gbc = new GridBagConstraints();
     gbc.gridx = 1;
     gbc.gridy = 1;
     gbc.gridwidth = 1;
     gbc.gridheight = 1;
     gbc.weightx = 25;
     gbc.weighty = 25;
     this.mSaveMenu.add(this.mSaveName, gbc);
      //--------------------------------------------//
     gbc = new GridBagConstraints();
     gbc.gridx = 0;
     gbc.gridy = 2;
     gbc.gridwidth = 1;
     gbc.gridheight = 1;
     gbc.weightx = 25;
     gbc.weighty = 25;
     this.mSaveMenu.add(this.mBtnSave, gbc); 
     //--------------------------------------------//
     gbc = new GridBagConstraints();
     gbc.gridx = 1;
     gbc.gridy = 2;
     gbc.gridwidth = 1;
     gbc.gridheight = 1;
     gbc.weightx = 25;
     gbc.weighty = 25;
     this.mSaveMenu.add(this.mBtnCancel, gbc);  
     
     saveWindow.add(this.mSaveMenu);
     saveWindow.setVisible(true);
    }


    
}
