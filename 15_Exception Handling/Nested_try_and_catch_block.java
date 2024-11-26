public class Nested_try_and_catch_block {
    public static void main(String args[]){
        int A[] = {10, 20, 30, 40, 0};

        try
        {
            int c = A[0]/A[3];
            System.out.println("Division is "+ c);

            try
            {
                System.out.println(A[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Divider cannot be zero!");
        }
        
        System.out.println("Bye");
    }
}
