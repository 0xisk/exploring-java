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
public class InfoOfSquash extends JFrame {
    
    JLabel label;
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
    
     BufferedImage image;
     Icon icon;
     JLabel backgroundLabel;
     
     public InfoOfSquash() throws IOException {
         
         this.setSize(1280, 800);
       this.setResizable(false);
            this.setLocationRelativeTo(null);
        
        setLayout(null);
        
        label = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        
        backgroundLabel = new JLabel(); 
        
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Times",Font.ITALIC + Font.BOLD,30));
        label.setText("Squash");
        label.setBounds(50,20,150,120);
        this.add(label);
        
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label1.setText("Squash was invented in Harrow School out of the older game rackets");
        label1.setBounds(50,60,800,120);
        this.add(label1);
        
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label2.setText("the game spread to other schools, eventually becoming an international sport");
        label2.setBounds(50,100,800,120);
        this.add(label2);
        
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label3.setText("The first courts built at this school were rather dangerous");
        label3.setBounds(50,140,800,120);
        this.add(label3);
        
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label4.setText("Natural rubber was the material of choice for the ball");
        label4.setBounds(50,180,800,120);
        this.add(label4);
        
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label5.setText("Students modified their rackets to have a smaller reach to play in these cramped conditions");
        label5.setBounds(50,220,800,120);
        this.add(label5);
        
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label6.setText("The rackets have changed in a similar way to those used in tennis");
        label6.setBounds(50,260,800,120);
        this.add(label6);
        
        label7.setForeground(Color.BLACK);
        label7.setFont(new Font("Times",Font.ITALIC + Font.BOLD,30));
        label7.setText("Rules");
        label7.setBounds(50,400,800,120);
        this.add(label7);
        
        label8.setForeground(Color.BLACK);
        label8.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label8.setText("Squash is a racket sport played by two (singles) or four players (doubles)");
        label8.setBounds(50,440,800,120);
        this.add(label8);
        
        label9.setForeground(Color.BLACK);
        label9.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label9.setText(" The players must alternate in striking the ball with their racket and hit the ball");
        label9.setBounds(50,480,800,120);
        this.add(label9);
        
        label10.setForeground(Color.BLACK);
        label10.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label10.setText("onto the playable surfaces of the four walls of the court");
        label10.setBounds(50,520,800,120);
        this.add(label10);
        
        label11.setForeground(Color.BLACK);
        label11.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label11.setText("The game was formerly called squash rackets");
        label11.setBounds(50,560,800,120);
        this.add(label11);
        
        label12.setForeground(Color.BLACK);
        label12.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label12.setText(" the World Squash Federation is recognised by the International Olympic Committee");
        label12.setBounds(50,600,800,120);
        this.add(label12);
        
        label13.setForeground(Color.BLACK);
        label13.setFont(new Font("Times",Font.PLAIN + Font.BOLD,20));
        label13.setText("the sport is not part of the Olympic Games, despite a number of applications");
        label13.setBounds(50,640,800,120);
        this.add(label13);
        
         try {
            image = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Boula\\sq1.jpg"));
        } catch (IOException ex) {
            System.out.println("cannot open the squash image file");
        }
         
        
        icon = new ImageIcon(image);
        backgroundLabel.setIcon(icon);
        backgroundLabel.setBounds(0, 0, 1280, 800);
        this.add(backgroundLabel);
         
     }
    
}
