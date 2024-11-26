public class Multiple_try_and_catch_block {
    public static void main(String args[]){
        int A[] = {10, 20, 30, 40, 0};
        try
        {
            int c = A[0]/A[2];
            System.out.println("Division is "+ c);
            System.out.println(A[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Divider cannot be zero!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid!"+ e);
        }
        System.out.println("Bye");
    }
}
