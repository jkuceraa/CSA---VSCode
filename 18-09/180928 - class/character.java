public class character{
    public static void main(String[] args){
        char charvar = 'A';
        for(int i=1;i<50;i++){            
            for(int j=0;j<i;j++){
                System.out.print(charvar);
            }
            System.out.println("");
            charvar++;
        }
    }
}