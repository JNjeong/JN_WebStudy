public class day08_recursive {

    static int factorial(int a){ //내 코드
        if (a==1) return 1;
        return a * factorial(a-1);
    }

    static int fact(int n){ //강사님 코드
        int result = 0;
        if (n==1){
            result = 1;
        } 
        else {
            System.out.println(n);
            result= n * fact(n-1);
        }
        return result;
    }

    static int factorial_add(int a){
        if (a==0) return 0;
        return a + factorial_add(a-1);
    }


    public static void main(String[] args) {
        int result = fact(4);
        System.out.println(result);

        System.out.println(factorial(4));

        System.out.println(factorial_add(10));
    }
}
