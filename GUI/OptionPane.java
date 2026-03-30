import javax.swing.JOptionPane;


public class OptionPane {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.ERROR_MESSAGE);

        //int ans = JOptionPane.showConfirmDialog(null, "bro?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(ans);// diffrent for all 4 buttons

        String name = JOptionPane.showInputDialog("What is your name : ");
        System.out.println(name);
        // there is another one with way more custumization that is setting own icon and all
        // you can add an array in options in args
        //JOptionPane.showInputDialog(parentComponent, name, name, messageType, icon, args, name);
    }
}