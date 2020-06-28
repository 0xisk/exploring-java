package js_club.aMain_Page;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author boulaawnyazmy
 */
public class InfoOfHandball extends JFrame {
    
        JLabel backgroundLabel;
        BufferedImage io;
        Icon icon;
    
        public InfoOfHandball() throws IOException {
            
           this.setResizable(false);
            this.setLocationRelativeTo(null);
           this.setSize(500, 500);
           
           this.setLayout(null);
           
           try {
                io = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\src\\js_club\\Main_Page\\handball.jpg"));
            }
            catch(IOException ex) {
                System.out.println("cannot open the image.");
            }
           
            icon = new ImageIcon(io);
            backgroundLabel = new JLabel(icon);
            backgroundLabel.setBounds(0, 0, 1280, 800);
            this.add(backgroundLabel);
            
        }
        
        public void paint(Graphics g) {
            
        g.drawImage(io,0,0,1280,800,null);
            
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Serif",Font.PLAIN, 20));
        g.drawString("team sport in which two teams of seven players each", 50, 100);
        g.drawString("pass a ball using their hands with the aim of throwing it", 50, 160);
        g.drawString(" A standard match consists of two periods of 30 minutes", 50, 220);
        g.drawString("Modern handball is played on a court 40 by 20 metres", 50, 280);
        g.drawString("The goals are surrounded by a 6-meter (20 ft) zone", 50, 340);
        g.drawString("The sport is usually played indoors", 50, 400);
        g.drawString("The game is fast and high-scoring", 50, 460);
            
        }
        
}
