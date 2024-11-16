class TV{
    public void switchON(){
        System.out.println("Switch on the TV");
    }

    public void changeChannel(){
        System.out.println("Change the channel of the TV");
    }
}

class SmartTV extends TV{
    @Override
    public void switchON(){
        System.out.println("Switch on the SmartTV");
    }

    @Override
    public void changeChannel(){
        System.out.println("Change the channel of the SmartTV");
    }
    
    public void browse(){
        System.out.println("SmartTV Browsing");
    }
} 

public class Method_overiding_example {
    public static void main(String args[]){
        TV t = new TV();
        t.switchON();
        t.changeChannel();

        SmartTV st = new SmartTV();
        st.switchON();
        st.changeChannel();
        st.browse();

        TV st1 = new SmartTV();
        st1.switchON();
    }   
}
