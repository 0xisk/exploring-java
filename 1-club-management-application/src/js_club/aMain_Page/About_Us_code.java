
package js_club.aMain_Page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
public class About_Us_code extends JFrame {
  
   private JButton b1 , b2; 
   private JLabel bg;
   private JLabel label , labe2;
   private JTextArea Txt , Txt2 , Txt3;
   
   public About_Us_code (){
        
        setSize(1008, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.setTitle("About us");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        
        bg = new JLabel ();
        bg.setIcon(new ImageIcon("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\src\\js_club\\Main_Page\\bg3.jpg"));
        bg.setBounds(0, 0, 1000, 700);
        
        label = new JLabel();
        label.setText("History");
        label.setFont(new Font("Times",Font.BOLD,30));
        label.setBounds(100, 180, 160, 40);
        this.add(label);
        
//        labe2 = new JLabel();
//        labe2.setText("History");
//        labe2.setFont(new Font("Times",Font.BOLD,30));
//        labe2.setBounds(100, 180, 160, 40);
//        this.add(label);
       
         
        b1=new JButton ("Cancel");
        b2=new JButton ("Back");

        
        b1.setBounds(850, 600, 80, 25);
        b2.setBounds(760, 600, 80, 25);
        
        
        add(b1);
        add(b2);
        
        b1.addActionListener(new cancel());
        b2.addActionListener(new back());
               
         Txt = new JTextArea(
         "  * JS CLUB Holding has successfully created a bouquet of multifaceted operations encompassing everything from sports facilities."
         );
         Txt.setFont(new Font("Serif", Font.ITALIC,20));
         Txt.setLineWrap(true);
         Txt.setWrapStyleWord(true);
         Txt.setEditable(false);
         Txt.setBounds(130, 220, 700, 60);
         add(Txt);

         getContentPane().add(bg);
   }
    
     private class cancel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(About_Us_code.this, "Thank you !", "Information", JOptionPane.INFORMATION_MESSAGE);
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
 
    
    
}
