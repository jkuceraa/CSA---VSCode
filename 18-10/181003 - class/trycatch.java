public class trycatch{
    public static void main(String[] args){
        try {
            String number = "one";
            int numnum = Integer.parseInt(number);
        }
        //catches wrong conversions of numbers 
        catch (NumberFormatException e) {
            System.err.println("exception is this: " + e.getMessage());
        }
    }
}