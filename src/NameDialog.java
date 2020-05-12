import javax.swing.JOptionPane;

/**
 * @author Issa Khodadadi 5/10/2020, 11:00 AM
 **/
public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter ur name");
        String message = String.format("welcome %s to my world", name);
        JOptionPane.showMessageDialog(null, message);
    } // end main method
} // end NameDialog
