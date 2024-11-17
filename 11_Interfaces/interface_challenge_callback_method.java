interface Member{
    public void callBack();
}

class Store{
    Member members[] = new Member[100];
    int count = 0;

    public void register(Member m){
        members[count++] = m;
    }

    void inviteSale(){
        for(int i = 0; i < count; i++){
            members[i].callBack();
        }
    }
}

class Customer implements Member{
    private String name;
    public Customer(String name){
        this.name = name;
    }
    public void callBack(){
        System.out.println("Ok, I will visit: "+ name);
    }
}


public class interface_challenge_callback_method{
    public static void main(String args[]){
        Store s = new Store();
        Customer c1 = new Customer("Vivek");
        Customer c2 = new Customer("Tony");
        Customer c3 = new Customer("Virat");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.inviteSale();
    }
}