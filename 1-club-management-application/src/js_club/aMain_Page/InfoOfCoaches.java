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
import javax.swing.SwingConstants;

/**
 *
 * @author boulaawnyazmy
 */
public class InfoOfCoaches extends JFrame {
    
    JLabel label;
    JButton button1;
    JButton button2;
    JLabel label1;
    JButton button3;
    JButton button4;
    JLabel label2;
    JButton button5;
    JButton button6;
    JLabel label3;
    JButton button7;
    JButton button8;
    JLabel label4;
    JButton button9;
    JButton button10;
    JLabel label5;
    JButton button11;
    JButton button12;
    JLabel label6;
    JButton button13;
    JButton button14;
    JLabel label7;
    JButton button15;
    JButton button16;
    
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    
    JPanel panel7;
    JPanel panel8;
    JPanel panel9;
    
    JPanel panel10;
    JPanel panel11;
    JPanel panel12;
    
    JPanel panel13;
    JPanel panel14;
    JPanel panel15;
    
    JPanel panel16;
    JPanel panel17;
    JPanel panel18;
    
    JPanel panel19;
    JPanel panel20;
    JPanel panel21;
    
    JPanel panel22;
    JPanel panel23;
    JPanel panel24;
    
    Icon icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8;
    
    public InfoOfCoaches() throws IOException {
        
        TheHandler handler = new TheHandler();
        
        this.setSize(1280,800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(2,4,0,0));
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel();
        panel13 = new JPanel();
        panel14 = new JPanel();
        panel15 = new JPanel();
        panel16 = new JPanel();
        panel17 = new JPanel();
        panel18 = new JPanel();
        panel19 = new JPanel();
        panel20 = new JPanel();
        panel21 = new JPanel();
        panel22 = new JPanel();
        panel23 = new JPanel();
        panel24 = new JPanel();
        
        panel1.setLayout(new GridLayout(2,1));
        panel1.setBackground(Color.BLACK);
        panel4.setLayout(new GridLayout(2,1));
        panel4.setBackground(Color.BLACK);
        panel7.setLayout(new GridLayout(2,1));
        panel7.setBackground(Color.BLACK);
        panel10.setLayout(new GridLayout(2,1));
        panel10.setBackground(Color.BLACK);
        panel13.setLayout(new GridLayout(2,1));
        panel13.setBackground(Color.BLACK);
        panel16.setLayout(new GridLayout(2,1));
        panel16.setBackground(Color.BLACK);
        panel19.setLayout(new GridLayout(2,1));
        panel19.setBackground(Color.BLACK);
        panel22.setLayout(new GridLayout(2,1));
        panel22.setBackground(Color.BLACK);
        
        icon1 = new ImageIcon(getClass().getResource("basket.jpg"));
        icon2 = new ImageIcon(getClass().getResource("ball1.jpg"));
        icon3 = new ImageIcon(getClass().getResource("ball2.jpg"));
        icon4 = new ImageIcon(getClass().getResource("ball3.jpg"));
        icon5 = new ImageIcon(getClass().getResource("ball4.jpg"));
        icon6 = new ImageIcon(getClass().getResource("ball5.jpg"));
        icon7 = new ImageIcon(getClass().getResource("ball6.jpg"));
        icon8 = new ImageIcon(getClass().getResource("ball7.jpg"));
        
        label = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        
        label.setIcon(icon1);
        label1.setIcon(icon2);
        label2.setIcon(icon3);
        label3.setIcon(icon8);
        label4.setIcon(icon5);
        label5.setIcon(icon6);
        label6.setIcon(icon7);
        label7.setIcon(icon4);
        
        panel2.setLayout(new BorderLayout());
        panel3.setLayout(new GridLayout(2,1));
        panel5.setLayout(new BorderLayout());
        panel6.setLayout(new GridLayout(2,1));
        panel8.setLayout(new BorderLayout());
        panel9.setLayout(new GridLayout(2,1));
        panel11.setLayout(new BorderLayout());
        panel12.setLayout(new GridLayout(2,1));
        panel14.setLayout(new BorderLayout());
        panel15.setLayout(new GridLayout(2,1));
        panel17.setLayout(new BorderLayout());
        panel18.setLayout(new GridLayout(2,1));
        panel20.setLayout(new BorderLayout());
        panel21.setLayout(new GridLayout(2,1));
        panel23.setLayout(new BorderLayout());
        panel24.setLayout(new GridLayout(2,1));
        
        button1 = new JButton("Basketball coach's Timing");
        button1.addActionListener(handler);
        button2 = new JButton("Office Mailing");
        button3 = new JButton("Football coach's Timing");
        button3.addActionListener(handler);
        button4 = new JButton("Office Mailing");
        button5 = new JButton("Volleyball coach's Timing");
        button5.addActionListener(handler);
        button6 = new JButton("Office Mailing");
        button7 = new JButton("Handball coach's Timing");
        button7.addActionListener(handler);
        button8 = new JButton("Office Mailing");
        button9 = new JButton("Squash coach's Timing");
        button9.addActionListener(handler);
        button10 = new JButton("Office Mailing");
        button11 = new JButton("Swimming coach's Timing");
        button11.addActionListener(handler);
        button12 = new JButton("Office Mailing");
        button13 = new JButton("Tennis coach's Timing");
        button13.addActionListener(handler);
        button14 = new JButton("Office Mailing");
        button15 = new JButton("Karate coach's Timing");
        button15.addActionListener(handler);
        button16 = new JButton("Office Mailing");
        
        panel2.add(label  , BorderLayout.CENTER);
        panel5.add(label1 , BorderLayout.CENTER);
        panel8.add(label2 , BorderLayout.CENTER);
        panel11.add(label3 , BorderLayout.CENTER);
        panel14.add(label4 , BorderLayout.CENTER);
        panel17.add(label5 , BorderLayout.CENTER);
        panel20.add(label6 , BorderLayout.CENTER);
        panel23.add(label7 , BorderLayout.CENTER);
        
        panel3.setBackground(Color.GRAY);
        panel3.add(button1);
        panel3.add(button2);
        panel6.setBackground(Color.GRAY);
        panel6.add(button3);
        panel6.add(button4);
        panel9.setBackground(Color.GRAY);
        panel9.add(button5);
        panel9.add(button6);
        panel12.setBackground(Color.GRAY);
        panel12.add(button7);
        panel12.add(button8);
        panel15.setBackground(Color.GRAY);
        panel15.add(button9);
        panel15.add(button10);
        panel18.setBackground(Color.GRAY);
        panel18.add(button11);
        panel18.add(button12);
        panel21.setBackground(Color.GRAY);
        panel21.add(button13);
        panel21.add(button14);
        panel24.setBackground(Color.GRAY);
        panel24.add(button15);
        panel24.add(button16);
        
        panel1.setBackground(Color.BLACK);
        panel1.add(panel2);
        panel1.add(panel3);
        panel4.setBackground(Color.BLACK);
        panel4.add(panel5);
        panel4.add(panel6);
        panel7.setBackground(Color.BLACK);
        panel7.add(panel8);
        panel7.add(panel9);
        panel10.setBackground(Color.BLACK);
        panel10.add(panel11);
        panel10.add(panel12);
        panel13.setBackground(Color.BLACK);
        panel13.add(panel14);
        panel13.add(panel15);
        panel16.setBackground(Color.BLACK);
        panel16.add(panel17);
        panel16.add(panel18);
        panel19.setBackground(Color.BLACK);
        panel19.add(panel20);
        panel19.add(panel21);
        panel22.setBackground(Color.BLACK);
        panel22.add(panel23);
        panel22.add(panel24);
        
        this.add(panel1);
        this.add(panel4);
        this.add(panel7);
        this.add(panel10);
        this.add(panel13);
        this.add(panel16);
        this.add(panel19);
        this.add(panel22);
        
    }
    
