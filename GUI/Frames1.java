import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("Title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(480, 480);
        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());

        frame.getContentPane().setBackground(Color.CYAN); //can use rgb values with new Color(0, 0, 0) or hex code with new Color(0x000FFF)

        
    }
}