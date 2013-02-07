package com.exia.jsim.controller;

import com.exia.jsim.view.*;
/**
 *
 * @author Quentin
 */
public class Simulation {
    
    private Grid mGrid;
    
    public Simulation(Grid grid) {
        this.mGrid = grid;
    }
    
    public void growth() {
        Cell[][] cellTemp = this.mGrid.getCells();
        
        for(int a=0; a<this.mGrid.getWidth(); a++) {
            for(int b=0; b<this.mGrid.getHeight(); b++) {
                int[] stateArround = this.mGrid.getCells()[a][b].getStatesArround(this.mGrid.getCells(), a, b);
                int nbrBush = 0;
                int nbrTree = 0;
        
                for(int x=0; x<8; x++) {
                        switch(stateArround[x]) {
                            case 4:
                                nbrTree++;
                                break;
                            case 2:
                                nbrBush++;
                                break;
                            case 3:
                                nbrBush++;
                                break;
                        }
                }

                if(this.mGrid.getCells()[a][b].getState() == 0) {
                    if((nbrTree >= 2) || (nbrBush >= 3) || ((nbrTree >= 1) && ((nbrBush >= 2)))) {
                        cellTemp[a][b].setState(1);
                    }
                } else if(this.mGrid.getCells()[a][b].getState() == 1) {
                    if((nbrTree + nbrBush) <= 3) {
                        cellTemp[a][b].setState(2);
                    }
                } else if(this.mGrid.getCells()[a][b].getState() == 2) {
                    cellTemp[a][b].setState(3);
                } else if(this.mGrid.getCells()[a][b].getState() == 3) {
                    cellTemp[a][b].setState(4);
                }
            }
        }
        this.mGrid.setCells(cellTemp);
    }
    
    
    public void burn() {
         Cell[][] cellTemp = this.mGrid.getCells();
        
        for(int a=0; a<this.mGrid.getWidth(); a++) {
            for(int b=0; b<this.mGrid.getHeight(); b++) {
                int[] stateArround = this.mGrid.getCells()[a][b].getStatesArround(this.mGrid.getCells(), a, b);
                int nbrFire = 0;
                
                for(int x=0; x<8; x++) {
                        if(stateArround[x] == 5) {
                            nbrFire++;
                        }
                }
                
                
                if((nbrFire >= 1) && (this.mGrid.getCells()[a][b].getState() != 5) && (this.mGrid.getCells()[a][b].getState() != 6))
                {
                    if(this.mGrid.getCells()[a][b].getState() == 1) {
                        int random = (int)(Math.random() * (5-1)) + 1;
                        if(random == 1) {
                            cellTemp[a][b].setState(5);
                        }

                    } else if((this.mGrid.getCells()[a][b].getState() == 2) || (this.mGrid.getCells()[a][b].getState() == 3)) {
                        int random = (int)(Math.random() * (3-1)) + 1;
                        if(random == 1) {
                            cellTemp[a][b].setState(5);
                        }
                    } else if(this.mGrid.getCells()[a][b].getState() == 4) {
                        int random = (int)(Math.random() * (5-1)) + 1;
                        if(random != 1) {
                            cellTemp[a][b].setState(5);
                        }
                    }
                } else if(this.mGrid.getCells()[a][b].getState() == 5) {
                    cellTemp[a][b].setState(6);
                } else if(this.mGrid.getCells()[a][b].getState() == 6) {
                    cellTemp[a][b].setState(0);
                }
                
            }
        }
        
        this.mGrid.setCells(cellTemp);
    }
    
    
   public void infect() {
         Cell[][] cellTemp = this.mGrid.getCells();
        
        for(int a=0; a<this.mGrid.getWidth(); a++) {
            for(int b=0; b<this.mGrid.getHeight(); b++) {
                int[] stateArround = this.mGrid.getCells()[a][b].getStatesArround(this.mGrid.getCells(), a, b);
                int nbrBug = 0;
                
                if((stateArround[1] == 7) || (stateArround[3] == 7) || (stateArround[4] == 7) || (stateArround[6] == 7)) {
                     nbrBug++;
                }
                
                
                if((nbrBug >= 1) && (this.mGrid.getCells()[a][b].getState() != 7))
                {
                    if(this.mGrid.getCells()[a][b].getState() == 1) {
                        int random = (int)(Math.random() * (5-1)) + 1;
                        if(random != 1) {
                            cellTemp[a][b].setState(7);
                        }

                    } else if((this.mGrid.getCells()[a][b].getState() == 2) || (this.mGrid.getCells()[a][b].getState() == 3)) {
                        int random = (int)(Math.random() * (3-1)) + 1;
                        if(random == 1) {
                            cellTemp[a][b].setState(7);
                        }
                    } else if(this.mGrid.getCells()[a][b].getState() == 4) {
                        int random = (int)(Math.random() * (5-1)) + 1;
                        if(random == 1) {
                            cellTemp[a][b].setState(7);
                        }
                    }
                } else if(this.mGrid.getCells()[a][b].getState() == 7) {
                    cellTemp[a][b].setState(0);
                }
                
            }
        }
        
        this.mGrid.setCells(cellTemp);
    } 
    
}
