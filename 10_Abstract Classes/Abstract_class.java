abstract class Super{
    public Super(){
        System.out.println("Super Cunstructor");
    }
    public void meth1(){
        System.out.println("Super Meth1");
    }

    abstract public void meth2(); // abstract method
}

class Sub extends Super{
    // We have to override the metho 2 of the parent class if we dont to make this class as the abstract class
    @Override
    public void meth2(){
        System.out.println("Sub Meth2");
    }

    public void meth3(){
        System.out.println("Sub Meth3");
    }
}

public class Abstract_class {
    public static void main(String args[]){
        // Super s = new Super(); // error: Super is abstract; cannot be instantiated
        // s.meth1();

        Sub sub = new Sub();
        sub.meth2();
        sub.meth3();
    }
}

// NOTES ***
// Abstract class -->
//  - For any abstract class we can declare the reference
//  - but we cannot create a object 
//  - If a class contains one or more abstact methods then that classes are abstract classes
//  - A class can be an abstract class without abstract methods
//  - If a class is inheriting from the abstract class then it must be declared as the abstract class or the abstract methods of the parent class are must be overriden.

// Need of Abstract class -->
//  - Abstract classes are used to give standerds to the subclasses

// Rules --> 
// final keyword : If the class is abstract then we cannot make final, we cannot use the final keyword for abstract classes
// final keyword: abstract methods are cannot be final
// static keyword: We cannot make the abstract classes as static 
// static keyword: abstract methods cannot be static
