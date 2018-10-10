import javax.swing.JOptionPane;
public class staircase{
    public static void main(String[] args){
        int n = askForInt("Enter staircase n");
        for(int i=0;i<n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    /**
     * Asks for integer input
     * @param message - userdefined string
     * @return integer by user
     */
    public static int askForInt(String message){
        int value = Integer.parseInt(JOptionPane.showInputDialog(message));
        return value;
    }
}

