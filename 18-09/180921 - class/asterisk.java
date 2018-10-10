import javax.swing.JOptionPane;
public class asterisk{
    public static void main(String[] args){
        int x = askForInt("Enter an int: ");
        
        for(int j=0;j<x;j++){
        for(int i=0;i<j;i++){
            System.out.print("+");
        }
        for(int h=x;(h-1)>j;h--){
            System.out.print("*");
        }
        
        System.out.println();
    }
        
         
    }

    public static void showMessage(String string){
        JOptionPane.showMessageDialog(null,string);
    }
    public static int askForInt(String message){
        int value = Integer.parseInt(JOptionPane.showInputDialog(message));
        return value;
    }
}