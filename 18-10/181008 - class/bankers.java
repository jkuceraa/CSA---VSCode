public class bankers{
    public static final double F0 = 100000;
    public static final double P = 1;
    public static final double C0 = 2000;
    public static final int N = 15;
    public static final int INF = 1;
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        boolean z = (x+=4)!=(y*=3)||(x!=(y*2));
        System.out.println(z+"");
    }
}