public class day12_child2 extends day12_parent {
    int x = 20;

    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
