class Phone{
    public void call(){
        System.out.println("calling");
    }
    public void sms(){
        System.out.println("send sms");
    }
}

interface ICamera{
    public void click();
    public void record();
}

interface IMusicPlayer{
    public void play();
    public void pause();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    @Override
    public void click(){
        System.out.println("click photo in Smartphone");
    }
    
    @Override
    public void record(){
        System.out.println("record vedio in Smartphone");
    }

    @Override
    public void play(){
        System.out.println("play music in Smartphone");
    }

    @Override
    public void pause(){
        System.out.println("pause the music in Smartphone");
    }

    public void vedioCall(){
        System.out.println("VedioCall in Smartphone");
    }
}

public class Interfaces_example_smartphone {
    public static void main(String args[]){
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.sms();
        sp.click();
        sp.record();
        sp.play();
        sp.pause();
        System.out.println();
       
        Phone p = sp;
        p.call();
        p.sms();
        System.out.println();
    
        ICamera c = sp;
        c.click();
        c.record();
        System.out.println();

        IMusicPlayer m = sp;
        m.play();
        m.pause();
        System.out.println();
    }
}
