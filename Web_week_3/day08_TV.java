public class day08_TV {
    //TV의 속성 (맴버변수 / 객체변수)
    String color;
    boolean power;
    int channel;

    //TV의 기능(method)
    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}
