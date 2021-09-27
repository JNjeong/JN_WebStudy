public class day08 {
    public static void main(String[] args) {

        /*클래스 활용*/
        //day08_TVclass참조

        day08_TV t = new day08_TV();    //객체 생성    
        t.channel=7;    //객체 변수 사용
        t.channelDown();    //메소드 사용
        System.out.println("t의 channel : " +t.channel);

        TV a = new TV();
        a.channel = 11;
        a.channelDown();
        a.channelDown();
        System.out.println("a의 channel : " +a.channel);


        /* 객체 배열 */
        TV[] tvArr = new TV[3]; //길이가 3인 객체 배열

        //객체 배열 내의 객체 생성
        for(int i = 0 ; i < tvArr.length; i++){
            tvArr[i] = new TV();
            tvArr[i].channel = i+10;
            tvArr[i].channelUp();
            System.out.println(tvArr[i].channel);
        }
        for(int j = 0; j < tvArr.length; j++){
            tvArr[j].channelUp();
            System.out.println(tvArr[j].channel);
        }



        /* 전역변수, 클래스변수, 지역변수 */
        //day08_Card 참조

        System.out.println("Card class width : "+ day08_Card.width);
        System.out.println("Card class height : " + day08_Card.height);
        // System.out.println("Card class kind : " + day08_Card.kind);
        // System.out.println("Card class number : " + day08_Card.number);

        day08_Card c1 = new day08_Card();
        c1.kind = "Heart";
        c1.number = 7;

        //static 변수의 사용
        System.out.println("Card class kind : " + c1.kind);
        System.out.println("Card class number : " + c1.number);
        
        //객체변수의 사용
        day08_Card c2 = new day08_Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은"+ c1.kind + ", "+c1.number+"이며 크기는 ("+ c1.width + ", " +c1.height + ") 이다.");
        System.out.println("c2는"+ c2.kind + ", "+c2.number+"이며 크기는 ("+ c2.width + ", " +c2.height + ") 이다.");


        //card클래스의 static 변수의 특징
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은"+ c1.kind + ", "+c1.number+"이며 크기는 ("+ c1.width + ", " +c1.height + ") 이다.");
        System.out.println("c2는"+ c2.kind + ", "+c2.number+"이며 크기는 ("+ c2.width + ", " +c2.height + ") 이다.");



        /* 메소드 */
        //day08_myMath 참조
        day08_myMath math = new day08_myMath();

        int result1 = math.add(1, 10);
        System.out.println(result1);

        int result2 = math.sub(1, 10);
        System.out.println(result2);


        /* 재귀호출 */
        day08_recursive R = new day08_recursive();
        System.out.println(R.factorial(4));


        //재귀호출 Exercise #1) 10 이하의 합
        //day08_recursive 참조
        System.out.println(R.factorial_add(10));














    }
}
