interface Test1{
    final static public int X = 10; // variable in interfaces are by default final and static and should be written in UpperCase characters
    abstract public void meth1();
    abstract public void meth2();

    public static void meth3(){
        // interfaces can have static methods with bodies
        System.out.println("Meth 3 of Test");
    }
    // java versoin 9 onwards pravate methods are also allowed in interfaces, but they are should not be abstract methods, private methods are not usedful outside the interfaces
    private void meth6(){
        System.out.println("private method meth6 from Test6");
    }
    // default methods are also allowed in the Java
    default public void meth5(){
        System.out.println("This is a default meth5 from Test1");
        meth6();
    }
}

// Interface can extends from another interface
interface Test2 extends Test1{
    public void meth4();
}

class My implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}

}

public class Rules_of_interfaces {
    public static void main(String args[]){
        // we can directly access the interface static methods and properties
        // System.out.println(Test.X);
        // Test.meth3();
    }
}
