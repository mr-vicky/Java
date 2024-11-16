class Super{
    public void method1(){
        System.out.println("Super Method 1");
    }
    public void method2(){
        System.out.println("Super Method 2");
    }
}

class Sub extends Super{
    @Override
    public void method2(){
        System.out.println("Sub Method 2");
    }
    public void method3(){
        System.out.println("Sub Method 3");
    }
}

public class Dynamic_method_dispatch_example {
    public static void main(String args[]){
        Super sup = new Super();
        sup.method1();
        sup.method2();
        System.out.println();

        Sub sub = new Sub();
        sub.method1();
        sub.method2();
        sub.method3();
        System.out.println();

        // Dynamic Method: dispatch is used to achieve runtime plymorphism
        Super ss = new Sub();
        ss.method1();
        ss.method2();
    }
}

// NOTES ***
// static methods are cannot be overriden 
// final methods are cannot be overriden
