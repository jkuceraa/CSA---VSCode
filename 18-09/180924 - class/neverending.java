/**
 * 1) Java keeps running and taking a lot of CPU
 * 2) takes even more CPU
 * 3) kill it in task mgr
 * 4) counter, timer - counter implemented
 */
public class neverending{
    public static void main(String[] args){
        int i = 0;
        int count = 0;
        while(true){
           
            System.out.println(i+"");
            count++;
            if(count>1000)
                break;       
        }
    }
}