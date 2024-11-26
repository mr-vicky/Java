class lowBalenceException extends Exception{
    public String toString(){
        return "Balence cannot be less than 5000";
    }
}

public class User_defined_Exceptions {
    static void fun1(){
        try
        {
            throw new lowBalenceException();
        }
        catch(lowBalenceException e){
            System.out.println(e);
        }
    }
    
    static void fun2(){
        fun1();
    }
    
    static void fun3(){
        fun2();
    }
    public static void main(String args[]){
        fun3();
    }
}