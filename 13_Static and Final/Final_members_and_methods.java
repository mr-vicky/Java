// Final Class --> 
final class Parent{
    public Parent(){
        System.out.println("Parent");
    }
}

// ERROR: Final class cannot be extended
// class Child extends Parent{
//     public Child(){
//         System.out.println("Child");
//     }
// }

// Final methods -->
class Test1{
    final void show(){
        System.out.println("Test1");
    }
}

// ERROR: Final methods cannot be overriden
// class Test2 extends Test1{
//    void show(){
//     System.out.println("Test2");
//    }
// }

public class Final_members_and_methods {
    // Final Members --> 
    // method 1: 
    final float PI = 3.1425f; 

    // Method 2: 
    final String ACCOUNT_NO;

    {
        ACCOUNT_NO = "AC1014884";
    }

    static String ACCOUNT_NO_CUSTOMER;
    static {
        ACCOUNT_NO_CUSTOMER = "DC000001";
    }

    // Method 3: 
    final int MAXIMUM;
    Final_members_and_methods(){
        MAXIMUM = 100000;
    }
    public static void main(String args[]){
    
    }
}

// NOTES ***

// final properties--> 
// - final keyword is used to create valriable with constant values
// - their values are fixes,
// - we cannot modify their values
// - final variable are written in capital letters example- PRICE, ACCOUNT_NO

// Initilization: 
// There are three methods for initilization
// Method 1: while declaring the variable
// Method 2: Using static method
// Method 3: Initilize in the constructor of the class

// final methods: 
// final methods cannot be overriden 

// final class: 
// final class cannot be extended(inherited)