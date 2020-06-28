package js_club.aMain_Page;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boulaawnyazmy
 */
public class InfoOfFootball extends JFrame {
        
        
        JLabel backgroundLabel;
    
        BufferedImage io;
        Icon icon;
        
        
       public InfoOfFootball() throws IOException {
            
           this.setResizable(false);
            this.setLocationRelativeTo(null);
           this.setSize(500, 500);
           this.setLayout(null);
            
            //set all what you want here before painting...
            
            
            try {
                io = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\src\\js_club\\Main_Page\\football.jpg"));
            }
            catch(IOException ex) {
                System.out.println("cannot open the image.");
            }
            
            icon = new ImageIcon(io);
            backgroundLabel = new JLabel(icon);
            backgroundLabel.setBounds(0, 0, 1280, 800);
            this.add(backgroundLabel);
            
            
            
            
        }

    public void paint(Graphics g) {
        
        
        
        g.drawImage(io, 0, 0, 1280,800,null);
        
        g.setFont(new Font("Serif", Font.PLAIN , 20));
        g.drawString("Two teams of usually between 11 and 18 players", 50, 100);
        g.drawString("A clearly defined area in which to play the game", 50, 160);
        g.drawString("Scoring goals or points by moving the ball", 50, 220);
        g.drawString("Goals or points resulting from players", 50, 280);
        g.drawString("The goal or line being defended by the opposing team", 50, 340);
        g.drawString("Players being required to move the ball", 50, 400);
        g.drawString("Players using only their body to move the ball", 50, 460);
        
        
        
    }  
    
        
}
