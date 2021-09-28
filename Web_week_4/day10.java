
public class day10 {
    
    

    //기본 생성자 생성
    day10(){
        //TODO
    }

    //생성자 오버로딩
    day10(String k, int num){
        //TODO
    }

    public static void main(String[] args) {
        
        /* Constructor */
        //클래스 바로 아래 생성자 참조

        //기본생성자와 매개변수 생성자 day10_data1, day10_data2 참조
        day10_data1 d1 = new day10_data1();
        day10_data2 d2 = new day10_data2(10);

        //day10_Car 클래스 참조
        day10_Car sonata = new day10_Car("Black", "Auto", 4);
        System.out.println(sonata.color);
        System.out.println(sonata.gearType);
        System.out.println(sonata.door);
        System.out.println("");

        day10_Car martiz = new day10_Car();
        System.out.println(martiz.color);
        System.out.println(martiz.gearType);
        System.out.println(martiz.door);
        System.out.println("");

        martiz.color = "white";
        martiz.gearType = "Auto";
        martiz.door = 2;
        System.out.println(martiz.color);
        System.out.println(martiz.gearType);
        System.out.println(martiz.door);
        System.out.println("");

        /* THIS */
        day10_Car2 c2 = new day10_Car2();
        day10_Car2 c3 = new day10_Car2("red");
        System.out.println(c2.color);
        System.out.println(c2.gearType);
        System.out.println(c2.door);
        System.out.println("");


        //복사 생성자
        day10_Car car1 = new day10_Car("red");
        day10_Car car2 = new day10_Car(car1);
        System.out.println(car1.color);
        System.out.println(car1.door);
        System.out.println(car2.color);
        System.out.println(car2.door);
        System.out.println("");

        
    }
}
