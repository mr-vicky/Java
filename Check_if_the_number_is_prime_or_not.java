import java.util.*;

public class Check_if_the_number_is_prime_or_not {
    static boolean isPrime(int num){
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPrime(num));
    }   
}