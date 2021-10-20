package Opgave_5;

import java.util.concurrent.ExecutionException;

public class TV {
    private boolean on = false;
    private int channel;
    private int volume;


    public TV() {
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void turnOn(){
        setOn(true);
    }

    public void channelUp() throws Exception {

        if (!isOn()) {
            throw new Exception("Tvet er slukket");
        } else {
            this.channel += 1;
        }
    }

        public void channelDown() throws Exception {

            if(!isOn()){
                throw new Exception("Tvet er slukket");
            }
            else{
                this.channel -= 1;
            }
    }

    public void volumeUp() throws Exception {

        if(!isOn()){
            throw new Exception("Tvet er slukket");
        }
        else{
            this.volume += 1;
        }
    }

    public void volumeDown() throws Exception {

        if(!isOn()){
            throw new Exception("Tvet er slukket");
        }
        else{
            this.volume -= 1;
        }
    }

    @Override
    public String toString() {
        String s;
        if(!isOn()){
            s = "Tvet er slukket";
        }
        else{
            s = "Tvet er tændt, det står på kanal:" + getChannel() + " og volumen er: " + getVolume();
        }

        return s;

    }
}
