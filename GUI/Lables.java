import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Lables {
    public static void main(String[] args) {
        
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        ImageIcon bgimg = new ImageIcon("logo.png");

        JLabel label = new JLabel(); //or can pass text as an instance in paranthesces
        label.setText("Bro do you");
        label.setIcon(bgimg);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0, 255, 0)); // set text color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font
        label.setIconTextGap(-20); //gap
        label.setBackground(Color.black); //needs opaque to work
        label.setOpaque(true);
        label.setBorder(border);
        
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //after null layout complete white screen is present so manually setting it x, y, position
        //label.setBounds(100, 100, 500, 500);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1000, 1000);

        //frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label);

        //now we can also comment out line 30, 34, 36 and use this to auto resize accordfing to the components
        frame.pack();
        //this pack method should alsoo be the last line or else the components after this wont be added to the label
    }
}