
package js_club.bMemberShip;

import js_club.cActivities.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registration_Code extends JFrame {
    
    
    private JButton  btn2 , btn3 , btn4;
    private JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11,lab12,lab13,lab14,lab15,lab16,BG;
    private JTextField tf1,tf2,tf3,tf9,tf10,tf11,tf12,tf13,tf15,tf16;
    private JComboBox cb5,cb6,cb7,cb8;
    private JPasswordField ps;
    ImageIcon image;

    
    public Registration_Code (){
        
        setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.setTitle("Registration Form");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        image = new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Eskandr\\logo.jpg");
        this.setIconImage(image.getImage());
        
        setLayout(null);
        //labels
        lab1  = new JLabel("Frist Name");
        lab2  = new JLabel("Second Name");
        lab3  = new JLabel("National ID");
        lab4  = new JLabel("Date of Brith");
        lab5  = new JLabel("Day");
        lab6  = new JLabel("Month");
        lab7  = new JLabel("Year");
        lab8  = new JLabel("Statues");
        lab9  = new JLabel("Number of Members");
        lab10 = new JLabel("Job");
        lab11 = new JLabel("Campany/Organization");
        lab12 = new JLabel("Address");
        lab13 = new JLabel("E-Mail Address");
        lab14 = new JLabel("Password");
        lab15 = new JLabel("Mobile Phone");
        lab16 = new JLabel("Home Phone");
        
        //BackGround
//        BG2= new JLabel ();
//        BG2.setIcon(new ImageIcon("E:\\faculty of com. and inf\\level 2-A\\PL2\\java projects\\Registration_Code\\build\\classes\\registration_code\\bg2.jpg"));
//        BG2.setBounds(550, 5, 142, 130);
        BG = new JLabel ();
        BG.setIcon(new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Images\\Eskandr\\Untitled-6.jpg"));
        BG.setBounds(0, 0, 700, 680);
        
        
                  
        //TextFields
        tf1 =new JTextField (20);
        tf2 =new JTextField (20);
        tf3 =new JTextField (100);
        tf9 =new JTextField (15);
        tf10 =new JTextField (50);
        tf11 =new JTextField (100);
        tf12 =new JTextField (100);
        tf13 =new JTextField (100);
        ps = new JPasswordField(50);
        tf15 =new JTextField (50);
        tf16 =new JTextField (50);
        
        //ComboBox
        String [] x5 ={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String [] x6 ={" ","January","February","March","April","May","June","July","Augest","September","October","November","December"};
         String [] x7 = new String [46];
        int i = 1996;
        String number;
        
        x7[0] = " ";
        
        for(int j = 1;j <= x7.length+1; j++,i--)
        try{
            x7[j] = "" + i;
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("fuck");
        }
        
        String [] x8  ={" ","Single","Married"};   
       
        cb5 = new JComboBox (x5);
        cb6 = new JComboBox (x6);
        cb7 = new JComboBox (x7);
        cb8 = new JComboBox (x8);


        lab1.setBounds(130, 150, 70, 60);
          tf1.setBounds(200, 170, 150, 20);
          
        lab2.setBounds(360, 150, 80, 60);
          tf2.setBounds(450, 170, 150, 20);
          
        lab3.setBounds(130, 180, 90, 60);
          tf3.setBounds(200, 200, 250, 20);
          
        lab4.setBounds(120, 210, 90, 60);
        
        lab5.setBounds(200, 210, 40, 60);
          cb5.setBounds(230, 230, 50, 20);
          
        lab6.setBounds(300, 210, 40, 60);
          cb6.setBounds(345, 230, 100, 20);
          
        lab7.setBounds(460, 210, 40, 60);
           cb7.setBounds(500, 230, 80, 20);
           
        lab8.setBounds(140, 250, 80, 60);
           cb8.setBounds(200, 270, 80, 20);
           
        lab9.setBounds(350, 250, 200, 60);
           tf9.setBounds(480, 270, 100, 20);
          
        lab10.setBounds(160, 290, 40, 60);
          tf10.setBounds(200, 310, 250, 20);
          
        lab11.setBounds(60, 330, 150, 60);
          tf11.setBounds(200, 350, 250, 20);
          
        lab12.setBounds(140, 380, 80, 60);
          tf12.setBounds(200, 400, 250, 20);
          
        lab13.setBounds(100, 430, 100, 60);
          tf13.setBounds(200, 450, 250, 20);
          
        lab14.setBounds(130, 480, 80, 60);
          ps.setBounds(200, 500, 250, 20);
          
        lab15.setBounds(110, 530, 80, 60);
          tf15.setBounds(200, 550, 250, 20);
          
        lab16.setBounds(110, 570, 80, 60);
          tf16.setBounds(200, 590, 250, 20);
          

          

        add (lab1);
          add(tf1);
        add (lab2);
          add(tf2);        
        add (lab3);
          add(tf3);        
        add (lab4);
        add (lab5);
          add(cb5);
        add (lab6);
           add(cb6);
        add (lab7);
          add(cb7);        
        add (lab8);
          add(cb8);        
        add (lab9);
          add(tf9);
        add (lab10);
          add(tf10);        
        add (lab11);
          add(tf11);        
        add (lab12);
          add(tf12);        
        add (lab13);
          add(tf13);        
        add (lab14);
          add(ps);        
        add (lab15);
          add(tf15);        
        add (lab16);
          add(tf16);        
       
        // Buttons
        btn2 = new JButton ("Submit");
        btn3 = new JButton ("Back");
        btn4 = new JButton ("Cancel");
        
        btn2.setBounds(420, 640, 80 ,25);
        btn3.setBounds(510, 640, 70 ,25);
        btn4.setBounds(590, 640, 80 ,25);
        
        // Actions
        btn2.addActionListener(new submitMember());
        btn3.addActionListener(new back());
        btn4.addActionListener(new cancel());
        
//        btn2.addAncestorListener(new submitcoach());
        add(btn2);
        add(btn3);
        add(btn4);
        
        //Set Background
//        getContentPane().add(BG2);
        getContentPane().add(BG);
    }

    private class cancel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Registration_Code.this, "Thank you !", "Information", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    } 
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Member_login_code log = new Member_login_code();
            log.setVisible(true);
            dispose();
        }
        
    }
                    

    private class submitMember implements ActionListener {
     
        @Override
        public void actionPerformed(ActionEvent e) {
           
            Gmes g = new Gmes();
                    g.setSize(620, 440);
                    g.setLocationRelativeTo(null);
                    g.setResizable(false);
                    g.setVisible(true);
            boolean check = false;
           if (tf1.getText().equals("") || tf2.getText().equals("") || tf3.getText().equals("") ||  cb5.getItemAt(cb5.getSelectedIndex()) .equals(" ") || cb6.getItemAt(cb6.getSelectedIndex()) .equals(" ")|| cb7.getItemAt(cb7.getSelectedIndex()) .equals(" ") || cb8.getItemAt(cb8.getSelectedIndex()) .equals(" ") || tf9.getText().equals("") || tf10.getText().equals("") || tf11.getText().equals("") || tf12.getText().equals("") || tf13.getText().equals("") || tf15.getText().equals("") || tf16.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Complete You Application Please !!", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
            else{
                System.out.println("hello11");
                String FN = tf1.getText();
                String SN = tf2.getText();
                int ID = Integer.parseInt(tf3.getText());
                
                int Day = Integer.parseInt((String) cb5.getItemAt(cb5.getSelectedIndex()));
                String Month = (String) cb6.getItemAt(cb6.getSelectedIndex());
                int Year = Integer.parseInt((String) cb7.getItemAt(cb7.getSelectedIndex()));
                
                String statues = (String) cb8.getItemAt(cb8.getSelectedIndex());
                int NumOfMem = Integer.parseInt(tf9.getText());
                String job = tf10.getText();
                String Comp = tf11.getText();
                String Addr =tf12.getText();
                String Email = tf13.getText();
                String Pass = ps.getText();
                int Mphone = Integer.parseInt(tf15.getText());
                int Hphone = Integer.parseInt(tf16.getText()); 
                System.out.println("hello16");
                
                        
            

                File f = new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\Information.txt");
                
                Scanner Sc;
                ArrayList<String> File_Data = new ArrayList<>();
                
            try {
                Sc = new Scanner(f);
                while (Sc.hasNext()) {
                    File_Data.add(Sc.nextLine());
                }

                File_Data.add(FN+"%"+SN+"%"+ID+"%"+Day+"%"+Month+"%"+Year+"%"+statues+"%"+NumOfMem+"%"+job+"%"+Comp+"%"+Addr+"%"+Email+"%"+Pass+"%"+Mphone+"%"+Hphone);
                PrintWriter pw = new PrintWriter("Information.txt");

                for (int i = 0; i < File_Data.size(); i++) {
                    pw.println(File_Data.get(i));
                }
                check = true;
                System.out.println("hello3");
                pw.close();
                if(check){
                    JOptionPane.showMessageDialog(Registration_Code.this, "Successfully submit", "Ezaik", JOptionPane.INFORMATION_MESSAGE);
                    Gmes g = new Gmes();
                    g.setSize(620, 440);
                    g.setLocationRelativeTo(null);
                    g.setResizable(false);
                    g.setVisible(true);
                    dispose();
                    
                }  
                else  
                    JOptionPane.showMessageDialog(Registration_Code.this, "Plese complite your application !!", "missing", JOptionPane.ERROR_MESSAGE);
                    
            } catch (FileNotFoundException ex) {
                System.out.println("hello");
                
            }
            
        }
//                if(FN.equals(null)) {
//                JOptionPane.showMessageDialog(Registration_Code.this, "kamel ya baba !!", "error", JOptionPane.ERROR_MESSAGE);
//                check = false;
//                }
                
    }
 }
 }   
    

