import java.io.*;

public class Unchecked_and_checked_Exception {
    static void fun1(){
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e){
            // Here in the following cases the compiler not giving any message or warning hence these are uncheked exceptions
            System.out.println(e.getMessage());
            e.printStackTrace(); // not recommended! to use printStackTrack();
        }
    }

    static void fun2(){
        // FileInputStream fi = new FileInputStream("my.txt"); // this exception is checked exception, compiler will not compile the programming, if we don't handle this exception.
        fun1();
    }

    static void fun3(){
        fun2();
    }
    public static void main(String args[]){
        fun3();
    }
}