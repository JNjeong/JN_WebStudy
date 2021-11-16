public class day11 {
    public static void main(String[] args) {
        /* Inheritance */
        //day11_TV, day11_CaptionTV, day11_SmartTV 참조

        day11_CaptionTV ctv = new day11_CaptionTV();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println("ctv channel : "+ctv.channel);



    }
}
