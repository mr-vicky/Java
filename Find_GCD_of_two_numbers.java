public class Find_GCD_of_two_numbers {
    // Method 1: 
    static int getGCD(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for(int i = min; i >= 1; i--){
            if(max % i == 0 && min % i == 0){
                return i;
            }
        }
        return -1;
    }

    // Method 2: 
    static int getGCD2(int a, int b){
        while(a != b){
            if(a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
    public static void main(String args[]){
        int a = 100;
        int b = 200;

        // Method 1
        System.out.println(getGCD(a, b)); 
        // Method 2
        System.out.println(getGCD2(a, b));
    }
}
