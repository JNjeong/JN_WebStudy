public class day13 {
    public static void main(String[] args) {
        
        /* 다형성 */
        //day13_Animal class, day13_Dog class, day13_HouseDog class 참조
        day13_Dog dog1 = new day13_Dog();
        dog1.setName("puppy");
        System.out.println(dog1.name);
        dog1.sleep();

        day13_HouseDog housedog1 = new day13_HouseDog("happy");
        // housedog1.setName("happy");
        housedog1.sleep();
        housedog1.sleep(1);

        //day13_ZooKeeper class, day13_Tiger class, day13_Lion class 참조
        day13_ZooKeeper k1 = new day13_ZooKeeper();
        day13_Tiger t1 = new day13_Tiger();
        day13_Lion l1 = new day13_Lion();
        day13_Crocodile c1 = new day13_Crocodile();

        k1.feed(t1);
        k1.feed(l1);
        k1.feed(c1);

        //day13_Predetor interface 참조
        //tiger lion은 각각 predator 인터페이스의 객체이기도 하다.
        //이와같이 객체가 하나이상의 자료형 타입을 갖게 되는 특성을 다형성이라고 한다.


        //day13_Bouncer class 참조
        day13_Bouncer b1 = new day13_Bouncer();
        b1.barkAnimal(t1);
        b1.barkAnimal(l1);
        b1.barkAnimal(c1);
        b1.barkAnimal(new day13_Crocodile());
        //barkAnimal() 는 입력으로 받은 animal객체를 확인 후 해당하는 구현부를 실행한다.


    }
}
