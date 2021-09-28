import java.util.*;


public class HW6 {

    static void Swap(int a, int b, int[] arr1, int arr1_index,int[] arr2, int arr2_index){
        int temp = a ;
        a = b;
        b = temp;
        arr1[arr1_index] = a;
        arr2[arr2_index] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        /* homework #6-8 */
        System.out.print("요소 수:"); int numcount = sc.nextInt();
        int[] arr = new int[numcount];
        for(int i = 0; i < numcount; i++){
            int randint = rand.nextInt(100)+1;
            System.out.printf("a[%d] = %d\n", i , arr[i] = randint);
        } 
        int front=0, back=numcount;
        System.out.print("찾을 숫자:"); int numfind = sc.nextInt();
        for(int i = 0; i < numcount; i++) if(arr[i]==numfind) {front = i; break;}
        for(int j = numcount-1; j >= 0; j--) if(arr[j]==numfind) {back = j; break;}
        if(front == 0 && back == numcount) System.out.println("찾는 값이 없습니다.");
        else if(front == back)System.out.printf("그 값은 a[%d]에 있습니다.\n", front);
        else System.out.printf("그 값은 가장 앞, a[%d]에 있고 가장 뒤, a[%d]에 있습니다.\n", front, back);
        System.out.println("==========6-8==========");
    

        /* homework #6-11 */
        System.out.print("요소 수:"); numcount = sc.nextInt();
        arr = new int[numcount];
        for(int i = 0 ; i < numcount ; i++){
            int randint = rand.nextInt(10)+1;
            if(i != 0 && arr[i-1] == randint) {i--; continue;}
            arr[i]=randint;
            System.out.printf("a[%d] = %d\n", i, randint);
        }
        System.out.println("==========6-11==========");

        /* homework #6-12 */
        System.out.print("요소 수:"); numcount = sc.nextInt();
        if(numcount > 10) System.out.println("요소수 10 초과 =>" +(numcount = numcount % 10 + 1)+"개로 자동조정합니다." ); 
        arr = new int[numcount];
        for(int i = 0 ; i < numcount ; i++){
            boolean flag = false;
            int randint = rand.nextInt(10)+1;
            for(int j = 0; j <= i; j++) if(arr[j] == randint){flag = true; break;}
            if (flag) {i--; continue;}
            arr[i]=randint;
            System.out.printf("a[%d] = %d\n", i, arr[i]);
        }
        System.out.println("==========6-12==========");
 
        /* homework #6-13 */
        System.out.print("요소 수:"); numcount = sc.nextInt();
        arr = new int[numcount];
        for(int i = 0 ; i < numcount ; i++){
            arr[i] = rand.nextInt(100)+1;
            System.out.printf("a[%d] = %d\n", i, arr[i]);
        }
        System.out.println("요소를 섞었습니다.");
        for(int j = 0 ; j < numcount; j++){
            int randint = rand.nextInt(numcount);
            Swap(arr[j], arr[randint], arr, j, arr, randint);
        }
        for(int k = 0; k < numcount ; k++){
            System.out.println("a["+k+"] = " + arr[k]);
        }
        System.out.println("==========6-13==========");

        /* homework #6-14 */
        System.out.print("요소 수:"); numcount = sc.nextInt();
        arr = new int[numcount];
        int[] b = new int[numcount];
        for(int i = 0 ; i < numcount ; i++) System.out.printf("a[%d] = %d\n", i, arr[i] = i+11);
        System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
        for(int j = 0; j <numcount ;j++) System.out.printf("b[%d] = %d\n",j , b[j]=arr[(numcount-1)-j]);
        System.out.println("==========6-14==========");
    }
}
