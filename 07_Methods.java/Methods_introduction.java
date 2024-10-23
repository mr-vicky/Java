public class Methods_introduction {

    static int max(int x, int y){
        if(x > y)   
            return x;
        else 
            return y;
    }
    public static void main(String args[]){
        int a = 3, b = 4, c;

        // Method 1: By adding static keyword at the function signature
        c = max(a, b);

        // Method 2: Without using static keyword in the function
        // Methods_introduction mi = new Methods_introduction();
        // c = mi.max(a, b);
        System.out.println(c);
    }
};
