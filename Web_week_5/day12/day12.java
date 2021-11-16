public class day12 {
    public static void main(String[] args) {
        /* super */
        //day12_parent class와 day12_child class 참조
        day12_child c = new day12_child();
        c.method();

        //day12_parent2 class와 day12_child2 class 참조
        day12_child2 c2 = new day12_child2();
        c2.method();


        /*Super Constructor*/


        //day12_point class, day12_point3D 참조
        day12_point3D p3 = new day12_point3D(1, 2, 3);
        System.out.println(p3.getLocation());

        day12_point3D p3_2 = new day12_point3D(1,2);
        System.out.println(p3_2.getLocation());


        /* 접근제어자 */
        //day12_time class참조
        day12_time t = new day12_time(30, 30, 30);
        System.out.println(t.toString());
    }
}
