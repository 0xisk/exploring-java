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
public class TeamSports extends JFrame {
    
    // from panel2 to panel5 belong to first panel1...
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    // from panel7 to panel10 belong to second panel6...
    JPanel panel6;
    JPanel panel7;
    JPanel panel8;
    JPanel panel9;
    JPanel panel10;
    //from panel12 to panel15 belong to third panel11...
    JPanel panel11;
    JPanel panel12;
    JPanel panel13;
    JPanel panel14;
    JPanel panel15;
    //from panel12 to panel15 belong to last panel11...
    JPanel panel16;
    JPanel panel17;
    JPanel panel18;
    JPanel panel19;
    JPanel panel20;
    // from button1 to button2 belong to first panel...
    JButton button1;
    JButton button2;
    // from button3 to button4 belong to second panel...
    JButton button3;
    JButton button4;
    // from button5 to button6 belong to third panel...
    JButton button5;
    JButton button6;
    // from button5 to button6 belong to last panel...
    JButton button7;
    JButton button8;
    // from label1 to label 9 belongs to first panel...
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    // from label10 to label 18 belongs to second panel...
    JLabel label10;
    JLabel label11;
    JLabel label12;
    JLabel label13;
    JLabel label14;
    JLabel label15;
    JLabel label16;
    JLabel label17;
    JLabel label18;
    // from label19 to label27 belongs to third panel...
    JLabel label19;
    JLabel label20;
    JLabel label21;
    JLabel label22;
    JLabel label23;
    JLabel label24;
    JLabel label25;
    JLabel label26;
    JLabel label27;
    // from label28 to label36 belongs to last panel...
    JLabel label28;
    JLabel label29;
    JLabel label30;
    JLabel label31;
    JLabel label32;
    JLabel label33;
    JLabel label34;
    JLabel label35;
    JLabel label36;
    // All the layout belong to every JPanel
    private final FlowLayout layout1;
    private final BorderLayout layout2;
    private final BorderLayout layout3;
    private final GridLayout layout4;
    private final GridLayout layout5;
    // next panel layout
    private final FlowLayout layout6;
    private final BorderLayout layout7;
    private final BorderLayout layout8;
    private final GridLayout layout9;
    private final GridLayout layout10;
    // third panel layout
    private final FlowLayout layout11;
    private final BorderLayout layout12;
    private final BorderLayout layout13;
    private final GridLayout layout14;
    private final GridLayout layout15;
    // last panel layout
    private final FlowLayout layout16;
    private final BorderLayout layout17;
    private final BorderLayout layout18;
    private final GridLayout layout19;
    private final GridLayout layout20;
    
    
    
    
    public TeamSports() {
        
        TheHandler handler = new TheHandler();
        
        this.setSize(1280,800);
        this.setResizable(false);
           this.setLocationRelativeTo(null);
        
        this.setLayout(new GridLayout(4,1));
        
        Icon[] icon = {
            new ImageIcon(getClass().getResource("h.jpg")),
            new ImageIcon(getClass().getResource("v.jpg")),
            new ImageIcon(getClass().getResource("foot.jpg")),
            new ImageIcon(getClass().getResource("b.jpg"))
        };
        
        layout1 = new FlowLayout();
        layout1.setAlignment(FlowLayout.LEFT);
        layout6 = new FlowLayout();
        layout6.setAlignment(FlowLayout.LEFT);
        layout11 = new FlowLayout();
        layout11.setAlignment(FlowLayout.LEFT);
        layout16 = new FlowLayout();
        layout16.setAlignment(FlowLayout.LEFT);
        
        panel1 = new JPanel();
        panel1.setLayout(layout1);
        
        layout2 = new BorderLayout();
        layout3 = new BorderLayout();
        layout7 = new BorderLayout();
        layout8 = new BorderLayout();
        layout12 = new BorderLayout();
        layout13 = new BorderLayout();
        layout17 = new BorderLayout();
        layout18 = new BorderLayout();
        
        panel2 = new JPanel();
        panel2.setLayout(layout2);
        label1 = new JLabel();
        label1.setIcon(icon[2]);
        panel2.add(label1, BorderLayout.CENTER);
        
        layout4 = new GridLayout(8,1);
        layout9 = new GridLayout(8,1);
        layout14 = new GridLayout(8,1);
        layout19 = new GridLayout(8,1);
        
        panel3 = new JPanel();
        panel3.setBackground(Color.GRAY);
        panel3.setLayout(layout3);
        
        layout5 = new GridLayout(1,2);
        layout10 = new GridLayout(1,2);
        layout15 = new GridLayout(1,2);
        layout20 = new GridLayout(1,2);
        
        panel4 = new JPanel();
        panel4.setBackground(Color.GRAY);
        panel4.setLayout(layout4);
        
        panel5 = new JPanel();
        panel5.setBackground(Color.GRAY);
        panel5.setLayout(layout5);
        
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        
        label2.setText("Football is a family of team sports that involve, to varying degrees, kicking a ball with the foot to score a goal and you should give the nation the respect for the other team.");
        label3.setText("The various codes of football share certain common elements: Players in American football, Canadian football, rugby union and rugby league take up positions in a limited area");
        label4.setText("These different variations of football are known as football codes.");
        label5.setText("Association football, Australian rules football and Gaelic football tend to use kicking to move the ball around the pitch");
        label6.setText("Body tackles are less central to the game, and players are freer to move around the field");
        label7.setText("football can be traced back to the codification of these games at English public schools during the nineteenth century.");
        label8.setText("The expanse of the British Empire allowed these rules of football to spread to areas of British influence outside of the directly controlled Empire");
        label9.setText("Gaelic football, for example, deliberately incorporated the rules of local traditional football games in order to maintain their heritage");
        
        panel4.add(label2);
        panel4.add(label3);
        panel4.add(label4);
        panel4.add(label5);
        panel4.add(label6);
        panel4.add(label7);
        panel4.add(label8);
        panel4.add(label9);
        
        button1 = new JButton("Timing");
        button1.addActionListener(handler);
        button2 = new JButton("Rules");
        button2.addActionListener(handler);
        
        panel5.add(button1);
        panel5.add(button2);
        
        panel3.add(panel4,BorderLayout.NORTH);
        panel3.add(panel5,BorderLayout.SOUTH);
        
        panel1.setBackground(Color.GRAY);
        panel1.add(panel2);
        panel1.add(panel3);
        
        panel6 = new JPanel();
        panel6.setBackground(Color.GRAY);
        panel6.setLayout(layout6);
        
        panel7 = new JPanel();
        panel7.setLayout(layout7);
        
        panel9 = new JPanel();
        panel9.setBackground(Color.GRAY);
        panel9.setLayout(layout9);
        
         label10 = new JLabel();
         label10.setIcon(icon[3]);
         panel7.add(label10, BorderLayout.CENTER);
        
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        
        label11.setText("BasketBall is a family of team sports that involve, to varying degrees, kicking a ball with the foot to score a goal and you should give the nation the respect for the other team.");
        label12.setText("The various codes of football share certain common elements: Players in American football, Canadian football, rugby union and rugby league take up positions in a limited area");
        label13.setText("These different variations of football are known as football codes.");
        label14.setText("Association football, Australian rules football and Gaelic football tend to use kicking to move the ball around the pitch");
        label15.setText("Body tackles are less central to the game, and players are freer to move around the field");
        label16.setText("football can be traced back to the codification of these games at English public schools during the nineteenth century.");
        label17.setText("The expanse of the British Empire allowed these rules of football to spread to areas of British influence outside of the directly controlled Empire");
        label18.setText("Gaelic football, for example, deliberately incorporated the rules of local traditional football games in order to maintain their heritage");
        
        panel9.add(label11);
        panel9.add(label12);
        panel9.add(label13);
        panel9.add(label14);
        panel9.add(label15);
        panel9.add(label16);
        panel9.add(label17);
        panel9.add(label18);
        
        panel10 = new JPanel();
        panel10.setBackground(Color.GRAY);
        panel10.setLayout(layout10);
        
        button3 = new JButton("Timing");
        button3.addActionListener(handler);
        button4 = new JButton("Rules");
        button4.addActionListener(handler);
        
        panel10.add(button3);
        panel10.add(button4);
        
        panel8 = new JPanel();
        panel8.setBackground(Color.GRAY);
        panel8.setLayout(layout8);
        
        panel8.add(panel9,BorderLayout.NORTH);
        panel8.add(panel10,BorderLayout.SOUTH);
        
        panel6.setBackground(Color.GRAY);
        panel6.add(panel8);
        panel6.add(panel7);
        
        panel11 = new JPanel();
        panel11.setBackground(Color.GRAY);
        panel11.setLayout(layout11);
        
        panel12 = new JPanel();
        panel12.setLayout(layout12);
        label19 = new JLabel();
        label19.setIcon(icon[1]);
        panel12.add(label19, BorderLayout.CENTER);
        
        panel13 = new JPanel();
        panel13.setBackground(Color.GRAY);
        panel13.setLayout(layout13);
        
        panel14 = new JPanel();
        panel14.setBackground(Color.GRAY);
        panel14.setLayout(layout14);
        
        panel15 = new JPanel();
        panel15.setBackground(Color.GRAY);
        panel15.setLayout(layout15);
        
        label20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        
        label20.setText("Volleyball is a family of team sports that involve, to varying degrees, kicking a ball with the foot to score a goal and you should give the nation the respect for the other team.");
        label21.setText("The various codes of football share certain common elements: Players in American football, Canadian football, rugby union and rugby league take up positions in a limited area");
        label22.setText("These different variations of football are known as football codes.");
        label23.setText("Association football, Australian rules football and Gaelic football tend to use kicking to move the ball around the pitch");
        label24.setText("Body tackles are less central to the game, and players are freer to move around the field");
        label25.setText("football can be traced back to the codification of these games at English public schools during the nineteenth century.");
        label26.setText("The expanse of the British Empire allowed these rules of football to spread to areas of British influence outside of the directly controlled Empire");
        label27.setText("Gaelic football, for example, deliberately incorporated the rules of local traditional football games in order to maintain their heritage");
        
        panel14.add(label20);
        panel14.add(label21);
        panel14.add(label22);
        panel14.add(label23);
        panel14.add(label24);
        panel14.add(label25);
        panel14.add(label26);
        panel14.add(label27);
        
        button5 = new JButton("Timing");
        button5.addActionListener(handler);
        button6 = new JButton("Rules");
        button6.addActionListener(handler);
        
        panel15.add(button5);
        panel15.add(button6);
        
        panel13.add(panel14,BorderLayout.NORTH);
        panel13.add(panel15,BorderLayout.SOUTH);
        
        panel11.setBackground(Color.GRAY);
        panel11.add(panel12);
        panel11.add(panel13);
        
        panel16 = new JPanel();
        panel16.setBackground(Color.GRAY);
        panel16.setLayout(layout16);
        
        panel17 = new JPanel();
        panel17.setLayout(layout17);
        
        panel19 = new JPanel();
        panel19.setBackground(Color.GRAY);
        panel19.setLayout(layout19);
        
        label28 = new JLabel();
        label28.setIcon(icon[0]);
        panel17.add(label28, BorderLayout.CENTER);
         
        label29 = new JLabel();
        label30 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        label36 = new JLabel();
        
        label29.setText("Handball is a family of team sports that involve, to varying degrees, kicking a ball with the foot to score a goal and you should give the nation the respect for the other team.");
        label30.setText("The various codes of football share certain common elements: Players in American football, Canadian football, rugby union and rugby league take up positions in a limited area");
        label31.setText("These different variations of football are known as football codes.");
        label32.setText("Association football, Australian rules football and Gaelic football tend to use kicking to move the ball around the pitch");
        label33.setText("Body tackles are less central to the game, and players are freer to move around the field");
        label34.setText("football can be traced back to the codification of these games at English public schools during the nineteenth century.");
        label35.setText("The expanse of the British Empire allowed these rules of football to spread to areas of British influence outside of the directly controlled Empire");
        label36.setText("Gaelic football, for example, deliberately incorporated the rules of local traditional football games in order to maintain their heritage");
        
        panel19.add(label29);
        panel19.add(label30);
        panel19.add(label31);
        panel19.add(label32);
        panel19.add(label33);
        panel19.add(label34);
        panel19.add(label35);
        panel19.add(label36);
        
        panel20 = new JPanel();
        panel20.setBackground(Color.GRAY);
        panel20.setLayout(layout20);
        
        button7 = new JButton("Timing");
        button7.addActionListener(handler);
        button8 = new JButton("Rules");
        button8.addActionListener(handler);
        
        panel20.add(button7);
        panel20.add(button8);
        
        panel18 = new JPanel();
        
        panel18.setLayout(layout18);
        
        panel18.add(panel19,BorderLayout.NORTH);
        panel18.add(panel20,BorderLayout.SOUTH);
        
        panel16.setBackground(Color.GRAY);
        panel16.add(panel18);
        panel16.add(panel17);
        
        
        
        this.add(panel1); // to add the panel specified in football...
        this.add(panel6); // to add the panel specified in basketball...
        this.add(panel11); // to add the panel specified in volleyball...
        this.add(panel16);
        
        
        
    }
    
