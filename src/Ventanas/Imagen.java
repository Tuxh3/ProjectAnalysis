/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Tuxh
 */
public class Imagen extends JPanel {
    private Image img;
    public Imagen(Image img) {
        this.img = img;
        Dimension dimension = new Dimension(img.getWidth(null), img.getHeight(this));
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
    
}
