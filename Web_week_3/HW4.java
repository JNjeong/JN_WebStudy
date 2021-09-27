import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        /* homework #4-22 */
        System.out.print("단수는?: "); int cnt = sc.nextInt();
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        for(int i = 0 ; i < cnt; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        for(int i = 0 ; i < cnt; i++){
            for(int j = 5-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        for(int i = cnt; i>0; i--){
            for(int k = 0; k<cnt-i; k++){
                System.out.print(" ");
            }
            for(int j =0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        for(int i = cnt; i>0; i--){
            for(int k = i-1; k>0; k--){
                System.out.print(" ");
            }
            for(int j =i; j<=cnt; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("==========4-22==========");

        /* homework #4-25 */
        System.out.print("2이상의 정수값: "); int prime = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i < prime; i++){
            if(prime%i==0) flag = true;
        }
        if(flag) System.out.println("소수가 아닙니다.");
        else System.out.println("소수입니다.");
        System.out.println("==========4-25==========");

        /* homework #4-26 */
        sum = 0;
        System.out.print("정수를 더합니다.\n몇개를 더할까요"); int loopCnt = sc.nextInt();
        for(int i = 0 ; i < loopCnt; i++){
            System.out.print("정수(0으로 종료): "); int num = sc.nextInt();
            sum += num;
        }
        System.out.printf("합계는 %d입니다.\n평균은 %d입니다.",sum,(sum/loopCnt));
        System.out.println("==========4-26==========");

        /* homework #4-27 */
        System.out.print("정수를 더합니다.\n몇개를 더할까요"); loopCnt = sc.nextInt();
        sum=0;
        cnt=0;
        for(int i = 0 ; i < loopCnt; i++){
            System.out.print("정수(0으로 종료): "); int num = sc.nextInt();
            if(sum >= 1000){System.out.println("마지막값은 무시합니다."); break;}
            sum += num;
            cnt++;
        }
        System.out.printf("합계는 %d입니다.\n평균은 %d입니다.",sum,(sum/cnt));
        System.out.println("==========4-27==========");

        /* homework #4-28 */
        System.out.print("정수를 더합니다.\n몇개를 더할까요"); loopCnt = sc.nextInt();
        sum=0;
        cnt=0;
        for(int i = 0 ; i < loopCnt; i++){
            System.out.print("정수(0으로 종료): "); int num = sc.nextInt();
            if(num < 0){System.out.println("음수는 더하지 않습니다."); i--; continue;}
            sum += num;
            cnt++;
        }
        System.out.printf("합계는 %d입니다.\n평균은 %d입니다.",sum,(sum/cnt));
        System.out.println("==========4-28==========");

    



    }
}
