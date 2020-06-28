/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js_club.bMemberShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contact_Us extends JFrame{

    private JLabel bg,labl,lab2,lab3;
    private JButton btn1 , btn2 , btn3 , btn4 , btn5 ;
        ImageIcon image;

    public Contact_Us (){
        setSize(1010, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.setTitle("Contact Us");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        image = new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Eskandrlogo.jpg");
        this.setIconImage(image.getImage());
        
        setLayout(null);
        
        bg = new JLabel ();
        bg.setIcon(new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Eskandr\\contact_us.jpg"));
        bg.setBounds(0, 0, 1000, 700);
        
        labl = new JLabel();
        labl.setText("Finanial Admin");
        labl.setFont(new Font("Times",Font.BOLD,22));
        labl.setBounds(330, 280, 160, 80);
        this.add(labl);
        
        lab2 = new JLabel();
        lab2.setText("Coaches Admin");
        lab2.setFont(new Font("Times",Font.BOLD,20));
        lab2.setBounds(520, 280, 160, 80);
        this.add(lab2);
        
        lab3 = new JLabel();
        lab3.setText("Complaines");
        lab3.setFont(new Font("Times",Font.BOLD,20));
        lab3.setBounds(700, 280, 160, 80);
        this.add(lab3);
        
        btn1 = new JButton ("send Msg.");
        btn2 = new JButton ("send Msg.");
        btn3 = new JButton ("send Msg.");
        btn4 = new JButton ("Back");
        btn5 = new JButton ("Cancel");
        
        btn1.setBounds(350, 540, 100 ,25);
        btn2.setBounds(540, 540, 100 ,25);
        btn3.setBounds(700, 540, 100 ,25);
        btn4.setBounds(760, 640, 70 ,25);
        btn5.setBounds(850, 640, 80 ,25);
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        
        btn4.addActionListener(new back());
        btn5.addActionListener(new cancel());
        
        
        
        getContentPane().add(bg);
        
        setVisible(true);
    }
     private class cancel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Contact_Us.this, "Thank you !", "Information", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    private class back implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            Member_login_code log = new Member_login_code ();
            log.setVisible(true);
            dispose();
        }
    }
    
}
