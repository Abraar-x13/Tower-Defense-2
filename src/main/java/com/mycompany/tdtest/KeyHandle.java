/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdtest;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author hewhofades
 */
public class KeyHandle implements MouseMotionListener, MouseListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        Screen.mse = new Point(e.getX() + ((Frame.size.width - Screen.myWidth)/2), (e.getY() + (Frame.size.width - Screen.myWidth)/2));
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Screen.mse = new Point(e.getX() + ((Frame.size.width - Screen.myWidth)/2), (e.getY() + (Frame.size.width - Screen.myWidth)/2));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent m) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
