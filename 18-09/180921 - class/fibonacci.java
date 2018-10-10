public class fibonacci{
    public static void main(String[] args){
        int a = 1;
        int b = 1;
        System.out.println(a+"\n"+b);
        for(int i=0;i<10;i++){
            if(i%2==0){
                a = a + b;
                System.out.println(a+"");
            }
            else{
                b = a + b;
                System.out.println(b+"");
            }
        }
    }
}