package com.exia.jsim.controller.event.window;

import com.exia.jsim.view.Cell;
import com.exia.jsim.view.Grid;
import com.exia.jsim.view.menu.ElementMenu;
import com.exia.jsim.view.menu.InfoMenu;
import com.exia.jsim.view.menu.OptionMenu;
import com.exia.jsim.view.menu.SimulationMenu;
import com.exia.jsim.view.window.DimWindow;
import com.exia.jsim.view.window.Window;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
/**
 *
 * @author Quentin
 */
public class EventDimWindow implements ActionListener {

    private DimWindow mDimWindow;
    
    public EventDimWindow (DimWindow dimWindow) {
        super();
        this.mDimWindow = dimWindow;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
       
        if(source == this.mDimWindow.getBtnNext())
        {
             Window window = new Window("J-Sim Forest", 1000, 1000);
             this.mDimWindow.setGridWidth(Integer.parseInt(this.mDimWindow.getTfWidth()));
             this.mDimWindow.setGridHeight(Integer.parseInt(this.mDimWindow.getTfHeight()));
             Cell cellTemp = new Cell(0, 0, 0);
             Grid grid = new Grid(this.mDimWindow.getGridWidth(), this.mDimWindow.getGridHeight(), window);
             grid.initGrid(window, grid.getScrollContent(), cellTemp);

             JPanel generalContent = new JPanel();
             generalContent.setLayout(new BorderLayout());
             SimulationMenu simulation = new SimulationMenu(grid);
             ElementMenu element = new ElementMenu(grid, cellTemp);
             InfoMenu info = new InfoMenu();
             OptionMenu option = new OptionMenu();


             generalContent.add(grid.getScrollContent(), BorderLayout.CENTER);
             generalContent.add(simulation.getContent(), BorderLayout.NORTH);
             generalContent.add(element.getContent(), BorderLayout.WEST);
             generalContent.add(info.getContent(), BorderLayout.SOUTH);
             generalContent.add(option.getContent(), BorderLayout.EAST);


             window.setContentPane(generalContent);
             window.pack();
             window.setVisible(true);
 
             window.setVisible(true);
               
             this.mDimWindow.dispose();
        }  
    }
    
}
