
package js_club.bMemberShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import js_club.aMain_Page.*;

public class Member_login_code extends JFrame {
    private JButton btn1,btn2,btn3,btn4;
    private JTextField tf1;
    private JLabel BG,logo,l1,l2,l3;
    private JPasswordField ps;
    ImageIcon image;
    
    public Member_login_code (){
        setSize(850, 530);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.setTitle("Login Form");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        image = new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS Club\\images\\eskandr\\logo.jpg");
        this.setIconImage(image.getImage());
       
        setLayout(null);
        //BackGround
        BG = new JLabel ();
        BG.setIcon(new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS Club\\images\\eskandr\\BG.jpg"));
        BG.setBounds(0, 0, 850, 520);
        
        //Labels 
        l1  = new JLabel("E-mail");
        l2  = new JLabel("Password");
        l3  = new JLabel("Apply Application");
        
        //TextField
        tf1 =new JTextField (50);
        ps =new JPasswordField (20);
        
        //Labels and Textfield bounds 
        l1.setBounds(290, 240, 70, 60);
          tf1.setBounds(370, 260, 190, 20);
        l2.setBounds(290, 280, 80, 60);
          ps.setBounds(370, 300, 190, 20);
        l3.setBounds(390, 340, 100, 85);
        
         //add Labels $ TextField
         add(l1);
             add(tf1);
         add(l2);
             add(ps); 
         add(l3);
         //Buttons
        btn1 = new JButton ("Login");
        btn2 = new JButton ("New Member");
        btn3 = new JButton ("Back");
        btn4 = new JButton ("Cancel");
        
        //Buttons Bounds
        btn1.setBounds(350, 400, 70 ,25);
        btn2.setBounds(330, 350, 220 ,25);
        btn3.setBounds(430, 400, 70 ,25);
        btn4.setBounds(510, 400, 80 ,25);
        
        
        //add buttons
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        
        // Setactions 
        btn1.addActionListener(new login());
        btn2.addActionListener(new submit());
        btn3.addActionListener(new back ());
        btn4.addActionListener(new cancel());
//        tf1.addActionListener(new Enter());
        
        
        getContentPane().add(BG);
   }
//    private class Enter implements ActionListener{
//        @Override
//        public void actionPerformed(KeyEvent e) {
//            if(e.getKeyCode == KeyEvent.VK_ENTER)
//                ps.requestFocus();
//        }
//    }
    private class cancel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Member_login_code.this, "Thank you !", "Information", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            mainWindow re = new mainWindow();
            re.setVisible(true);
            dispose();
        }
    
    }
 
    private class submit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Registration_Code re = new Registration_Code();
            re.setVisible(true);
            dispose();
        }
    }
    
    private class login implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            try {
            String Username = tf1.getText();
            String Pass = ps.getText();
            
            File Login = new File("Information.txt");
            Scanner file_Login = new Scanner(Login);
            
            boolean Found = false;
            while(file_Login.hasNext()){
                String Line = file_Login.nextLine();
                
                String []Parts = Line.split("%");
                       
                String Name = Parts[11];
                String password = Parts[12];
                
                
                if (Name.equals(Username) && password.equals(Pass)) {
                        if (Parts[8].equals("coaches admin") && Parts[9].equals("JS club")) {
                           Found = true; 
                        }
                        else if(Parts[8].equals("financial admin") && Parts[9].equals("JS club")){
                            Found = true;
                        }
                        else if(Parts[8].equals("Activities admin") && Parts[9].equals("JS club")){
                            Found = true;
                        }
                        else if(Parts[8].equals("Complains admin") && Parts[9].equals("JS club")){
                            Found = true;
                        }
                        else{
                            Found = true;
                            JOptionPane.showMessageDialog(null, "Welcome !", "Information", JOptionPane.INFORMATION_MESSAGE);
                            Contact_Us us = new Contact_Us();
                            us.setVisible(true);
                            dispose();
                        }
                }
            }
            if (!Found) {
                JOptionPane.showMessageDialog(null, "The UserName Is not Exist", "User Name Not Found", JOptionPane.WARNING_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Text File Is Not Exist", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        }
    }
    }
