import java.util.*;

public class Digits_of_a_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            System.out.println(n % 10);
            n /= 10;
        }
    }
};
