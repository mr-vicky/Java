class Test{
    static int x = 10;
    public int y = 20;

    public void show(){
        System.out.println(x + " " + y);
    }

    static void display(){
        System.out.print(x);
        // System.out.print(y); // ERROR: non-static member cannot be accessed by the static method
    }
}

public class Static_members_and_methods {
    public static void main(String args[]){
        Test t1 = new Test();
        t1.show();
        t1.x = 100; // static values are shared by all the objects
        t1.y = 200;

        Test t2 = new Test();
        t2.show();
        // t2.display();
    }
}

// NOTES ***
// Static: 
// - static keyword is used for representing metadata(data about data)
// - Used for represting the information of a class, not about objects, though all the object cann share that information
// - they can be used as a shared data by all the objects
// - they are stored in the method area
// - Static methods and obejects can be called direcly using the classnam
// - Static methods can only access the static members 
// - this and final keyword dont work in static methods
// - Outer classes can't be static, only inner-classes can be static classes