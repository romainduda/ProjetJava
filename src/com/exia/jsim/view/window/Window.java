package com.exia.jsim.view.window;

import javax.swing.JFrame;
/**
 *
 * @author Quentin
 */
public class Window extends JFrame{
    
    private int mWidth;
    private int mHeight;
    private String mTitle;
    
    public Window(String title, int width, int height) {
        this.mTitle = title;
        this.mWidth = width;
        this.mHeight = height;
        this.setTitle(this.mTitle);
        this.setSize(this.mWidth, this.mHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        this.setLocationRelativeTo(null);
    }
    
}
