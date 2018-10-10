import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;
public class Guess
{
    
    public static void main(String[] args){
        int border = askForInt("Enter upper boundary:");
        double random = Math.random()*(border);
        int number = (int)random;
        int guess = -5;
        int numGuess = 1;
        int i = 0;
        for(i=0;i<10;i++){
            guess = askForInt("Guess the number");
            if(guess>number)
                showMessage("Number is smaller!");
            else if(guess<number)
                showMessage("Number is larger!");
            else{
                showMessage("Correct!");
                showMessage("It took you "+numGuess+" guesses.");
                break;
            }
            numGuess++;    
        }
        if(i>9)
            showMessage("You lost!");
    }
    public static void showMessage(String string){
        JOptionPane.showMessageDialog(null,string);
    }
    public static int askForInt(String message){
        int value = Integer.parseInt(JOptionPane.showInputDialog(message));
        return value;
    }
}