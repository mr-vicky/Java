import java.lang.*;

public class BitwiseOperators {
    public static void main(String args[]){
        int x = 0b1010;
        System.out.println(x);
        System.out.println(String.format("%32s", Integer.toBinaryString(x)));
        x = ~x;
        System.out.println(String.format("%32s", Integer.toBinaryString(x)));
    }    
}
