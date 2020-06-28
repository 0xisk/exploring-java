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
public class InfoOfSwimming extends JFrame {
    
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
    
    public InfoOfSwimming() throws IOException {
        
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
        
        label.setForeground(Color.CYAN);
        label.setFont(new Font("Courier",Font.ITALIC + Font.BOLD,30));
        label.setText("Swimming");
        label.setBounds(50,20,150,120);
        this.add(label);
        
        label1.setForeground(Color.CYAN);
        label1.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label1.setText("Swimming is an individual or team sport and activity");
        label1.setBounds(50,60,800,120);
        this.add(label1);
        
        label2.setForeground(Color.CYAN);
        label2.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label2.setText("Competitive swimming is one of the most popular Olympic sports, with events in butterfly");
        label2.setBounds(50,100,800,120);
        this.add(label2);
        
        label3.setForeground(Color.CYAN);
        label3.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label3.setText("Swimmers can also compete in open-water events (e.g., in a sea or lake)");
        label3.setBounds(50,140,800,120);
        this.add(label3);
        
        label4.setForeground(Color.CYAN);
        label4.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label4.setText("Evidence of recreational swimming in prehistoric times has been found");
        label4.setBounds(50,180,800,120);
        this.add(label4);
        
        label5.setForeground(Color.CYAN);
        label5.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label5.setText("Swimming emerged as a competitive recreational activity in the 1830s in England");
        label5.setBounds(50,220,800,120);
        this.add(label5);
        
        label6.setForeground(Color.CYAN);
        label6.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label6.setText("The goal of competitive swimming is to break personal or world records while beating competitors");
        label6.setBounds(50,260,800,120);
        this.add(label6);
        
        label7.setForeground(Color.CYAN);
        label7.setFont(new Font("Courier",Font.ITALIC + Font.BOLD,30));
        label7.setText("Rules");
        label7.setBounds(50,400,800,120);
        this.add(label7);
        
        label8.setForeground(Color.CYAN);
        label8.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label8.setText("other styles like the breaststroke, front crawl, or backstroke can be swum adequately by beginners");
        label8.setBounds(50,440,800,120);
        this.add(label8);
        
        label9.setForeground(Color.CYAN);
        label9.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label9.setText("the butterfly is a more difficult stroke that requires good technique");
        label9.setBounds(50,480,800,120);
        this.add(label9);
        
        label10.setForeground(Color.CYAN);
        label10.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label10.setText("The peak speed of the butterfly is faster than that of the front crawl");
        label10.setBounds(50,520,800,120);
        this.add(label10);
        
        label11.setForeground(Color.CYAN);
        label11.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label11.setText("Yet since speed drops significantly during the recovery phase");
        label11.setBounds(50,560,800,120);
        this.add(label11);
        
        label12.setForeground(Color.CYAN);
        label12.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label12.setText("swimming stroke swum on the breast, with both arms moving symmetrically");
        label12.setBounds(50,600,800,120);
        this.add(label12);
        
        label13.setForeground(Color.CYAN);
        label13.setFont(new Font("Courier",Font.PLAIN + Font.BOLD,16));
        label13.setText("the extremely different physical exertion it puts on the swimmer compared to the freestyle");
        label13.setBounds(50,640,800,120);
        this.add(label13);
        
         try {
            image = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Boula\\sw1.jpg"));
        } catch (IOException ex) {
            System.out.println("cannot open the file");
        }
         
        
        icon = new ImageIcon(image);
        backgroundLabel.setIcon(icon);
        backgroundLabel.setBounds(0, 0, 1280, 800);
        this.add(backgroundLabel);
        
    }
    
//    public void paint(Graphics g) {
//        
//        
//        
//       
//        
//        g.drawImage(image, 0, 0, 1280,800,null);
//        
//    }
    
}
