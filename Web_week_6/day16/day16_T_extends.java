import java.util.*;

public class day16_T_extends {

    class Fruit2 implements Eatable2 {
        public String toString(){
            return "Fruit";
        }
    }
    
    class Apple2 extends Fruit2{
        @Override
        public String toString(){
            return "Apple";
        }
    }
    
    class Grape2 extends Fruit2{
        @Override
        public String toString(){
            return "Grape";
        }
    }
    
    class Toy2{
        public String toString(){
            return "Toy";
        }
    }

    interface Eatable2 {;}

    class FruitBox2<T extends Fruit2 & Eatable2> extends Box2<T>{;}

    class Box2<T> {
        ArrayList<T> list = new ArrayList<T>();
    
        void add(T item){ list.add(item); }
    
        T get(int i){ return list.get(i); }
    
        int size(){ return list.size(); }
    
        public String toString(){
            return list.toString();
        }
    }


    public static void main(String[] args) {
        // FruitBox2<Fruit2> fruitBox2 = new FruitBox2<Fruit2>();
        // FruitBox2<Apple2> appleBox2 = new FruitBox2<Apple2>();
        // FruitBox2<Grape2> grapeBox2 = new FruitBox2<Grape2>();
        
    
    
    
    
    }
}
