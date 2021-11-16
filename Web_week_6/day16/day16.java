import java.util.ArrayList;


class Fruit{
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit{
    @Override
    public String toString(){
        return "Apple";
    }
}

class Grape extends Fruit{
    @Override
    public String toString(){
        return "Grape";
    }
}

class Toy{
    public String toString(){
        return "Toy";
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item){ list.add(item); }

    T get(int i){ return list.get(i); }

    int size(){ return list.size(); }

    public String toString(){
        return list.toString(); //Object의 메소드인 toString을 호출한 것.
    }
}


public class day16 {
    public static void main(String[] args) {
        /* generics */

        //제네릭스 미구현
        // ArrayList aList = new ArrayList();
        // aList.add("web");
        // aList.add("developer");

        // String web = (String) aList.get(0);
        // String developer = (String) aList.get(1);


        //제네릭스 구현
        ArrayList<String> aList = new ArrayList<String>();
        
        aList.add("web");
        aList.add("developer");
        String web = aList.get(0);
        String developer = aList.get(1);

        System.out.println(web);
        System.out.println(developer);



        /* Generics Class */
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grape> grapeBox = new Box<Grape>();
        // Box<Grape> grapeBox = new Box<Apple>();   타입 불일치 에러
        Box<Toy> toyBox = new Box<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        
        appleBox.add(new Apple());
        // appleBox.add(new Toy()); appleBox에는 Apple()만 담을 수 있다.
        
        toyBox.add(new Toy());
        // toyBox.add(new Apple()); toyBox에는 Toy()만 담을 수 있다.

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);


        /* T extends */







    }
}
