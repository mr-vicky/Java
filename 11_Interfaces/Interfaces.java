interface Test{
    public void meth1();
    public void meth2();
}

class Sub implements Test{
    public void meth1(){
        System.out.println("Sub meth1");
    }
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("Sub meth3");
    }
}

public class Interfaces {
    public static void main(String args[]){
        Test t = new Sub();
        t.meth1();
        t.meth2();
        // t.meth3(); // we cannot use meth3, because it is not interface
        System.out.println();

        Sub s = new Sub();
        s.meth1();
        s.meth2();
        s.meth3();
    }
}