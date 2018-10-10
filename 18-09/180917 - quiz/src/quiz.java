public class quiz
{
    public static void main(String[] args){
        //circumference
        int radius = 4;
        double circumference = 2*Math.PI*radius;
        System.out.println("The circumference is "+circumference);
        //BMI formula
        int weight = 80;
        double height = 1.80;
        double bmi = weight/Math.pow(height,2);
        System.out.println("The BMI is "+bmi);
        //Ohm's law
        int V = 230;
        int R = 10;
        double I = V/R;
        System.out.println("The A equals "+I);
        //logical operations
        boolean A = true;
        boolean B = false;
        boolean result = !A&&((A&&B)||!B);
        System.out.println("The result is "+result);


    }
}