import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import jdk.internal.module.SystemModuleFinders;
import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

class day06_ArrayExercise {
	public static void main(String[] args) {
    /* Array Exercise */
    Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
    System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");
	
	int sum = 0;
	double avg = 0;
	int cnt= 0;
    int idx; 


	//Exercise #1 )문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
    //입력 예 ) A B C D E F G H I J  // 출력 예 ) ABCDEFGHIJ
    System.out.println("========================================");
	System.out.println("Exercise #1");
    char[] ex1_arr = new char[10];
    for(int i = 0 ; i < 10 ; i++){
        char ex1_num = sc.next().charAt(0);
        ex1_arr[i]= ex1_num;
    }
    System.out.println(ex1_arr);

   

	//Exercise #2 ) 정수 10 개를 저장할 수 있는 배열을 만들어서 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오.
    //출력 예 ) 1 2 3 4 5 6 7 8 9 10
    System.out.println("========================================");
	System.out.println("Exercise #2");
    int[] ex2_arr = new int[10];

    for(int i = 0 ; i < 10; i++){
        ex2_arr[i] = i+1;
        System.out.printf("%d ", ex2_arr[i]);
    }
	

	
	//Exercise #3 10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
	//입력 예 ) A B C D E F G H I J
	// 출력 에 ) A D G
	System.out.println("========================================");
	System.out.println("Exercise #3");
    char[] ex3_arr = new char[10];
    for(int i = 0; i<10;i++){
        System.out.print("입력 : "); char ex3_num = sc.next().charAt(0);
       ex3_arr[i] = ex3_num;
    }
    System.out.printf("%c %c %c", ex3_arr[0], ex3_arr[3], ex3_arr[6]);
	
    
	
	
	//Exercise #4 ) 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
	//입력 예 ) 3 5 10 55 0
    //출력 예 ) 55 10 5 3
    System.out.println("========================================");
	System.out.println("Exercise #4");
    int[] ex4_arr = new int[100];

    int ex4_num = 1;
    idx = -1;
    while(ex4_num != 0){
        idx++;
        ex4_num = sc.nextInt();
        ex4_arr[idx] = ex4_num;
    }
    for(int i = idx-1; i >= 0; i--){
        System.out.printf("%d ", ex4_arr[i]);
    }
        
	
    

	
	//Exercise #5 ) 1반부터 6반까지의 평균점수를 저장한 후 두 반의 반 번호를 입력받아 두 반 평균점수의 합을 출력하는 프로그램을 작성하시오.
    // 반별 평균점수는 초기값으로 1반부터 차례로 85.6 79.5 83.1 80.0 78.2 75.0으로 초기화하고 출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지 한다.
	//입출력 예 ) 1 3			
    //출력 예) 168.7
	System.out.println("========================================");
	System.out.println("Exercise #5");
    double[] ex5_arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
	System.out.print("첫번째 반 입력 : "); int ex5_num1 = sc.nextInt();
	System.out.print("두번째 반 입력 : "); int ex5_num2 = sc.nextInt();
    System.out.println((ex5_arr[ex5_num1]+ ex5_arr[ex5_num2]));

	


	//Exercise #6 )10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
	//입력 예) 5 10 8 55 6 31 12 24 61 2
    //출력 예) 2
	System.out.println("========================================");
	System.out.println("Exercise #6");
    int min = 999;
    for (int i = 0 ; i < 10 ; i++){
        System.out.print("입력 : "); int ex6_num = sc.nextInt();
        if (ex6_num < min) min = ex6_num;
    }
    System.out.println(min);
 


	
	//Exercise #7 )10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
    //(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
    //입력 예) 3
    //출력 예
    // 1 2 3 A
    // 4 5 B C
    // 6 D E F
	System.out.println("========================================");
	System.out.println("Exercise #7");
    int max = 1; min = 9999;
    for(int i = 0 ; i <10 ; i++){
        System.out.print("입력 : "); int ex7_num = sc.nextInt();
        if( ex7_num < 100 && max < ex7_num ) max = ex7_num;
        if (ex7_num >= 100 && min > ex7_num) min = ex7_num;
    }
    if (max == 1) max = 100;
    if (min == 9999) min = 100;
    System.out.printf("%d %d", max, min);

    
	
	
	
	//Exercise #8 )10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
    //평균은 반올림하여 소수첫째자리까지 출력한다.
	//입력 예 ) 95 100 88 65 76 89 58 93 77 9 / 출력 예 )sum : 446
    //                                                  avg : 78.8
	System.out.println("========================================");
	System.out.println("Exercise #8");
    int sum_even = 0;
    int sum_odd =0;
    for(int i = 0 ; i<10  ; i++){
        System.out.print("입력 : "); int ex8_num = sc.nextInt();
        if(i%2==0) sum_odd +=ex8_num;
        if(i%2==1) sum_even += ex8_num;
        
    }
    System.out.printf("sum : %d\navg : %.1f", sum_even , ((double)sum_odd/5.0));

    
	
	//Exercise #9 )10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.


	//입력 예 )  95 100 88 65 76 89 58 93 77 99	/ 출력 예 )100 99 95 93 89 88 77 76 65 58

	System.out.println("========================================");
	System.out.println("Exercise #9");
    int[] ex9_arr = new int[10];
    for(int i = 0 ; i<10  ; i++){
        System.out.print("입력 : "); int ex9_num = sc.nextInt();
        ex9_arr[i] = ex9_num;
    }
    for(int i = 0 ; i < 10; i++){
        for(int j = i+1 ; j < 10;j++){
            if(ex9_arr[i] < ex9_arr[j]){
                int temp = ex9_arr[i];
                ex9_arr[i] = ex9_arr[j];
                ex9_arr[j] = temp;
            }
        }
    }
    for(int q = 0 ; q < 10; q++){
        System.out.printf("%d ", ex9_arr[q]);
    }
	
	

    
	
	//Exercise #10 )10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
	//입력 예 ) A E C X Y Z c b z e	/ 출력 에 ) e z b c Z Y X C E A
	System.out.println("========================================");
	System.out.println("Exercise #10");
    char[] ex10_arr = new char[10];
    for(int i = 0 ; i < 10; i++){
        System.out.print("입력 : "); char ex10_num = sc.next().charAt(0);
        ex10_arr[i] = ex10_num;
    }
	for(int j = 9; j>=0;j--){
        System.out.printf("%c ", ex10_arr[j]);
    }
	
	

	//Exercise #11 ) 5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
    //주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
	//입력 예)3					
    //출력 예 ) 
    // *
    // **
    // ***
    // **
    // *
	System.out.println("========================================");
	System.out.println("Exercise #11");
    sum = 0;
    for(int i = 1; i<= 5; i++){
        System.out.print("입력 : "); int ex11_num = sc.nextInt();
        if(i%2==1) sum += ex11_num;
    }
    System.out.print(sum);




	//Exercise #12 ) 10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
	//입력 예)10 20 25 66 83 7 22 90 1 100
    //출력 예 ) odd : 141
    //         even : 283
	System.out.println("========================================");
	System.out.println("Exercise #12");
    int odd = 0;
    int even = 0;
    for(int i = 1; i <= 10; i++){
        System.out.print("입력 : ");  int ex12_num = sc.nextInt();
        if(i%2==0) even += ex12_num;
        else odd += ex12_num;
    }
    System.out.printf("odd : %d\neven : %d", odd, even);

    
    




	//Exercise #13 )100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오. (입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)
	//입력 예)	30 20 10 60 80 -1
    //출력 예 ) 10 60 80
	System.out.println("========================================");
	System.out.println("Exercise #13");
    int[] ex13_arr = new int[100];
    cnt = 0 ;
    while(true){
        System.out.print("입력 : "); int ex13_num = sc.nextInt();
        if (ex13_num == -1) break;
        ex13_arr[cnt++] = ex13_num;
    }
    cnt--;
 
    if(cnt >= 2) System.out.printf("%d ",  ex13_arr[cnt-2]);
    if(cnt >= 1) System.out.printf("%d ",  ex13_arr[cnt-1]);
    if(cnt >= 0) System.out.printf("%d ",  ex13_arr[cnt]);
  
    
	
	



	//Exercise #14 )6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오. 출력은 반올림하여 소수 첫째자리까지로 한다.
	//입력 예)23.2 39.6 66.4 50.0 45.6 48.0     //출력 예 ) 45.5
	System.out.println("========================================");
	System.out.println("Exercise #14");
    avg = 0.0;
    for(int i = 0 ; i < 6; i++){
        System.out.print("입력 : "); double ex14_num = sc.nextDouble();
        avg += ex14_num;    
    }
    avg = Math.round((avg/6.0)*10.0)/10.0;
    System.out.println(avg);


	//Exercise #15 ) 6개의 문자배열을 만들고 {'J', 'U', 'N', 'G', 'O', 'L'} 으로 초기화 한 후 문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
    //첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
	//입력 예)L    //출력 예 )5
    System.out.println("========================================");
	System.out.println("Exercise #15");

    char[] ex15_arr = {'J', 'U', 'N', 'G', 'O', 'L'};
	System.out.print("입력 : "); char ex15_num = sc.next().charAt(0);
    boolean flag = false;
    for(int i = 0 ; i < 6; i++){
        if(ex15_arr[i] == ex15_num) {
            System.out.println(i);
            flag = true;
            break;
        }
    }
    if(!flag) System.out.println("none");



	//Exercise #16 ) 세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.입력받는 정수는 100개 이하이다.
	//입력 예)	45 19 123 58 10 -55 16 -1 999		//출력 예 ) max : 123 
    //                                                         min : -55

	System.out.println("========================================");
	System.out.println("Exercise #16");
    int ex16_num =0 ;
    max = 0;
    min = 999;
    while(true){
        System.out.print("입력 : "); ex16_num = sc.nextInt();
        if (ex16_num == 999) break;
        if (ex16_num < min) min = ex16_num;
        if (ex16_num > max) max = ex16_num;
    }
    System.out.printf("max : %d\nmin : %d", max, min);




	//Exercise #17 ) 100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와 합계 평균을 출력하는 프로그램을 작성하시오.
    //평균은 소수점 이하 1자리까지 출력한다.
	//입력 예)	35 10 23 100 64 51 5 0	
	//출력 예 ) 
    // Multiples of 5 : 4
    // sum : 150
    // avg : 37.5
	System.out.println("========================================");
	System.out.println("Exercise #17");
    int ex17_num = 1;
    cnt = 0;
    sum =0;
    avg = 0.0;
    while(true){
        System.out.print("입력 : "); ex17_num = sc.nextInt();
        if(ex17_num==0) break;
        if(ex17_num%5==0) {cnt++; sum += ex17_num;}
    }
    avg = Math.round( ((double)(sum) / (double)(cnt)) *10.0  )/10.0;
    System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f",cnt,sum,avg);
    



	//Exercise #18 ) 정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후
    //입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을, 
    //짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
    // 입력되는 정수의 개수는 100개 이하이다. 
	//입력 예)	8 10 5 15 100 0	//출력 예 ) 5
    //                                     4 5 10 30 50
   
	System.out.println("========================================");
	System.out.println("Exercise #18");
    int[] ex18_arr = new int[100];
    cnt = 0;
    while(true){
        System.out.print("입력 : "); int ex18_num = sc.nextInt();
        if (ex18_num==0)break;
        if(ex18_num%2==0) ex18_arr[cnt++] = ex18_num/2;
        if(ex18_num%2==1) ex18_arr[cnt++] = ex18_num*2;
    }
    System.out.println(cnt);
    for(int i = 0 ; i<cnt; i++){
        System.out.printf("%d ", ex18_arr[i]);
    }

    //Exercise #19 ) 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
    //입력 예)	5                   	
    //         35 10 35 100 64	
    //출력 예)
    // 100
    // 64
    // 35
    // 35
    // 10
	System.out.println("========================================");
	System.out.println("Exercise #19");
    System.out.print("점수 개수 입력 : "); int ex19_cnt = sc.nextInt();
    int[] ex19_arr = new int[ex19_cnt];
    for(int i = 0 ; i < ex19_cnt; i++){
        System.out.print("점수 입력"); int ex19_num = sc.nextInt();
        ex19_arr[i] = ex19_num;
    }
    for(int i = 0 ; i<ex19_cnt;i++){
        for(int j = i; j < ex19_cnt; j++){
            if(ex19_arr[i] < ex19_arr[j]){
                int temp = ex19_arr[j];
                ex19_arr[j] = ex19_arr[i];
                ex19_arr[i] = temp;
            }
        }
    }
    for(int k = 0 ; k < ex19_cnt; k++){
        System.out.println(ex19_arr[k]);
    }
  
   






	sc.close();
	System.out.println("========================================");
	System.out.println("Control Statement Exerice 종료합니다. 수고하셨습니다.");
  }
}