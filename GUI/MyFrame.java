// Instead of using JFrame directly in the file you can use a parent class as such
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    //Make a constructor with the same code from the file but this saves time reusability and changes can be made with the original file itself
    
    JButton button;
    
    MyFrame() {
        
        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        //can add icon same as beafore
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(false);
        // you can also make suff appear after 1 click by using actionPerformed thing

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("hii");
        }
    }
}

// we can remove the actionListener tihing entirely and do button.addActionListener(e -> System.out.println());
// this is a lambda expression