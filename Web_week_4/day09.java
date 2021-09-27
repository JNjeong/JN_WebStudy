
public class day09 {

    static int add(int a, int b){
        return a+b;
    }
    static long add(int a, long b){
        return a+b;
    }
    static long add(long a, long b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static String concatenate(String delim, String... args){
        String result = "";
        for(String str: args) {
            result += str + delim;
        }
        return result;
    }
    // static String concatenate(String... args){

    //     return concatenate("", args);
    // }

    public static void main(String[] args) {
        
        /* Overloading */
        //상단 add()메소드들 참조
        System.out.println(day09.add(2,3));
        System.out.println(day09.add(1,2,3));


        //가변인자
        String[] strArr = {"100", "200", "300"};
        System.out.println(concatenate("", strArr));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(", ", strArr));
        System.out.println(concatenate("", "100", "200", "300"));
        
        
    }
}
