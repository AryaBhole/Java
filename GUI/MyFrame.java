// Instead of using JFrame directly in the file you can use a parent class as such
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
    //Make a constructor with the same code from the file but this saves time reusability and changes can be made with the original file itself
    
    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        // can change the font, foreground, background, bliner line(caret) color, default text, setEditable, change this and set enabled in action listner to only take one input        

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Welcome " + textField.getText());
        }
    }
}   

// we can remove the actionListener tihing entirely and do button.addActionListener(e -> System.out.println());
// this is a lambda expression