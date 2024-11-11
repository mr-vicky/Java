public class Method_Overloading {
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static float add(float a, float b){
        return a + b;
    }
    public static void main(String args[]){
        System.out.println(add(4, 6));
        System.out.println(add(1, 2, 3));
        System.out.println(add(2.3f, 4.5f));
    }
}
