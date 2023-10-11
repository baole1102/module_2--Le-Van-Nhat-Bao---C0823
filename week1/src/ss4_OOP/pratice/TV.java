package ss4_OOP.pratice;

public class TV {
    public static void main(String[] args) {
        TvClass tv = new TvClass();
        tv.turnOn();
        tv.setChannel(30);
        tv.setVolumeLevel(5);
        System.out.println("tv channel is: "+ tv.channel + "and volume level is: "+tv.volumeLevel);
    }
}
