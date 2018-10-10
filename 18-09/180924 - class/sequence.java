import javax.swing.JOptionPane;
public class sequence{
    public static void main(String[] args){
        try{
        int rows = askForInt("How many rows?");
        int cols = askForInt("How many columns?");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(j+","+i+" ");
            }
            System.out.println("");
        }
}
catch(NumberFormatException e){
    System.err.println("exception is this: " + e.getMessage());
}
}


    public static int askForInt(String message){
        int value = Integer.parseInt(JOptionPane.showInputDialog(message));
        return value;
    }
}

    
