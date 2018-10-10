import javax.swing.JOptionPane;
public class quiz{
    private static final int START_YEAR = 1880;
    private static final int END_YEAR = 2018;
    public static void main(String[] args){
        try{
        //leap years
        leapYears();
        System.out.println("");
        //prime check
        int number = askForInt("Enter a number to check!");
        primeCheck(number);
        System.out.println("");
        //primes list
        int min = askForInt("Enter lower boundary");
        int max = askForInt("Enter upper boundary");
        primeList(min,max);
    }
        
            catch (NumberFormatException e) {
                System.err.println("exception is this: " + e.getMessage());
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
     * leap year list
     * @return list of leap years
     */
    public static void leapYears(){
        for(int i=START_YEAR;i<=END_YEAR;i++){
            if((i%4==0&&i%100!=0)||(i%100==0&&i%400==0)){
                System.out.println(i+"");
            }
        }
    }
   /**
    * checks if a number is a prime
    * @param num - number to check
    * @return check if is or isn't prime
    */
    public static void primeCheck(int num){
        
        boolean divisible = false;
        for(int i = 2;i<num;i++){
            if(num%i==0&&num!=i){
                divisible = true;
            }
        }
        if(divisible==true){
            System.out.println("The number is not a prime.");
        }
        else{
            System.out.println("The number is a prime.");
        }
    }
    /**
     * lists prime numbers
     * @param min - userdefined lower limit
     * @param max - userdefined upper limit
     * @return list of prime numbers
     */
    public static void primeList(int min, int max){
        
        boolean divisible2 = false;
        for(int i=min;i<=max;i++){
            for(int j=2;j<max;j++){
                if(j!=i&&i%j==0){
                    divisible2 = true;
                }
                
            }        
            if(divisible2 == false&&i>1){
                System.out.println(i+"");
            }
            divisible2 = false;
        }
    }
}