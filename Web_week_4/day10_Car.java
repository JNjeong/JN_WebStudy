public class day10_Car {
    String color;
    String gearType;
    int door;
    
    day10_Car(){
        this("white","auto",4);
    }

    day10_Car(String color){
        this(color,"auto",4);
    }

    day10_Car(day10_Car c){ //객체를 복사
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    day10_Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }

}
