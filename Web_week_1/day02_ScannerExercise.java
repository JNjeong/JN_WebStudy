import java.util.Scanner;

class dasy02_ScannerExercise {
  public static void main(String[] args) {

	/* Scanner Exercises */
	Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
	System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");

    

	//Exercise #1 ) 정수형 변수를 선언하고 -100을 대입하여 출력하는 프로그램을 작성하라.
	System.out.println("========================================");
	System.out.println("Exercise #1");
	int ex1_num; //정수형 변수 선언
	System.out.print("입력 : "); ex1_num = sc.nextInt(); //입력값을 대입
	System.out.println(ex1_num); 

	

	//Exercise #2 ) 정수형 변수 2개를 선언하여 -1과 100을 대입한 후 아래와 같이 출력하는 프로그램을 작성하라.
	System.out.println("========================================");
	System.out.println("Exercise #2");
	int ex2_num1, ex2_num2; //정수형 변수 2개 선언
	System.out.print("첫번째 값 입력 : "); ex2_num1 = sc.nextInt(); //입력값 대입
	System.out.print("두번째 값 입력 : "); ex2_num2 = sc.nextInt(); 
	System.out.println(ex2_num1);
	System.out.println(ex2_num2);



	//Exercise #3 ) 두 개의 정수형 변수를 선언하고 값을 대입하여 아래와 같이 출력되는 프로그램을 작성하라.
	//55 - 10 = 45
	//2008 - 1999 = 9
	System.out.println("========================================");
	System.out.println("Exercise #3");
	System.out.print("첫번째 값 입력 : "); int ex3_num1 = sc.nextInt(); //정수형 변수 생성과 입력값 대입을 동시에 실행
	System.out.print("두번째 값 입력 : "); int ex3_num2 = sc.nextInt();
	System.out.println(ex3_num1 + " - " + ex3_num2 + " = " + (ex3_num1 - ex3_num2)); //계산식을 포함하여 계산결과를 출력



	//Exercise #4 ) 추의 무게를 저장할 변수와 중력의 비율을 저장할 변수를 선언하고,
	//다음 두 값을 변수에 저장하여 곱셈 계산식을 출력하는 프로그램을 작성하라.
	//예시 : 추의 무게 = 49, 중력의 비율 = 0.2683
	System.out.println("========================================");
	System.out.println("Exercise #4");
	System.out.print("추의 무게 입력 : "); int ex4_weight = sc.nextInt(); //추의 무게
	System.out.print("중력 비율 입력 : "); double ex4_gravity = sc.nextDouble(); //중력 비율
	System.out.println(ex4_weight + " * " + ex4_gravity + " = " + (ex4_weight * ex4_gravity));



	//Exercise #5 ) 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
	//2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.​
	System.out.println("========================================");
	System.out.println("Exercise #5");
	System.out.println("1 야드는 91.44cm이고, 1인치는 2.54cm입니다.");
	System.out.print("yard to cm 입력 : "); double ex5_yard = sc.nextDouble(); //야드 길이(cm) 
	System.out.print("inch to cm 입력 : "); double ex5_inch = sc.nextDouble(); //인치 길이(cm) 
	System.out.println("2.1yard = " + (2.1 * ex5_yard));
	System.out.println("10.5inch = "+ (10.5 * ex5_inch));



	//Exercise #6 ) 키를 입력받아 출력하는 프로그램을 작성하라.
	//(입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
	//출력 예시 ) Your height is 170cm.
	System.out.println("========================================");
	System.out.println("Exercise #6");
	System.out.print("height = "); int ex6_height = sc.nextInt();
	System.out.println("Your height is " + ex6_height + "cm");



	//Exercise #7 ) 두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
	//(먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
	//입력값 예시 ) 16 5
	System.out.println("========================================");
	System.out.println("Exercise #7");
	System.out.print("첫번째 값 입력 : "); int ex7_num1 = sc.nextInt();
	System.out.print("두번째 값 입력 : "); int ex7_num2 = sc.nextInt();
	if(ex7_num1 < 1 || ex7_num1 > 500){ 
		System.out.println("첫번째 값 범위 오류 발생(1~500)"); //정수의 조건(1이상, 500이하) 미충족시 프로그램 종료
		System.exit(0);
	}
	if(ex7_num2 < 1 || ex7_num2 > 500) {
		System.out.println("두번째 값 범위 오류 발생(1~500)"); //정수의 조건(1이상, 500이하) 미충족시 프로그램 종료
		System.exit(0);
	}	
	if(ex7_num1 < ex7_num2){
		System.out.println("두번째 값은 첫번째 값보다 커야합니다."); //정수의 조건(먼저 받는 수가 항상 크며) 미충족시 프로그램 종료
		System.exit(0);
	} 
	//위의 조건들에 충족될 경우, 실행
	System.out.println(ex7_num1 + " * " + ex7_num2 + " = " + (ex7_num1 * ex7_num2));
	System.out.println(ex7_num1 + " / " + ex7_num2 + " = " + (ex7_num1 / ex7_num2));

   

	//Exercise #8 ) 실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
	//(C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
	//입력값 예시 ) 12.2536, 526.129535, A
	System.out.println("========================================");
	System.out.println("Exercise #8");
	System.out.print("첫번째 실수 입력 : "); double ex8_num1 = sc.nextDouble();;
	System.out.print("두번째 실수 입력 : "); double ex8_num2 = sc.nextDouble();;
	System.out.print("문자 입력 : "); String ex8_char = sc.next();

	double ex8_rounded_num1 = Math.round((ex8_num1 * 100.0)) / 100.0; //실수를 소수 둘째자리까지 반올림
	double ex8_rounded_num2 = Math.round((ex8_num2 * 100.0)) / 100.0; //위와 동일

	System.out.println(ex8_rounded_num1); //출력
	System.out.println(ex8_rounded_num2); 
	System.out.println(ex8_char); 

	

	//Exercise #9 )	세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성하시오.
	//입력 예시 ) 1.2568, 95.21438, 526.851364
	System.out.println("========================================");
	System.out.println("Exercise #9");
	System.out.print("첫번째 실수 입력 : "); double ex9_num1 = sc.nextDouble();
	System.out.print("두번째 실수 입력 : "); double ex9_num2 = sc.nextDouble();
	System.out.print("세번째 실수 입력 : "); double ex9_num3 = sc.nextDouble();
	double ex9_round_num1 = Math.round(ex9_num1 * 1000.0) / 1000.0;
	double ex9_round_num2 = Math.round(ex9_num2 * 1000.0) / 1000.0;
	double ex9_round_num3 = Math.round(ex9_num3 * 1000.0) / 1000.0;
	
	System.out.println(ex9_round_num1+"\n"+ex9_round_num2+"\n"+ex9_round_num3);


	
	//Exercise #10 ) 세 개의 정수형 변수를 선언하고 각 변수에 10 20 30을 대입한 후 그 변수를 이용하여 출력 예와 같이 출력하는 프로그램을 작성하시오.
	//출력 예시 ) 10 + 20 = 30
	System.out.println("========================================");
	System.out.println("Exercise #10");
	System.out.print("첫번째 값 입력 : "); int ex10_num1 = sc.nextInt();
	System.out.print("두번째 값 입력 : "); int ex10_num2 = sc.nextInt();	
	System.out.print("세번째 값 입력 : "); int ex10_num3 = sc.nextInt();
	System.out.println(ex10_num1 + " + " + ex10_num2 + " = " + ex10_num3);



	//Exercise #11 ) 실수형 변수를 2개 선언한 후 각각에 80.50, 22.34를 대입한 후 두 수의 합을 구하여 각각의 숫자를 10칸씩 오른쪽에 맞추어 소수 둘째자리까지 출력하는 프로그램을 작성하시오.
	//출력 예시 )"     80.50     22.34    102.84"
	System.out.println("========================================");
	System.out.println("Exercise #11");
	System.out.print("첫번째 값 입력 : "); double ex11_num1 = sc.nextDouble();
	System.out.print("두번째 값 입력 : "); double ex11_num2 = sc.nextDouble();
	String blank = "     "; //5칸의 공백 생성
	System.out.println(blank + ex11_num1 + blank + ex11_num2 + blank + (ex11_num1+ex11_num2));

	//Exercise #12 ) 정수형 변수 한 개를 선언하여 50을 대입하고 실수형 변수 한 개를 선언하여 100.12를 대입한 후 다음과 같이 출력되는 프로그램을 작성하시오.
	//(결과값은 소수점 이하에서 반올림) 
	//출력 예시 ) 100.12 * 50 = 5006
	System.out.println("========================================");
	System.out.println("Exercise #21");
	System.out.print("첫번째 값 입력 : "); int ex12_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); double ex12_num2 = sc.nextDouble();
	System.out.println(ex12_num2 + " * " + ex12_num1 + " = " + (Math.round(((ex12_num2*(double)ex12_num1)))));
	//위의 출력문에서 계산 결과는 정수의 형변환, round처리를 한번에 하여 출력문에 추가로 넣어서 출력한 것이다.