    public class TheHandler implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == button1) {
         
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer Steve Gills is available just 8 hours on Friday from 01:00 to 08:00 pm & free timing on Monday & Wednesday 24 hours & the rest is required 4 hours per day from 08:00 to 11:00 am", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button3) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer John William is available just 5 hours on Monday from 02:00 to 06:00 pm & free timing on Tuesday & Wednesday 24 hours & the rest is required 4 hours per day from 8:00 to 12:00 am except Saturday (too busy)", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button5) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer David James is available just 24 hours on Monday, Tuesday & Wednesday & free timing on Thursday(from 05:00 to 09:00 pm) hours & the rest is required 4 hours per day from 06:00 to 10:00 pm", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button7) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer Rachael Monfils is available just 24 hours on Thursday, Tuesday & Friday & Saturday free timing on `Sunday(from 12:00 to 04:00 pm) hours & the rest is required 4 hours per day from 09:00 to 12:00 pm", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button9) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer Steve Jordon is available just 20 hours on Monday, Tuesday & Wednesday & free timing on Thursday(from 03:00 to 07:00 pm) hours & the rest is required 3 hours per day from 01:00 to 03:00 pm", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button11) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer Jack Victor is available just 16 hours on Thursday, Tuesday & Wednesday & free timing on Friday(from 01:00 to 05:40 pm) hours & the rest is required 7 hours per day from 06:00 to 12:00 pm", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button13) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer Mat Stephan is available just 15 hours on Monday, Sunday & Friday & free timing on Saturday(from 08:00 to 11:00 pm) hours & the rest is required 5 hours per day from 01:00 to 05:00 pm", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource() == button15) {
            
            JOptionPane.showMessageDialog(InfoOfCoaches.this, "Your Trainer Chris Evans is available just 7 hours on Tuesday, Wednesday & Thursday & free timing on Sunday(from 09:00 to 04:30 pm) hours & the rest is required 11 hours per day from 05:00 to 03:00 am", "Information" , JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
}
    
}
