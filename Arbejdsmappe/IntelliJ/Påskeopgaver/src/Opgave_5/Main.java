package Opgave_5;

public class Main {
    public static void main(String[] args) {

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        System.out.println(tv1);

        TV tv2 = new TV();
        tv2.turnOn();
        try{
            tv2.volumeUp();
            tv2.channelUp();
        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println(tv2);

    }
}
