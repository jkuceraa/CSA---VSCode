import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args){
        int a = askForInt("Enter int: ");
        int b = askForInt("Enter int 2: ");
        if(a>b)
            showMessage("A is greater than B");
        else if(a==b)
            showMessage("A equals B");
        else
            showMessage("A is smaller than B");
        showMessage("A*B equals "+a*b);   
    }
    public static void showMessage(String string){
        JOptionPane.showMessageDialog(null,string);
    }
    public static int askForInt(String message){
        int value = Integer.parseInt(JOptionPane.showInputDialog(message));
        return value;
    }
}