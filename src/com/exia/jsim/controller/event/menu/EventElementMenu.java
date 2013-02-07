package com.exia.jsim.controller.event.menu;

import com.exia.jsim.view.Cell;
import com.exia.jsim.view.Grid;
import com.exia.jsim.view.menu.ElementMenu;
import java.awt.event.*;
/**
 *
 * @author Quentin
 */
public class EventElementMenu implements ActionListener {

    private ElementMenu mElementMenu;
    private Grid mGrid; 
    private Cell mCellTemp;
    
    public EventElementMenu(ElementMenu elementMenu, Grid grid, Cell cellTemp) {
        super();
        this.mElementMenu = elementMenu;
        this.mGrid = grid;
        this.mCellTemp = cellTemp;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mElementMenu.getBtnErase()) {
            this.mCellTemp.setState(0);
        }
        if(e.getSource() == mElementMenu.getBtnSapling()) {
            this.mCellTemp.setState(1);
        }
        if(e.getSource() == mElementMenu.getBtnBush()) {
            this.mCellTemp.setState(2);
        }
        if(e.getSource() == mElementMenu.getBtnTree()) {
            this.mCellTemp.setState(4);
        }
        if(e.getSource() == mElementMenu.getBtnFire()) {
            this.mCellTemp.setState(5);
        }
        if(e.getSource() == mElementMenu.getBtnBug()) {
            this.mCellTemp.setState(7);
        }
    }
    
    

   
}
