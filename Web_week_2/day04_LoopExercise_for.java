import java.util.Scanner;

class day04_LoopExercise_for {
	public static void main(String[] args) {
		/* Loop Exercises 1 */
		Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
		System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");
	
	int sum = 0;
	double avg = 0;
	int cnt= 0;
	
	
	//Exercise #1 )문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.

    //입력 예 ) A   // 출력 예 ) AAAAAAAAAAAAAAAAAAAA
    System.out.println("========================================");
	System.out.println("Exercise #1");
	System.out.print("입력 : "); String ex1_str = sc.next();
	for (int i = 0 ; i < 20; i++){
        System.out.printf(ex1_str);
    }
    System.out.println("");
	
	

	//Exercise #2 )10부터 20까지의 숫자를 차례대로 출력하는 프로그램을 작성하시오.for문을 사용하세요.
    //출력 예 ) 10 11 12 13 14 15 16 17 18 19 20

    System.out.println("========================================");
	System.out.println("Exercise #2");
	for(int i = 10 ; i <= 20; i++){
        System.out.printf("%d ", i);
    }
	

	
	//Exercise #3 )하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오. 입력되는 정수는 50이하이다.
	//입력 예 ) 10	/ 출력 에 ) 2 4 6 8 10
	System.out.println("========================================");
	System.out.println("Exercise #3");


	System.out.print("입력 : "); int ex3_num = sc.nextInt(); 
	for( int i = 1 ; i <= ex3_num; i++ ){
		if(i % 2 ==0 ) System.out.print(i + " ");
	}
        


	
	
	//Exercise #4 ) 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
	//입력 예 ) 95    /   출력 예 ) 585
    System.out.println("========================================");
	System.out.println("Exercise #4");

	int Mthree = 0;
	int Mfive = 0;
	for(int i = 0 ; i < 10; i++){
		System.out.print("입력 : "); int ex4_num = sc.nextInt();
		if (ex4_num % 3== 0) Mthree++;
		if (ex4_num % 5 == 0) Mfive++;
	}
	System.out.printf("Multiples of 3 : %d\nMultiples of 5 : %d", Mthree, Mfive);
	
    

	
	//Exercise #5 ) 10 이하의 과목수 n이 주어진다.
	// 정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 
	// 평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
	// 평균은 반올림하여 소수 첫째자리까지 출력한다.​
	//입출력 예 )4					출력 예) avg : 82.5
	//			75 80 85 90 				pass
	System.out.println("========================================");
	System.out.println("Exercise #5");
    
	System.out.print("과목 수 입력 : "); int ex5_numOfSubjects = sc.nextInt();
	sum = 0;
	avg = 0.0;
	for(int i = 0; i<ex5_numOfSubjects; i++){
		System.out.print("점수 입력 : "); int ex5_score = sc.nextInt();
		sum += ex5_score;
	}
	avg = (double)sum / (double)ex5_numOfSubjects;
	avg = Math.round(avg*10.0)/10.0;
	System.out.println("avg : " + avg);
	if(avg >= 80.0) System.out.println("pass");
	else System.out.println("fail");
    
	

	
	//Exercise #6 )아래와 같이 출력되는 프로그램을 작성하시오.
	//입출력 예)
	// 2 3 4 5 6
	// 3 4 5 6 7
	// 4 5 6 7 8
	// 5 6 7 8 9
	// 6 7 8 9 10

	System.out.println("========================================");
	System.out.println("Exercise #6");
	for(int i = 2; i <= 6; i++){
		for(int j = i; j<= (i+4); j++){
			System.out.printf("%d ", j);
		}
		System.out.println("");
	}
	


	
	//Exercise #7 )구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
	// 곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
	// 출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​
	System.out.println("========================================");
	System.out.println("Exercise #7");
	for(int i = 2; i <= 4; i++){
		for(int j = 1; j<=5; j++){
			if ((i*j) >= 10) System.out.printf("%d * %d = %d   ",i,j, (i*j));
			else System.out.printf("%d * %d =  %d   ",i,j, (i*j));
		}
		System.out.println("");
	}
	
	
    
	
	
	
	//Exercise #8 )10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.
	//입력 예 )  4	/ 출력 에 ) JUNGOL​
	// 						   JUNGOL​
	// 						   JUNGOL​
	// 						   JUNGOL​

	System.out.println("========================================");
	System.out.println("Exercise #8");
	System.out.print("입력 : "); int ex8_num = sc.nextInt();
	for(int i = 0 ; i < ex8_num; i++){
		System.out.println("JUNGOL ");
	}

    
	
	//Exercise #9 )100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
	//입력 예 )  10 5	/ 출력 에 )5 6 7 8 9 10
	System.out.println("========================================");
	System.out.println("Exercise #9");
	

	System.out.print("첫번째 값 입력 : "); int ex9_num1 = sc.nextInt();  
	System.out.print("두번째 값 입력 : "); int ex9_num2 = sc.nextInt();  

	int bigger = ex9_num1;
	int smaller = ex9_num2;
	if (ex9_num2 > ex9_num1){
		bigger = ex9_num2;
		smaller = ex9_num1;
	}
	for (int i = smaller; i<= bigger; i++){
		System.out.print(i + " ");
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
	
	
	

	//Exercise #11 ) 100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오.
	//(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)
	//입력 예)3					출력 예 ) 64.67
	//		   99 65 30
	System.out.println("========================================");
	System.out.println("Exercise #11");
	sum=0;
	avg = 0.0;
	System.out.print("개수 입력 : "); int ex11_num = sc.nextInt();
	for(int i = 0 ; i < ex11_num; i++){
		System.out.println("입력 : "); int ex11_temp = sc.nextInt();
		sum += ex11_temp;
	}
	avg = (double)sum / (double) ex11_num;
	avg = Math.round(avg*100.00)/10.00;
	System.out.printf("%.2f", avg);
	


	//Exercise #12 ) 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
	//입력 예) 10 20 30 55 66 77 88 99 100 15 출력 예 )even : 6 odd : 4
	System.out.println("========================================");
	System.out.println("Exercise #12");
	int even = 0 ;
	int odd = 0;
	for(int i = 0 ; i < 10; i++){
		System.out.print("입력 : "); int temp = sc.nextInt();
		if (temp%2==0) even++;
		else odd++;
	}
	System.out.printf("even : %d\nodd : %d", even, odd);




	//Exercise #13 ) 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
	//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
	//입력 예)	10 15		출력 예 ) sum : 37
	//								 avg : 12.3
	System.out.println("========================================");
	System.out.println("Exercise #13");
	System.out.print("첫번째 값 입력 : "); int ex13_num1 = sc.nextInt();
	System.out.print("두번째 값 입력 : "); int ex13_num2 = sc.nextInt();
	bigger = ex13_num1;
	smaller = ex13_num2;
	sum = 0 ;
	avg = 0.0;
	cnt = 0;
	if (ex13_num2> ex13_num1) {
		bigger = ex13_num2;
		smaller = ex13_num1;
	}
	for(int i = smaller; i<=bigger; i++){
		if (i % 3 == 0 || i % 5 == 0){
			sum+= i;
			cnt ++;
		}
	}
	avg = (double)sum / (double)(cnt);
	avg = Math.round(avg*10.0)/10.0;
	System.out.printf("sum : %d\navg : %.1f", sum, avg);
	



	//Exercise #14 ) 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
	//입력 예)	5	출력 예 ) 5 10 15 20 25 30 35 40 45 50
	System.out.println("========================================");
	System.out.println("Exercise #14");
	System.out.print("입력 : "); int ex14_num = sc.nextInt();
	for(int i =1 ; i <= 10; i++){
		System.out.print(i*ex14_num+ " ");
	}



	//Exercise #15 ) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
	//입력 예)	3 4			출력 예 ) 1 2 3 4
	// 								 2 4 6 8
	// 								 3 6 9 12
	System.out.println("========================================");
	System.out.println("Exercise #15");
	System.out.print("행 수 입력 : "); int ex15_row = sc.nextInt();
	System.out.print("열 수 입력 : "); int ex15_col = sc.nextInt();
	for(int i = 1; i<= ex15_row; i++){
		for(int j = 1; j <= ex15_col;j++){
			System.out.print(i*j+" ");
			
		}
		System.out.println("");
	}



	//Exercise #16 ) 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
	// * 주의 
	// ')'와 '('사이에 공백이 1칸 있다.
	// (1,_1) 처럼 출력한다 : '_'는 공백
	//입력 예)		4		
	//출력 예 ) 
	// (1, 1) (1, 2) (1, 3) (1, 4)
	// (2, 1) (2, 2) (2, 3) (2, 4)
	// (3, 1) (3, 2) (3, 3) (3, 4)
	// (4, 1) (4, 2) (4, 3) (4, 4)
	System.out.println("========================================");
	System.out.println("Exercise #16");
	System.out.print("입력 : "); int ex16_num = sc.nextInt();
	for(int i = 1; i<=ex16_num; i++){
		for(int j = 1 ; j <=ex16_num;j++){
			System.out.printf("(%d, %d) ",i,j);
		}
		System.out.println("");
	}



	//Exercise #17 ) 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
	//단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.
	//구구단 사이의 공백은 3칸이다.
	//입력 예)	5 3			
	//출력 예 ) 
	// 5 * 1 =  5   4 * 1 =  4   3 * 1 =  3
	// 5 * 2 = 10   4 * 2 =  8   3 * 2 =  6
	// 5 * 3 = 15   4 * 3 = 12   3 * 3 =  9
	// 5 * 4 = 20   4 * 4 = 16   3 * 4 = 12
	// 5 * 5 = 25   4 * 5 = 20   3 * 5 = 15
	// 5 * 6 = 30   4 * 6 = 24   3 * 6 = 18
	// 5 * 7 = 35   4 * 7 = 28   3 * 7 = 21
	// 5 * 8 = 40   4 * 8 = 32   3 * 8 = 24
	// 5 * 9 = 45   4 * 9 = 36   3 * 9 = 27
	System.out.println("========================================");
	System.out.println("Exercise #17");
	System.out.print("첫번째 값 입력 : "); int ex17_num1 = sc.nextInt();
	System.out.print("두번째 값 입력 : "); int ex17_num2 = sc.nextInt();

	boolean firstBigger = false;
        
	if (ex17_num1>ex17_num2){
		firstBigger = true;
	}
	
	for (int i = 1; i<= 9; i++){

		if(firstBigger){
			for(int j = ex17_num1; j >= ex17_num2; j--){
				if((i*j) < 10) System.out.printf("%d * %d =  %d   ",j,i,(j*i));
				else System.out.printf("%d * %d = %d   ",j,i,(j*i));
			}
		}
		else{
			for(int j = ex17_num1; j <= ex17_num2; j++){
				if(i*j < 10) System.out.printf("%d * %d =  %d   ",j,i,(j*i));
				else System.out.printf("%d * %d = %d   ",j,i,(j*i));
			}
		}

		System.out.println("");
	}




	sc.close();
	System.out.println("========================================");
	System.out.println("Control Statement Exerice 종료합니다. 수고하셨습니다.");
  }
}