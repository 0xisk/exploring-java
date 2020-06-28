package js_club.aMain_Page;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
public class InfoOfKarateh extends JFrame {
    
    
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
    
    public InfoOfKarateh() throws IOException {
        
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
        
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Serif",Font.ITALIC + Font.BOLD,30));
        label.setText("Karate");
        label.setBounds(50,20,150,120);
        this.add(label);
        
        label1.setForeground(Color.BLUE);
        label1.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label1.setText(" It developed from the indigenous martial arts of Ryukyu Islands");
        label1.setBounds(50,60,800,120);
        this.add(label1);
        
        label2.setForeground(Color.BLUE);
        label2.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label2.setText("Karate is now predominantly a striking art using punching, kicking, knee strikes, elbow strikes");
        label2.setBounds(50,100,800,120);
        this.add(label2);
        
        label3.setForeground(Color.BLUE);
        label3.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label3.setText("open-hand techniques such as knife-hands, spear-hands, and palm-heel strikes");
        label3.setBounds(50,140,800,120);
        this.add(label3);
        
        label4.setForeground(Color.BLUE);
        label4.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label4.setText(" A karate practitioner is called a karateka");
        label4.setBounds(50,180,800,120);
        this.add(label4);
        
        label5.setForeground(Color.BLUE);
        label5.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label5.setText("Karate developed on the Ryukyu Islands in what is now Okinawa");
        label5.setBounds(50,220,800,120);
        this.add(label5);
        
        label6.setForeground(Color.BLUE);
        label6.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label6.setText(" It was systematically taught in Japan after the Taisho era");
        label6.setBounds(50,260,800,120);
        this.add(label6);
        
        label7.setForeground(Color.BLUE);
        label7.setFont(new Font("Serif",Font.ITALIC + Font.BOLD,30));
        label7.setText("Rules");
        label7.setBounds(50,400,800,120);
        this.add(label7);
        
        label8.setForeground(Color.BLUE);
        label8.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label8.setText("it's all about strikes, punches & kicking");
        label8.setBounds(50,440,800,120);
        this.add(label8);
        
        label9.setForeground(Color.BLUE);
        label9.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label9.setText("it helps learners realise their true inner strength");
        label9.setBounds(50,480,800,120);
        this.add(label9);
        
        label10.setForeground(Color.BLUE);
        label10.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label10.setText("Strength is inextricably linked to flexibility");
        label10.setBounds(50,520,800,120);
        this.add(label10);
        
        label11.setForeground(Color.BLUE);
        label11.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label11.setText("flexibility allows kick to be higher and quicker");
        label11.setBounds(50,560,800,120);
        this.add(label11);
        
        label12.setForeground(Color.BLUE);
        label12.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label12.setText("also allows the punch to be longer & faster");
        label12.setBounds(50,600,800,120);
        this.add(label12);
        
        label13.setForeground(Color.BLUE);
        label13.setFont(new Font("Serif",Font.PLAIN + Font.BOLD,20));
        label13.setText("The yell should be like a lion's roar");
        label13.setBounds(50,640,800,120);
        this.add(label13);
        
         try {
            image = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Boula\\zone.jpg"));
        } catch (IOException ex) {
            System.out.println("cannot open the squash image file");
        }
         
        
        icon = new ImageIcon(image);
        backgroundLabel.setIcon(icon);
        backgroundLabel.setBounds(0, 0, 1280, 800);
        this.add(backgroundLabel);
        
    }
    
}
