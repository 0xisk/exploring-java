package js_club.aMain_Page;


//import .*;
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
public class IndividualSports extends JFrame {
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    JLabel label11;
    JLabel label12;
    JLabel label13;
    JLabel label14;
    JLabel label15;
    JLabel label16;
    JLabel label17;
    JLabel label18;
    JLabel label19;
    JLabel label20;
    JLabel label21;
    JLabel label22;
    JLabel label23;
    JLabel label24;
    
    JLabel backgroundLabel1;
    JLabel backgroundLabel2;
    JLabel backgroundLabel3;
    JLabel backgroundLabel4;
    
    public IndividualSports() throws IOException {
        
        
        TheHandler handler = new TheHandler();
        
        this.setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        this.setLayout(new GridLayout(2,2,0,5));
        
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        
        
        button1.setIcon(new ImageIcon(getClass().getResource("sw.jpg")));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);
        button1.addActionListener(handler);
        this.add(button1);
        
        
        button2.setIcon(new ImageIcon(getClass().getResource("sq.jpg")));
        button2.setHorizontalTextPosition(SwingConstants.CENTER);
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);
        button2.addActionListener(handler);
        this.add(button2);
        
        
        button3.setIcon(new ImageIcon(getClass().getResource("k.jpg")));
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);
        button3.addActionListener(handler);
        this.add(button3);
        
        
        button4.setIcon(new ImageIcon(getClass().getResource("t.jpg")));
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);
        button4.addActionListener(handler);
        this.add(button4);
        
    }
    
    public class TheHandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == button1) {
                
                int choice = 0;
                
               String inquiry = JOptionPane.showInputDialog("choose & type one of the following two options to show you the internel details: 1) Rules 2) Timing");
               
               while(inquiry.equals("") || (inquiry.equals("1") && inquiry.equals("2") && inquiry.equals("rules") && inquiry.equals("Rules") && inquiry.equals("timing") && inquiry.equals("Timing") && inquiry.equals("T") && inquiry.equals("t") && inquiry.equals("R") && inquiry.equals("r"))) {
                   inquiry = JOptionPane.showInputDialog("Error: please get restrict to our conditions! Thanks");
               }
               
               if(inquiry.equals("1") || inquiry.equals("2")) {
                   choice = Integer.parseInt(inquiry);
               }
               
               if((choice == 1) || inquiry.equals("rules") || inquiry.equals("Rules") || inquiry.equals("r") || inquiry.equals("R")) {
                   
                    try {
                        InfoOfSwimming s = new InfoOfSwimming();
                        s.setVisible(true);
                    } catch (IOException ex) {
                        System.out.println("Unfortunately! cannot open the file.");
                    }
                    
               }
               else if((choice == 2) || inquiry.equals("timing") || inquiry.equals("Timing") || inquiry.equals("t") || inquiry.equals("T")) {
                   
                    JOptionPane.showMessageDialog(IndividualSports.this , "Our Swimming warm-up is from 04:00 to 06:00 pm on Monday & from 11:00 to 01:00 on Friday & from 03:00 to 05:00 pm on Sunday","Swimming Training Time",JOptionPane.INFORMATION_MESSAGE);
                   
               }
               
            }
            else if(e.getSource() == button4) {
                
                int choice = 0;
                
               String inquiry = JOptionPane.showInputDialog("choose & type one of the following two options to show you the internel details: 1) Rules 2) Timing");
               
               while(inquiry.equals("") || (inquiry.equals("1") && inquiry.equals("2") && inquiry.equals("rules") && inquiry.equals("Rules") && inquiry.equals("timing") && inquiry.equals("Timing") && inquiry.equals("T") && inquiry.equals("t") && inquiry.equals("R") && inquiry.equals("r"))) {
                   inquiry = JOptionPane.showInputDialog("Error: please get restrict to our conditions! Thanks");
               }
               
               if(inquiry.equals("1") || inquiry.equals("2")) {
                   choice = Integer.parseInt(inquiry);
               }
               
               if((choice == 1) || inquiry.equals("rules") || inquiry.equals("Rules") || inquiry.equals("r") || inquiry.equals("R")) {
                   
                    try {
                        InfoOfTennis t = new InfoOfTennis();
                        t.setVisible(true);
                    } catch (IOException ex) {
                        System.out.println("Unfortunately! cannot open the file.");
                    }
                
            }
               else if((choice == 2) || inquiry.equals("timing") || inquiry.equals("Timing") || inquiry.equals("t") || inquiry.equals("T")) {
                   
                    JOptionPane.showMessageDialog(IndividualSports.this , "Our Tennis warm-up is from 08:00 to 10:00 am on Tuesday & from 11:00 to 01:00 pm on Wednesday & from 04:00 to 06:00 pm on Sunday","Tennis Training Time",JOptionPane.INFORMATION_MESSAGE);
                   
               }
            
        }
            else if(e.getSource() == button2) {
                
                int choice = 0;
                
               String inquiry = JOptionPane.showInputDialog("choose & type one of the following two options to show you the internel details: 1) Rules 2) Timing");
               
               while(inquiry.equals("") || (inquiry.equals("1") && inquiry.equals("2") && inquiry.equals("rules") && inquiry.equals("Rules") && inquiry.equals("timing") && inquiry.equals("Timing")  && inquiry.equals("T") && inquiry.equals("t") && inquiry.equals("R") && inquiry.equals("r"))) {
                   inquiry = JOptionPane.showInputDialog("Error: please get restrict to our conditions! Thanks");
               }
               
               if(inquiry.equals("1") || inquiry.equals("2")) {
                   choice = Integer.parseInt(inquiry);
               }
               
               if((choice == 1) || inquiry.equals("rules") || inquiry.equals("Rules") || inquiry.equals("r") || inquiry.equals("R")) {
                   
                    try {
                        InfoOfSquash s1 = new InfoOfSquash();
                        s1.setVisible(true);
                    } catch (IOException ex) {
                        System.out.println("Unfortunately! cannot open the file.");
                    }
                
            }
               else if((choice == 2) || inquiry.equals("timing") || inquiry.equals("Timing") || inquiry.equals("t") || inquiry.equals("T")) {
                   
                    JOptionPane.showMessageDialog(IndividualSports.this , "Our Squash warm-up is from 11:00 to 01:00 pm on Thursday & from 07:00 to 09:00 pm on Friday & from 10:00 to 12:00 pm on Sunday","Squash Training Time",JOptionPane.INFORMATION_MESSAGE);
                   
               }
            
        }
            else if(e.getSource() == button3) {
                
                int choice = 0;
                
               String inquiry = JOptionPane.showInputDialog("choose & type one of the following two options to show you the internel details: 1) Rules 2) Timing");
               
               while(inquiry.equals("") || (inquiry.equals("1") && inquiry.equals("2") && inquiry.equals("rules") && inquiry.equals("Rules") && inquiry.equals("timing") && inquiry.equals("Timing") && inquiry.equals("T") && inquiry.equals("t") && inquiry.equals("R") && inquiry.equals("r"))) {
                   inquiry = JOptionPane.showInputDialog("Error: please get restrict to our conditions! Thanks");
               }
               
               if(inquiry.equals("1") || inquiry.equals("2")) {
                   choice = Integer.parseInt(inquiry);
               }
               
               if((choice == 1) || inquiry.equals("rules") || inquiry.equals("Rules") || inquiry.equals("r") || inquiry.equals("R")) {
                   
                    try {
                        InfoOfKarateh k = new InfoOfKarateh();
                        k.setVisible(true);
                    } catch (IOException ex) {
                        System.out.println("Unfortunately! cannot open the file.");
                    }
                
            }
               else if((choice == 2) || inquiry.equals("timing") || inquiry.equals("Timing") || inquiry.equals("t") || inquiry.equals("T")) {
                   
                    JOptionPane.showMessageDialog(IndividualSports.this , "Our Karate warm-up is from 11:00 to 01:00 pm on Monday & from 04:00 to 06:00 pm on Friday","Karate Training Time",JOptionPane.INFORMATION_MESSAGE);
                   
               }
                
            }
        
    }
    
}

}
