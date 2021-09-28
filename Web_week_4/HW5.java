import java.util.*;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        /* homework #4-30 */
        System.out.print("숫자맞추기 게임 시작!\n0부터99사이의 숫자를 맞추세요.");
        int randint = rand.nextInt(100);
        for(int i = 6; i >= 0; i--){
            if(i==0) {System.out.println("남은 기회가 없습니다. 정답은..."+randint); break;}
            System.out.printf("\n남은 횟수 %d회, 어떤 숫자일까?:",i); int num = sc.nextInt();
            if(num == randint) {System.out.printf("\n%d만에 맞추었습니다.",(i-1)); break;}
            System.out.printf("\n%s\n",(num > randint)? "더 작은 숫자입니다." : "더 큰 숫자입니다.");
        }
        System.out.println("==========4-30==========");
    

        /* homework #6-1 */
        double[] arr = new double[5];
        for(int i = 0 ; i < 5; i++){
            System.out.printf("a[%d] : %.1f\n", i, arr[i]);
        }
        System.out.println("==========6-1==========");


        /* homework #6-2 */
        int[] arr2 = new int[5];
        int cnt = 5;
        for(int i =0 ; i <5; i++){
            arr2[i] = cnt--;
            System.out.printf("a[%d] : %d\n", i, arr2[i]);
        }
        System.out.println("==========6-2==========");

        /* homework #6-3 */
        double[] arr3 = new double[5];
        for(int i =0 ; i <5; i++){
            arr3[i] = ((i+1)*10.0)/9.0;
            System.out.printf("a[%d] : %.1f\n", i, arr3[i]);
        }
        System.out.println("==========6-3==========");

        /* homework #6-6 */
        System.out.print("요소 수: "); int num = sc.nextInt();
        int[] arr4 = new int[num];
        for(int i =0 ; i <num; i++){
            System.out.print("a["+i+"] = "); int numin = sc.nextInt();
            arr4[i] = numin;
        }
        System.out.printf("a = {");
        for(int j = 0; j < num; j++){
            System.out.printf(arr4[j]+", ");
        }
        System.out.println("\b\b}");
        System.out.println("==========6-6==========");
    }
}