	//Exercise #13 ) 세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.(단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)
	//입력 예시 ) 20 50 100
	//출력 예시 ) sum = 170
	// 			 avg = 56
	System.out.println("========================================");
	System.out.println("Exercise #13");
	System.out.print("첫번째 값 입력 : "); int ex13_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex13_num2 = sc.nextInt();	
	System.out.print("세번째 값 입력 : "); int ex13_num3 = sc.nextInt();	
	System.out.println("sum = " + (ex13_num1+ex13_num2+ex13_num3)); 
	System.out.println("avg = " + (int)(ex13_num1+ex13_num2+ex13_num3)/3); 
	//평균 계산시 총합이 필요하기에, 반복되는 값을 변수에 대입하여 사용하여도 되지만, 라인을 늘리지 않기 위해 복붙함. 변수활용을 더욱 추천.
	//소수점 이하를 버림하는 경우, 강제 형변환을 하여 소수점 부분을 버림하는 효과를 볼 수 있다. 따로 버림함수를 활용하는 것도 가능하다.



	//Exercise #14 ) 실수의 yard(야드)를 입력받아 cm(센티미터)로 환산하여 입력값과 환산한 값을 출력 예와 같이 소수 둘째자리에서 반올림하여 첫째자리까지 출력하는 프로그램을 작성하시오. (단 1야드 = 91.44cm로 한다.)  
	//입력은 "yard? "라고 먼저 출력하고, 실수를 입력받는다.  실수는 "double"로 한다.
	//출력 예시 ) 10.1yard = 923.5cm
	System.out.println("========================================");
	System.out.println("Exercise #14");
	System.out.print("yard? "); double ex14_yard = sc.nextDouble();
	System.out.println(ex14_yard+"yard = " + (Math.round(((ex14_yard*91.44)*100.0)/100.0)));

	sc.close();
	System.out.println("========================================");
	System.out.println("Scanner Exerice 종료합니다. 수고하셨습니다.");

  }
}