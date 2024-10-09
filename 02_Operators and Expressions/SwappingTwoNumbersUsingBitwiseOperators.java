import java.lang.*;

class SwappingTwoNumbersUsingBitwiseOperators{
    public static void main(String args[]){
        int a = 9;
        int b = 12;

        // Swapping two numbers using XOR Operator
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a: "+a +" b: "+b);
    }
}