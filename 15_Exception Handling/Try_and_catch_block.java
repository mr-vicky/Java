public class Try_and_catch_block{
    public static void main(String args[]){
        int  a = 10, b = 0;
        
        try{
            int res = a / b; // Exception: Arithmatic Exception
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero!, try again ");
        }

        System.out.println("Bye");
    }
}