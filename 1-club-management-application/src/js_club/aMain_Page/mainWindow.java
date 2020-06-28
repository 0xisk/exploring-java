package js_club.aMain_Page;

import js_club.bMemberShip.*;
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
import javax.swing.SwingConstants;

/**
 *
 * @author boulaawnyazmy
 */
public class mainWindow extends JFrame {
    
    JButton  button1;
    JButton  button2;
    JButton  button3;
    JButton  button4;
    JButton  button5;
    
    TheHandler handler = new TheHandler();
    
    public mainWindow() {
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Icon[] icon = {
            new ImageIcon(getClass().getResource("N.jpg")) ,
            new ImageIcon(getClass().getResource("S.jpg")) ,
            new ImageIcon(getClass().getResource("F.jpg")) ,
            new ImageIcon(getClass().getResource("tvc.jpg")) ,
            new ImageIcon(getClass().getResource("ts.jpg"))
        };
        
        setSize(1280,800);
        this.setResizable(false);
           this.setLocationRelativeTo(null);
        
        setLayout(new BorderLayout(0,0));
        
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        
        
        button1.setToolTipText("Getting submitted to our club");
        button1.setIcon(icon[0]);
        button2.setToolTipText("Shopping & Malls");
        button2.setIcon(icon[1]);
        button3.setToolTipText("Financy Information about our club");
        button3.setIcon(icon[2]);
        button4.setToolTipText("About the club");
        button4.setIcon(icon[3]);
        button5.setToolTipText("let's take a tour inside Activities");
        button5.setIcon(icon[4]);
        
        button2.setPreferredSize(new Dimension(900,200));
        button4.setPreferredSize(new Dimension(900,200));
        
        button5.addActionListener(handler);
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button3.addActionListener(handler);
        button4.addActionListener(handler);
        
        add(button1,BorderLayout.CENTER);
        add(button2,BorderLayout.SOUTH);
        add(button3,BorderLayout.WEST);
        add(button4,BorderLayout.NORTH);
        add(button5,BorderLayout.EAST);
        
    }
    
    
    public class TheHandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == button5) {
             
                InfoActivity a = null;
                try {
                    a = new InfoActivity();
                } catch (IOException ex) {
                    Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                a.setVisible(true);
                
            }
            else if(e.getSource() == button1){
                
                Member_login_code l = null;
                try {
                    l = new Member_login_code();
                }catch(Exception ie) {
                    System.out.println("shit");
                }
                l.setVisible(true);
                dispose();
                
            }
            else if(e.getSource() == button2){
                
                // shop p = new Shop();
                //                l.setVisible();
                
            }
            else if(e.getSource() == button3){
                
                // financial f = new financial();
                // f.setVisible();
                
            }
            else if(e.getSource() == button4){
                
                 About_Us_code a = new About_Us_code();
                 a.setVisible(true);
                 dispose();
                
            }
            
        }
        
    }
    
}
