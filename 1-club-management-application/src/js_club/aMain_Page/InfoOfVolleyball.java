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
public class InfoOfVolleyball extends JFrame {
    
        JLabel backgroundLabel;
        BufferedImage io;
        Icon icon;
        
        public InfoOfVolleyball() throws IOException {
            
           this.setResizable(false);
           this.setLocationRelativeTo(null);
           this.setSize(500, 500);
           
           this.setLayout(null);
           
           try {
                io = ImageIO.read(new File("C:\\Users\\Eskandr samir\\Desktop\\JS_Club\\src\\js_club\\Main_Pagevolleyball.jpg"));
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
            
        g.setColor(Color.ORANGE);
        g.setFont(new Font("Serif", Font.PLAIN , 20));
        g.drawString("Volleyball is a team sport in which two teams of six players", 50, 100);
        g.drawString(" Each team tries to score points by grounding a ball", 50, 160);
        g.drawString("a player on one of the teams begins a 'rally' by serving the ball", 50, 220);
        g.drawString("foot fault: the foot crosses over the boundary line when serving", 50, 280);
        g.drawString("The ball is usually played with the hands or arms", 50, 340);
        g.drawString("players can legally strike or push (short contact) the ball", 50, 400);
        g.drawString("the first two touches are used to set up for an attack", 50, 460);
            
        }
    
}
