package com.exia.jsim.view.menu;

import com.exia.jsim.controller.event.menu.EventSimulationMenu;
import com.exia.jsim.view.Grid;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author Hk
 */
public class SimulationMenu implements ActionListener{
    
    private JPanel mSimulationContent;
    private JButton mBtnPlay;
    private JButton mBtnPause;
    private JButton mBtnStep;
    private JLabel mLblNbrStep;
    private JTextField mTfNbrLabel;
    private JSlider mSpeed = new JSlider();
    
    static final int STEP_MIN = 0;
    static final int STEP_MAX = 30;
    static final int STEP_INIT = 15;
    
    public SimulationMenu(Grid grid) 
    {
        this.mSimulationContent = new JPanel(); 
        this.mSimulationContent.setLayout(new FlowLayout());
        
        // -----------------------------------------------------------------//
        this.mBtnPlay = new JButton("Play");
        this.mBtnPlay.addActionListener(new EventSimulationMenu(this, grid));
          // -----------------------------------------------------------------//
         this.mBtnPause = new JButton("Pause");
         this.mBtnPause.addActionListener(new EventSimulationMenu(this, grid));
         // -----------------------------------------------------------------//
         this.mBtnStep = new JButton("Avancer d'un pas");
         this.mBtnStep.addActionListener(new EventSimulationMenu(this, grid));
         // -----------------------------------------------------------------//
         this.mLblNbrStep = new JLabel("Nombre pas :");
         this.mTfNbrLabel = new JTextField();
         this.mTfNbrLabel.setColumns(2);
         // -----------------------------------------------------------------//
         this.mSpeed = new JSlider(JSlider.HORIZONTAL,  STEP_MIN, STEP_MAX, STEP_INIT);
         this.mSpeed.setMajorTickSpacing(15);
         this.mSpeed.setMinorTickSpacing(2);
         this.mSpeed.setPaintTicks(true);
         this.mSpeed.setPaintLabels(true);
         Font font = new Font("Helvetica", Font.ITALIC, 11);
         mSpeed.setFont(font);
         this.mSpeed.addChangeListener(new ChangeListener()
         {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.print("Valeur actuelle : " +
                ((JSlider)e.getSource()).getValue()); }
        });
         
        
        this.mSimulationContent.add(this.mBtnPlay);
        this.mSimulationContent.add(this.mBtnPause);
        this.mSimulationContent.add(this.mBtnStep);
        this.mSimulationContent.add(this.mLblNbrStep);
        this.mSimulationContent.add(this.mTfNbrLabel);
        this.mSimulationContent.add(this.mSpeed);

        
    }
    
    public JPanel getContent() {
        return this.mSimulationContent;
    }
    
    public JButton getBtnPlay() {
        return this.mBtnPlay;
    }
    
    public JButton getBtnPause() {
        return this.mBtnPause;
    }
    
    public int getNbrStep() {
        return (Integer.parseInt(this.mTfNbrLabel.getText()));
    }
    
    public JButton getBtnStep() {
        return this.mBtnStep;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
