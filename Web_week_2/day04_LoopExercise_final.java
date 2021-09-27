import java.util.Scanner;

class day04_LoopExercise_final {
	public static void main(String[] args) {
		/* Loop Exercises 1 */
		Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
		System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");
	
	int sum = 0;
	double avg = 0;
	int cnt= 0;


	//Exercise #1 )자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
    //입력 예 ) 100   // 출력 예 ) 10 100
    System.out.println("========================================");
	System.out.println("Exercise #1");
	System.out.print("입력 : "); int ex1_num = sc.nextInt();
    sum = 0;
    for (int i = 0; i <= ex1_num; i++){
        if(sum >= ex1_num) break;
        if(i%2==1) {
            sum+= i;
            cnt++;
        }
    }
    System.out.printf("%d %d", cnt, sum);

	//Exercise #2 )자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
    //입력 예 ) 5
    //출력 예 ) 
    // *
    // **
    // ***
    // ****
    // *****
    System.out.println("========================================");
	System.out.println("Exercise #2");
    System.out.print("입력 : "); int ex2_num = sc.nextInt();
	for(int i = 1 ; i<=ex2_num;i++){
        for(int j =0 ; j < i; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
	

	
	//Exercise #3 )자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	//입력 예 ) 3
	// 출력 에 ) 
    // ***
    // **
    // *
    // *
    // **
    // ***
	System.out.println("========================================");
	System.out.println("Exercise #3");
    System.out.print("입력 : "); int ex3_num = sc.nextInt();
    for(int i = 0; i<ex3_num;i++){
        for(int j = ex3_num-i; j>=1; j--){
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i =1;i<=ex3_num; i++){
        for(int j =0 ; j < i ; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
	
    
	
	
	//Exercise #4 ) 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	//입력 예 ) 3    
    //출력 예 ) 
    // ***
    //  **
    //   *
    System.out.println("========================================");
	System.out.println("Exercise #4");
    System.out.print("입력 : "); int ex4_num = sc.nextInt();
    for(int i = 0; i< ex4_num; i++){
        for(int k = 0 ; k < i; k++) System.out.print(" ");
        for(int j = ex4_num; j > i; j--){
            System.out.print("*");
        }
        System.out.println("");
    } 

	
	
    

	
	//Exercise #5 ) 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	//입출력 예 )3					
    //출력 예) avg : 82.5
    // *****
    //  ***
    //   *
	System.out.println("========================================");
	System.out.println("Exercise #5");
    
	System.out.print("입력 : "); int ex5_num = sc.nextInt();
    
    int arr[] = new int[ex5_num];
    int incre= 1;
    for(int p = 0; p<ex5_num; p++){
        arr[p]= incre;
        incre += 2;
    }


    for(int i = 0 ; i< ex5_num; i++){

        for(int j = 0; j < i; j++){
            System.out.print(" ");
        }
        int idx = (ex5_num - (i+1));
        for(int k = 0; k < arr[idx] ; k++){
            System.out.print("*");
        }
        System.out.println("");

    }
	

	
	//Exercise #6 )자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.


	//입력 예) 3
    //출력 예)
    // ABC
    // DE
    // F

	System.out.println("========================================");
	System.out.println("Exercise #6");
	System.out.print("입력 : ");       int ex6_num = sc.nextInt();
    cnt = 0;
    for(int i = 1 ; i<=ex6_num;i++){
        System.out.print("줄 : " +i+ " = ");
        for(int j = ex6_num-i; j>=0;j--){
            System.out.printf("[%d]",cnt++);
            System.out.printf("%c" , (char)incre++);
        }
        System.out.println("");
        }
	


	
	//Exercise #7 )자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
    //입력 예) 3
    //출력 예
    // 1 2 3 A
    // 4 5 B C
    // 6 D E F
	System.out.println("========================================");
	System.out.println("Exercise #7");
	System.out.print("입력 : "); int ex7_num = sc.nextInt();
    cnt = 1;
    incre = 65;
    for(int i = 0 ; i < ex7_num; i++){
        for(int j = ex7_num-i; j >0; j--){
            System.out.printf("%d ", cnt++);
        }
        for(int k = 0 ; k <= i; k++){
            System.out.printf("%c ",(char)incre++);
        }
        System.out.println("");
    }
    

    
	
	
	
	//Exercise #8 )정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 20개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
    //평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)
	//입력 예 ) 5 9 6 8 4 3 0	/ 출력 에 )35 5

	System.out.println("========================================");
	System.out.println("Exercise #8");
    sum = 0;
    avg = 0.0;
    for(int i = 1 ; i <=20 ; i++){
        System.out.print("입력 : "); int ex8_num = sc.nextInt();
        if(ex8_num == 0) break;
        sum += ex8_num;
        cnt = i;
    }
    System.out.printf("%d %d", sum , (sum/cnt));

    
	
	//Exercise #9 )1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
	//입력 예 )  7	/ 출력 에 )7 14 21 28 35 42 49 56 63 70
	System.out.println("========================================");
	System.out.println("Exercise #9");
	
	System.out.print("입력 : "); int ex9_num = sc.nextInt();  
    for(int i = 1; i<=10; i++){
        if ( (i * ex9_num) > 100) break;
        System.out.printf("%d ", (i*ex9_num) );
        if ( (i * ex9_num)%10 == 0) break;
    }
	
	

    
	
	//Exercise #10 )정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
	//입력 예 ) 20 	/ 출력 에 ) 50
	System.out.println("========================================");
	System.out.println("Exercise #10");
	sum = 0;
	System.out.print("입력 : "); int ex10_num = sc.nextInt();
	for (int i = 1 ; i<= ex10_num; i++){
		if(i % 5 == 0) sum += i;
	}
	System.out.println(sum);
	
	
	

	//Exercise #11 ) 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
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
    incre = 0;
	System.out.print("입력 : "); int ex11_num = sc.nextInt();
    int range = ex11_num + (ex11_num-1);
    for(int i = 1; i<= range; i++){
        if( i <= ex11_num){
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        else{
            
            for(int j = ex11_num-1; j > incre ; j--){
                System.out.print("*");
            }
            incre++;
            System.out.println("");
        }
    }




	//Exercise #12 ) 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
    //주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
	//입력 예)3	
    //출력 예 ) 	
    // *****
    //  ***
    //   *
    //  ***
    // *****			
	System.out.println("========================================");
	System.out.println("Exercise #12");
    System.out.print("입력 : ");  int ex12_num = sc.nextInt();
    int ex12_range = (ex12_num+(ex12_num-1));
    int[] ex12_arr = new int[ex12_range];
    cnt = ex12_range;
    for(int i = 0; i< ex12_num; i++){
        if(cnt < 0) break;
        ex12_arr[i] = cnt;
        ex12_arr[(ex12_range-1-i)] = cnt;
        cnt-=2;
    }

    for(int i = 0 ; i < ex12_range; i++){
        
        if (i < ex12_num && i > 0){
            cnt = 0;
            for(int k = 1 ; k <= i ; k++){
                System.out.print(" ");
                cnt++;
            }
        }
        else if(i >= ex12_num && i < (ex12_range-1) ){
            cnt--;
            for (int k = cnt; k > 0; k--){
                System.out.print(" ");  
            }
        }
     
        for(int j = 0; j < ex12_arr[i]; j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    
    




	//Exercise #13 )자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
	//입력 예)	3		
    //출력 예 ) 
    //    *
    //  ***
    //*****
	System.out.println("========================================");
	System.out.println("Exercise #13");
	System.out.print("입력 : "); int ex13_num = sc.nextInt();
    int ex13_range = (ex13_num+ (ex13_num-1));
    int[] ex13_odd = new int[ex13_num]; // 0 1 2 
    int[] ex13_even = new int[ex13_num]; // 0 1 2 
    boolean flag1 = false, flag2 = false;
    int ex13_order = 0;
    for(int i = 0 ; i <= ex13_range;i++){ //0~4
        if(i%2==0){ex13_even[ex13_order] = i; flag1 = true;}
        else if(i%2==1){ex13_odd[ex13_order] = i; flag2 = true;}
        if(flag1 && flag2) {ex13_order++; flag1 = false; flag2 = false; }
    }

    for(int i = 1; i <= ex13_num; i++){
        int order = ex13_num-i;
        for(int j = 0 ; j<ex13_even[order]; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < ex13_odd[i-1]; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
	
	



	//Exercise #14 )자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
    //주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
	//입력 예)	3	
    //출력 예 ) 
    //       1
    //     1 2
    //   1 2 3
	System.out.println("========================================");
	System.out.println("Exercise #14");
	System.out.print("입력 : "); int ex14_num = sc.nextInt();

    for(int i = 0 ; i < ex14_num;i++){
        for(int j =ex14_num-1; j > i; j--){
            System.out.print("  ");
        }
        for(int k = 0 ; k <= i; k++){
            System.out.printf("%d ", k+1);
        }
        System.out.println("");
    }


	//Exercise #15 ) 자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
    //주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.
	//입력 예)	3 
    //출력 예 )
    // A B C
    // D E 0
    // F 1 2
    System.out.println("========================================");
	System.out.println("Exercise #15");
	System.out.print("입력 : "); int ex15_num = sc.nextInt();
    int ex15_ch = 65;
    cnt = 0 ;
    for (int i = 1; i <= ex15_num ; i++){
        for(int j = 0; j < ex15_num-i+1; j++){
            System.out.print( (char)(ex15_ch++) + " " );
        }
        for(int k = i ; k > 1; k--){
            System.out.print( (cnt++) + " ");
        }

        System.out.println("");
    }



	//Exercise #16 ) 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
    //주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
	//입력 예)		3	
	//출력 예 ) 
    // 1 2 3
    //   4 5
    //     6
	System.out.println("========================================");
	System.out.println("Exercise #16");
	System.out.print("입력 : "); int ex16_num = sc.nextInt();
    cnt = 1;
    for(int i = 1; i <= ex16_num; i++){
        for(int k = i ; k > 1; k--){
            System.out.print("  ");
        }
        for(int j = ex16_num-i; j >= 0; j--){
            System.out.print((cnt++) + " ");
        }
        System.out.println("");
    }




	//Exercise #17 ) 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
    //주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
	//입력 예)	3		
	//출력 예 ) 
    // #
    // # #
    // # # #
    //   # #
    //     #
	System.out.println("========================================");
	System.out.println("Exercise #17");
	System.out.print("입력 : ");    int ex17_num = sc.nextInt();
    for(int i = 0 ; i < ex17_num; i++){
        for(int j = 0; j <= i ; j++){
            System.out.print("# ");
        }
        System.out.println("");
    }
    for(int i = 0 ; i <ex17_num-1; i++){
        for(int j = 0; j <= i; j++) System.out.print("  ");
        for(int j = ex17_num-1; j > i ; j--){
            System.out.print("# ");
        }
        System.out.println("");
    }



	//Exercise #18 ) 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
    //10 미만의 홀수만 출력하시오.
    //주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
	//입력 예)	3		
	//출력 예 ) 
    // 1 3 5
    // 7 9 1
    // 3 5 7
	System.out.println("========================================");
	System.out.println("Exercise #18");
	System.out.print("입력 : "); int ex18_num = sc.nextInt();
    int[] ex18_arr = {1,3,5,7,9};
    cnt = 0 ;
    for(int i = 0 ; i < ex18_num; i++){
        for(int j = 0 ; j < ex18_num; j++){
            if (cnt ==5) cnt = 0;
            System.out.print(ex18_arr[cnt++] + " ");
        }
        System.out.println("");
    }






	sc.close();
	System.out.println("========================================");
	System.out.println("Control Statement Exerice 종료합니다. 수고하셨습니다.");
  }
}