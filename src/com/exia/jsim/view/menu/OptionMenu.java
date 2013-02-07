package com.exia.jsim.view.menu;


import com.exia.jsim.view.window.SaveWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Hk
 */
public class OptionMenu extends JFrame implements ActionListener {
    
    private JPanel mOptionContent;
    private JButton mBtnSave = new JButton();
    private JButton mBtnReset= new JButton();
    private JButton mBtnLoad= new JButton();
    private JButton mBtnNew = new JButton();
    private Box Box;
    
    public OptionMenu()
    {
        this.mOptionContent = new  JPanel();
        Box = Box.createVerticalBox();
        this.mOptionContent.add(Box);
        
        this.mBtnSave = new JButton("Sauvegarder");
        this.mBtnSave.addActionListener(this);
        this.mBtnReset = new JButton("Réinitialiser");
        this.mBtnLoad = new JButton("Charger");
        this.mBtnNew = new JButton("Nouveau");
      
        Box.add(this.mBtnNew);
        Box.add(Box.createVerticalStrut(2));
        //------------------//
        Box.add(this.mBtnReset);
        Box.add(Box.createVerticalStrut(2));
        //------------------//
        Box.add(this.mBtnSave);
        Box.add(Box.createVerticalStrut(2));
          //------------------//
        Box.add(this.mBtnLoad);

    }
        public JPanel getContent() {
        return this.mOptionContent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == this.mBtnSave)
                {
                    new SaveWindow();
                    this.dispose();
                }
        
    }
    
}
