package com.exia.jsim.controller.event;

import com.exia.jsim.view.Cell;
import com.exia.jsim.view.Grid;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseListener;
/**
 *
 * @author Quentin
 */
public class MouseEvent implements MouseListener {
    
    private Grid mGrid;
    private Cell mCellTemp;
    
    public MouseEvent(Grid grid, Cell cellTemp) {
        super();
        this.mGrid = grid;
        this.mCellTemp = cellTemp;
    }
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        Point cellLocation = this.mGrid.getCells()[0][0].getLocation();
        int mouseX = e.getX()-(int)cellLocation.getX();
        int mouseY = e.getY()-(int)cellLocation.getY();
        
        this.mGrid.getCells()[mouseX/12][mouseY/12].setState(this.mCellTemp.getState());
        if(this.mGrid.getCells()[mouseX/12][mouseY/12].getState() == 0) {
            this.mGrid.getCells()[mouseX/12][mouseY/12].setBackground(Color.white);
            this.mGrid.getCells()[mouseX/12][mouseY/12].repaint();
        } else if(this.mGrid.getCells()[mouseX/12][mouseY/12].getState() == 1) {
            this.mGrid.getCells()[mouseX/12][mouseY/12].setBackground(Color.decode("#92d050"));
            this.mGrid.getCells()[mouseX/12][mouseY/12].repaint();
        } else if(this.mGrid.getCells()[mouseX/12][mouseY/12].getState() == 2) {
            this.mGrid.getCells()[mouseX/12][mouseY/12].setBackground(Color.decode("#339933"));
            this.mGrid.getCells()[mouseX/12][mouseY/12].repaint();
        } else if(this.mGrid.getCells()[mouseX/12][mouseY/12].getState() == 4) {
            this.mGrid.getCells()[mouseX/12][mouseY/12].setBackground(Color.decode("#004800"));
            this.mGrid.getCells()[mouseX/12][mouseY/12].repaint();
        } else if(this.mGrid.getCells()[mouseX/12][mouseY/12].getState() == 5) {
            this.mGrid.getCells()[mouseX/12][mouseY/12].setBackground(Color.decode("#ff0000"));
            this.mGrid.getCells()[mouseX/12][mouseY/12].repaint();
        } else if(this.mGrid.getCells()[mouseX/12][mouseY/12].getState() == 7) {
            this.mGrid.getCells()[mouseX/12][mouseY/12].setBackground(Color.decode("#7030a0"));
            this.mGrid.getCells()[mouseX/12][mouseY/12].repaint();
        }
        
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {}

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {}

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {}

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {}
    
}
