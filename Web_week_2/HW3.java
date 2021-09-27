import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        /* homework #3-15 */
        System.out.print("정수a : "); int numa = sc.nextInt();
        System.out.print("정수b : "); int numb = sc.nextInt();
        System.out.print("정수c : "); int numc = sc.nextInt();
        int minor = numa;
        if(minor > numb) minor = numb;
        if(minor > numc) minor = numc;
        System.out.printf("최소값은 %d입니다.\n", minor);
        System.out.println("==========3-15==========");

        /* homework #3-21 */
        System.out.print("몇 월입니까?: "); int month = sc.nextInt();
        switch (month){
            case 3: case 4: case 5: System.out.println("봄"); break;
            case 6: case 7: case 8: System.out.println("여름"); break;
            case 9: case 10: case 11: System.out.println("가을"); break;
            default: System.out.println("겨울");
        }
        System.out.println("==========3-21==========");

        /* homework #4-2 */
        while(true){
            System.out.print("세 자리의 정수값: "); int threeDigit = sc.nextInt();
            if(!(threeDigit < 100 || threeDigit > 999)) {System.out.println("입력한 값은"+threeDigit+"입니다."); break;}
        }
        System.out.println("==========4-2==========");

        /* homework #4-14 */
        System.out.print("1부터 n까지의 합을 구합니다. n의 값: "); int num = sc.nextInt();
        int sum = 0 ;
        for(int i = 1 ; i <= num ; i++) sum += i; 
        System.out.printf("1부터 %d까지의 합은 %d입니다.\n", num, sum);
        System.out.println("==========4-14==========");

        /* homework #4-21 */
        System.out.print("정방형을 표시합니다.\n 단수는 : "); int square = sc.nextInt();
        for(int i = 0 ; i < square; i++){
            for(int j = 0 ; j < square; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("==========4-21==========");

        















    }
}
