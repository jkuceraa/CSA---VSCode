import javax.swing.JOptionPane;
public class test{
    public static void main(String[] args){
        try{
        int a = askForInt("What is the number you want to divide?");
        int b = askForInt("What is the divisor?");
        int divided = division(a,b);
        System.out.println("The result: "+divided);
    }
    catch(IllegalArgumentException e){
        System.err.println(e.getMessage());
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
    /**
     * divides the two input numbers
     * @param int a - number to divide
     * @param int b - number to divide with
     * @return result
     * @throws IllegalArgumentException
     */
    public static int division(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("You cannot divide by 0!");
        }
        return a/b;
    }
}