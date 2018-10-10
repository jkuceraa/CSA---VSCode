public class test{
    public static void main(String[] args){
        double sum = 0;
        for(int i = 0; i<=64;i++){
            double number = Math.pow(2,i);
            System.out.println(number+"");
            sum+=number;
        }
        System.out.println("Sum is "+sum);
        System.out.println("\nNow the second task:");

        int i = 0;
        int number = 0;
        while(number<=Short.MAX_VALUE){
            number += 7;
            i++;
        }
        System.out.println(i+"");
        System.out.println("Maximum of short is: "+Short.MAX_VALUE);
    }
}
