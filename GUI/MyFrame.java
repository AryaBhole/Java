// Instead of using JFrame directly in the file you can use a parent class as such
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    //Make a constructor with the same code from the file but this saves time reusability and changes can be made with the original file itself
    

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();    
        checkBox.setText("I'm not a robot"); //or pass this directly
        // can do same stuff as we have been doing uptill now with action listener and other font and icon stuff

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}   

// we can remove the actionListener tihing entirely and do button.addActionListener(e -> System.out.println());
// this is a lambda expression