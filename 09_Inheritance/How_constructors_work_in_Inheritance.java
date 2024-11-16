class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Children Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}

public class How_constructors_work_in_Inheritance {
    public static void main(String args[]){
        GrandChild c = new GrandChild();
    }
}