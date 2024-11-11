public class Variable_Arguments {
    static int add(int ...x){
        int res = 0;
        for(int it: x){
            res = res + it;
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3, 4, 5));
    }
}

// NOTES ***
// Writing the method that takes any number of parameters 
