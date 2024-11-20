abstract class Hospital{
    public Hospital(){
        System.out.println("Hospital Constructor");
    }
    abstract public void emergency();
    abstract public void appointment();
    abstract public void billing();
}

class MyHospital extends Hospital{
    public MyHospital(){
        System.out.println("MyHospital Constructor");
    }
    @Override
    public void emergency(){
        System.out.println("MyHospital Emergency");
    }
    @Override
    public void appointment(){
        System.out.println("MyHospital appintment");
    }
    @Override
    public void billing(){
        System.out.println("MyHospital billing");
    }
}

public class Abstract_class_example_hospital {
    public static void main(String args[]){
        Hospital h = new MyHospital();
        h.emergency();
        h.appointment();
        h.billing();
    }
}
