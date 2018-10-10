import javax.swing.JOptionPane;
public class homework{
    public static void main(String[] args){
        casting();
        parsing();
        double distance = d(askForInt("What is the time?"));
        System.out.println("Distance is "+distance);
        int result = (2-5*3%2)%(2*3+4); //result is calculated first within brackets and then left to right multiplication, division and remainder and in the end, subtraction and addition
        System.out.println(result+"");
    }
    /**
     * is compliant with the first part of homework - casts three different types of data
     */
    public static void casting(){
        double num1 = 3.254;
        int res1 = (int) num1;
        long num2 = 3;
        double res2 = (double) num2;
        short num3 = 2;
        int res3 = (int)num3;
        System.out.println(res1+" "+res2+" "+res3);

    }
    /**
     * is compliant with second task - parses three strings
     */
    public static void parsing(){
        String num1 = "2.254";
        double res1 = Double.parseDouble(num1);
        String num2 = "3";
        int res2 = Integer.parseInt(num2);
        String num3 = "5";
        short res3 = Short.parseShort(num3);
        System.out.println(res1+" "+res2+" "+res3);
    }
    /**
     * calculates distance from time
     * @param int t - time in seconds
     * @return double d - distance
     */
    public static double d(int t){
        double g = 9.80655;
        double d = 1/2*(g*Math.pow(t,2));
        return d;
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