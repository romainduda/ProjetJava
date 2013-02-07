package com.exia.jsim.controller.event.menu;

import com.exia.jsim.controller.Simulation;
import com.exia.jsim.view.Grid;
import com.exia.jsim.view.menu.SimulationMenu;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Quentin
 */
public class EventSimulationMenu implements ActionListener {

    private SimulationMenu mSimulationMenu;
    private Simulation mSimulation;
    private Grid mGrid; 
    
    public EventSimulationMenu(SimulationMenu simulationMenu, Grid grid) {
        super();
        this.mSimulationMenu = simulationMenu;
        this.mSimulation = new Simulation(grid);
        this.mGrid = grid;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mSimulationMenu.getBtnPlay()) {
            for(int x=0; x<mSimulationMenu.getNbrStep(); x++) {
                this.mSimulation.growth();
                this.mSimulation.burn();
                this.mSimulation.infect();
                try {
                    Thread.sleep(1000);
                    this.mGrid.refresh();
                } catch (InterruptedException ex) {
                    Logger.getLogger(EventSimulationMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(e.getSource() == mSimulationMenu.getBtnPause()) {}
        if(e.getSource() == mSimulationMenu.getBtnStep()) {
            this.mSimulation.growth();
            this.mGrid.refresh();
            this.mSimulation.burn();
            this.mGrid.refresh();
            this.mSimulation.infect();
            this.mGrid.refresh();
        }
    }
  
}
