// Instead of using JFrame directly in the file you can use a parent class as such
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    //Make a constructor with the same code from the file but this saves time reusability and changes can be made with the original file itself
    MyFrame() {

        this.setTitle("Title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(480, 480);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("logo.png");
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(Color.CYAN);
    }    
}