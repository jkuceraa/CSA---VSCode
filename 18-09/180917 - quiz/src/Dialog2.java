import javax.swing.JOptionPane;
public class Dialog2{
    public static void main(String[] args){
        String firstQuery = "What is your first name?";
        String lastQuery = "What is your last name?";
        String firstName;
        String lastName;
        firstName = JOptionPane.showInputDialog(firstQuery);
        lastName = JOptionPane.showInputDialog(lastQuery);
        JOptionPane.showMessageDialog(null,"Go fuck yourself, "+firstName+" "+lastName);
    }
}