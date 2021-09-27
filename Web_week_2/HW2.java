import java.util.*;

import jdk.internal.module.SystemModuleFinders;

public class HW2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        /* homework #2-11 */
        System.out.println("한 자리 양의 정수 : "+(rand.nextInt(9) +1));
        System.out.println("한 자리 음의 정수 : " + ((rand.nextInt(9)+1) * (-1)));
        System.out.println("두 자리 양의 정수 : " + ((rand.nextInt(90))+10));
        System.out.println("==========2-11==========");

        /* homework #2-14 */
        System.out.print("성:"); String firstname = sc.nextLine();
        System.out.print("이름:"); String lastname = sc.nextLine();
        System.out.println("안녕하세요."+firstname+lastname);
        System.out.println("==========2-14==========");

        /* homework #3-3 */
        System.out.print("변수 A:"); int numA = sc.nextInt();
        System.out.print("변수 B:"); int numB = sc.nextInt();
        if(numB % numA == 0) System.out.println("B는 A의 약수입니다.");
        else System.out.println("B는 A의 약수가 아닙니다.");
        System.out.println("==========3-3==========");

        /* homework #3-5 */
        System.out.print("정숫값: "); int num = sc.nextInt();
        if (num == 0) System.out.println("값이 0입니다.");
        else System.out.printf("값이 %s수입니다.", (num>0)? "양" : "음");

        System.out.println("==========3-5==========");

        /* homework #3-7 */
        System.out.print("변수a:"); int numa = sc.nextInt();
        System.out.print("변수b:"); int numb = sc.nextInt();
        if(numa == numb) System.out.println("a와b가 같다.");
        else System.out.printf("%s가 크다.", ((numa > numb) ? "a" : "b"));
        System.out.println("==========3-7==========");

    
        















    }
}
