/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdtest;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hewhofades
 */
public class Frame extends JFrame{
    
    public static String title = "Tower Bacon Alpha ";
    public static Dimension size = new Dimension(650, 550);
    
    public Frame(){
        setTitle(title);
        setSize(size);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        init();
    }
    
    public void init(){
        setLayout(new GridLayout(1,1,0,0));
        
        Screen screen = new Screen();
        add(screen);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
