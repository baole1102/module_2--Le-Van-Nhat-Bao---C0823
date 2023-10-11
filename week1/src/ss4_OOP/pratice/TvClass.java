package ss4_OOP.pratice;

public class TvClass {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;
    TvClass(){
    }
    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel< 120 ){
            channel =newChannel;
        }
    }
    public void setVolumeLevel(int newVoulumeLevel){
        if (on&&newVoulumeLevel>=1 && newVoulumeLevel<7){
         volumeLevel = newVoulumeLevel;
        }
    }
    public void chainUp(){
        if (on && channel < 120){
            channel++;
        }
    }
    public void chainDown(){
        if (on && channel >1){
            channel--;
        }
    }
    public void volumnUp(){
        if (on && volumeLevel<7){
            volumeLevel ++;
        }
    }
    public void volumnDown(){
        if (on && volumeLevel>1){
            volumeLevel --;
        }
    }
}
