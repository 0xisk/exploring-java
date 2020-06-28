package js_club.aMain_Page;

import static com.sun.webkit.graphics.WCImage.getImage;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.*;
import javax.imageio.*;
import java.io.File;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.ScrollPane;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.text.AttributedCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author boulaawnyazmy
 */
public class InfoActivity extends JFrame {
    
        JButton button1;
        JButton button2;
        JButton button3;
        JLabel backgroundLabel;
    
        BufferedImage io;
        Icon icon,icon1, icon2,icon3 , icon4, icon5, icon6; 
        
        
        
        public InfoActivity() throws IOException {
            
            JOptionPane.showMessageDialog(InfoActivity.this, "First we would like to have some fun with you and we would like you to co-operate and have fun with us too.","Important Notes",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(InfoActivity.this, "So let's play together & hope you enjoy your general view","Important Notes",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(InfoActivity.this, "Our first game includes that you have to locate our general activities by moving your mouse cursor over our page, hints: there are two more Information (Have Fun)","Important Notes",JOptionPane.INFORMATION_MESSAGE);
             
            this.setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
            this.setResizable(false);
            this.setLayout(null);
           
            
            TheHandler handler = new TheHandler();
        
            icon1 = new ImageIcon(getClass().getResource("s1.jpg"));
            icon2 = new ImageIcon(getClass().getResource("s2.jpg"));
            icon3 = new ImageIcon(getClass().getResource("s3.jpg"));
            icon4 = new ImageIcon(getClass().getResource("s4.jpg"));
            icon5 = new ImageIcon(getClass().getResource("s5.jpg"));
            icon6 = new ImageIcon(getClass().getResource("s6.jpg"));
            
            //set all what you want here before painting...
            button1 = new JButton();
            button1.setIcon(icon1);
            button1.setRolloverIcon(icon2);
            button1.setBounds(50, 250, 300, 300);
            add(button1);
            button1.addActionListener(handler);
            
            button2 = new JButton();
            button2.setIcon(icon3);
            button2.setRolloverIcon(icon4);
            button2.setBounds(490, 250, 290, 300);
            this.add(button2);
            button2.addActionListener(handler);
            button2.setVisible(true);
            
            button3 = new JButton();
            button3.setIcon(icon5);
            button3.setRolloverIcon(icon6);
            button3.setBounds(920, 250, 290, 300);
            this.add(button3);
            button3.addActionListener(handler);
            
            
        }  
    
    
    public class TheHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == button1) {
                
                TeamSports s = new TeamSports();
                s.setVisible(true);
                
            }
            else if(e.getSource() == button2) {
                
                IndividualSports i = null;
                try {
                    i = new IndividualSports();
                    i.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InfoActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            else if(e.getSource() == button3) {
                
                InfoOfCoaches c = null;
                try {
                     c = new InfoOfCoaches();
                     c.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InfoActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            
        }
        
    }
    
        
    public void paint(Graphics g) {
        
        try {
                io = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\src\\js_club\\Main_Page\\Origin1.jpg"));
            }
            catch(IOException ex) {
                System.out.println("cannot open the image.");
            }
        
        g.drawImage(io, 0, 0, 1280,800,null);
        
        g.setColor(Color.RED);
        g.setFont(new Font("Impact",Font.ITALIC, 72));
        g.drawString("W", 450, 120);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact",Font.ITALIC, 30));
        g.drawString("ELCOME",505 , 120);
        g.setColor(Color.RED);
        g.setFont(new Font("Impact",Font.ITALIC,72));
        g.drawString("T", 585, 140);
        g.setColor(Color.RED);
        g.setFont(new Font("Impact",Font.ITALIC,30));
        g.drawString("O",610,140);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact",Font.ITALIC,30));
        g.drawString("UR", 625, 140);
        g.setColor(Color.RED);
        g.setFont(new Font("Impact",Font.ITALIC,72));
        g.drawString("A",648, 170);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact",Font.ITALIC,30));
        g.drawString("CTIVITIES",686,170);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif",Font.PLAIN,14));
        g.drawString("Our Club is optimized for learning, testing, and training. Examples might be simplified to improve reading and basic understanding. Tutorials, references, and ",200 ,680);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif",Font.PLAIN,14));
        g.drawString("examples are constantly reviewed to avoid errors, but we cannot warrant full correctness of all content. While using this site, you agree to have read and ",220,700);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif",Font.PLAIN,14));
        g.drawString("accepted our terms of use, cookie and privacy policy. Copyright 1999-2016 by Refsnes Data. All Rights Reserved.",340,720);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif",Font.BOLD,14));
        g.drawString("Powered by OurClub.CAFC", 550, 740);
        
    }
    
}
