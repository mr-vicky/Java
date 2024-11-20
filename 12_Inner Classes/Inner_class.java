class Outer{
    public int x = 10;

    class Inner{
        public int y = 5;
        public void innerDisplay(){
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class Inner_class {
    public static void main(String args[]){
        // Method 1: to access inner class members
        Outer o = new Outer();
        o.outerDisplay();
        System.out.println();

        // Method 2: to access inner class members
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }
}

// NOTES ***
// What are inner classes?
// --> We can have a class inside another class, (nested classes)

// Need of Inner classes --> 
//        - If the class is becoming very big and to make it simple we use inner classes
//        - To reduce the complexity inside the bigger class we can define a class inside a class which is a inner class
//        - Likewise we can even define interface inside interface

// Types of INNER CLASSES -->  

// 1. Nested inner class
//  - inner class can directly access the members of outer class
//  - inner classes are can be used by outer classes, Outer class can access the members of inner class by using an object of a inner class

// 2. Local inner class
// 3. Anonymous inner class 
// 4. Static inner class