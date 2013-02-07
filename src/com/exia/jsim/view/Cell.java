package com.exia.jsim.view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
/**
 *
 * @author Quentin
 */
public class Cell extends JPanel{

    private int mX;
    private int mY;
    private int mState;

    public Cell(int x, int y, int state) {
        this.mX = x;
        this.mY = y;
        this.mState = state;
        
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    
    public int getCellX() {
        return this.mX;
    }

    public int getCellY() {
        return this.mY;
    }
    
    public void setState(int state) {
        this.mState = state;
    }
    
    public int getState() {
        return this.mState;
    }
    
    public int[] getStatesArround(Cell[][] cell, int x, int y) {
        int[] statesArround = new int[8];
        if((x-1>=0) && (y-1>=0) && (x+1<10) && (y+1<10)) {
            statesArround[0] = cell[x-1][y-1].getState();
            statesArround[1] = cell[x][y-1].getState();
            statesArround[2] = cell[x+1][y-1].getState();
            statesArround[3] = cell[x-1][y].getState();
            statesArround[5] = cell[x-1][y+1].getState();
            statesArround[4] = cell[x+1][y].getState();
            statesArround[6] = cell[x][y+1].getState();
            statesArround[7] = cell[x+1][y+1].getState();
        }    
        return statesArround;
    }
    
}
