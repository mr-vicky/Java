public class Factorial_of_the_number {
    public static void main(String args[]){
        // Print the table of 5
        int num = 5;
        for(int i = 1; i <= 10; i++){
            System.out.println(5*i);
        }
        System.out.println();
        // Find the sum of N number
        int n = 5;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);

        // Factorial of a number
        n = 5;
        int factorial = 1;
        for(int i = n; i > 0; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
};