    public class TheHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == button1)
                JOptionPane.showMessageDialog(TeamSports.this , "Our Football warm-up is from 10:00 to 12:00 on Wednesday & from 03:00 to 05:00 on Sunday","Football Training Time",JOptionPane.INFORMATION_MESSAGE);
            else if(e.getSource() == button2) {
                
                JOptionPane.showMessageDialog(TeamSports.this, "Another game here: Try to maximize the widnow to see the internel rules you'd love to know it as it's just alittle game, so enjoy plating with us :D !","let's play together" , JOptionPane.INFORMATION_MESSAGE);
                
                try {
                    InfoOfFootball f = new InfoOfFootball();
                    f.setVisible(true);
                } catch (IOException ex) {
                    System.out.println("Unfortunately! cannot open the file.");
                }
                
            }
            else if(e.getSource() == button3)
                JOptionPane.showMessageDialog(TeamSports.this , "Our Basketball warm-up is from 02:00 to 04:00 on Monday & from 11:00 to 01:00 on Thursday","Basketball Training Time",JOptionPane.INFORMATION_MESSAGE);
            else if(e.getSource() == button4) {
                
                 JOptionPane.showMessageDialog(TeamSports.this, "Another game here: Try to maximize the widnow to see the internel rules you'd love to know it as it's just alittle game, so enjoy plating with us :D !","let's play together" , JOptionPane.INFORMATION_MESSAGE);
                
                try {
                    InfoOfBasketball b = new InfoOfBasketball();
                    b.setVisible(true);
                } catch (IOException ex) {
                    System.out.println("Unfortunately! cannot open the file.");
                }
                
                
            }
            else if(e.getSource() == button5)
                JOptionPane.showMessageDialog(TeamSports.this , "Our Volleyball warm-up is from 04:00 to 06:00 on Tuesday & from 03:00 to 05:00 on Saturday","Volleyball Training Time",JOptionPane.INFORMATION_MESSAGE);
            else if(e.getSource() == button6) {
                
                JOptionPane.showMessageDialog(TeamSports.this, "Another game here: Try to maximize the widnow to see the internel rules you'd love to know it as it's just alittle game, so enjoy plating with us :D !","let's play together" , JOptionPane.INFORMATION_MESSAGE);
                
                try {
                    InfoOfVolleyball v = new InfoOfVolleyball();
                    v.setVisible(true);
                } catch (IOException ex) {
                    System.out.println("Unfortunately! cannot open the file.");
                }
                
            }
            else if(e.getSource() == button7)
                JOptionPane.showMessageDialog(TeamSports.this , "Our Volleyball warm-up is from 07:00 to 09:00 on Saturday & from 05:45 to 07:45 on Sunday","Volleyball Training Time",JOptionPane.INFORMATION_MESSAGE);
            else if(e.getSource() == button8) {
                
                JOptionPane.showMessageDialog(TeamSports.this, "Another game here: Try to maximize the widnow to see the internel rules you'd love to know it as it's just alittle game, so enjoy plating with us :D !","let's play together" , JOptionPane.INFORMATION_MESSAGE);
                
                try {
                    InfoOfHandball h = new InfoOfHandball();
                    h.setVisible(true);
                } catch (IOException ex) {
                    System.out.println("Unfortunately! cannot open the file.");
                }
                
            }
                
                
        }
        
        
        
    }
    
    
    
}


