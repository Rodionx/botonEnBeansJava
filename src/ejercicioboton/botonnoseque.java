/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioboton;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JButton;




public class botonnoseque extends JButton implements Serializable, MouseListener{
  
//    JButton bot1 = new JButton();
//    public void ajusteBoton(){
//        
//        bot1.setText("tocame");
//        bot1.setBounds(190, 190, 100, 40);
//    }
   
    public botonnoseque(){
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        Random a = new Random();
        int x = a.nextInt(250);
        int y= a.nextInt(250);
        float r = a.nextFloat();
        float g = a.nextFloat();
        float b = a.nextFloat();
        Color randomColor = new Color(r,g,b);
        this.setBounds(x,y,100,40);
        this.setBackground(randomColor);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
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

