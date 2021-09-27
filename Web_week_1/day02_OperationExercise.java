import java.util.Scanner;

class day02_OperationExercise {
  public static void main(String[] args) {
    /* Operation Exercises */
	Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
	System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");

	
	
	//Exercise #1 ) 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
	//입력 예) 10 25 33  	 
    System.out.println("========================================");
	System.out.println("Exercise #1");
	System.out.print("첫번째 값 입력 : "); int ex1_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex1_num2 = sc.nextInt();
	System.out.print("세번째 값 입력 : "); int ex1_num3 = sc.nextInt();
	System.out.println("sum : " + (ex1_num1 + ex1_num2 + ex1_num3));
    System.out.println("avg : " + ((ex1_num1 + ex1_num2 + ex1_num3)/3));
	
	
	//Exercise #2 )정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
    //입력 예 ) 20 35 / 출력 예 ) 120 5
    System.out.println("========================================");
	System.out.println("Exercise #2");
	System.out.print("첫번째 값 입력 : "); int ex2_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex2_num2 = sc.nextInt(); //나머지 연산은 %를 사용
	System.out.printf("%d %d", ex2_num1+100, ex2_num2%10);
	
	
	
	//Exercise #3 )한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
	//입력 예 ) 5  	/ 출력 에 ) 5 7
	//첫번째 줄은 후치증가, 두번째 줄은 전치증가
	System.out.println("========================================");
	System.out.println("Exercise #3");
	System.out.print("입력 : "); int ex3_incre = sc.nextInt(); 
	System.out.printf("%d ", ex3_incre++); System.out.println(++ex3_incre);
	
	
	
	//Exercise #4 ) 두 개의 정수를 입력받아서  첫 번째수는 후치 증가 연산자를 사용하고 두 번째 수는 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
	//입력 예 ) 10 20 	/ 출력 에 ) 11 19 190
    System.out.println("========================================");
	System.out.println("Exercise #4");
	System.out.print("첫번째 값 입력 : "); int ex4_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex4_num2 = sc.nextInt(); 
	int ex4_result = (ex4_num1++) * (--ex4_num2);
	System.out.printf("%d %d %d", ex4_num1, ex4_num2, ex4_result);
	
	
	
	//Exercise #5 )두 개의 정수를 입력받아서, 첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고, 두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.
	//(JAVA는 1이면 true, 0이면 false를 출력한다.)
	//입력 예 ) 5 5		/ 출력 에 ) 1 
	//                             0 
	System.out.println("========================================");
	System.out.println("Exercise #5");
	System.out.print("첫번째 값 입력 : "); int ex5_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex5_num2 = sc.nextInt(); 
	System.out.printf("%s\n", (ex5_num1==ex5_num2)?"true":"false");
	System.out.printf("%s\n", (ex5_num1!=ex5_num2)?"true":"false");
	
	
	
	//Exercise #6 )두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
	//이때 입력받은 두 정수를 이용하여 출력하시오.
	//(JAVA는 1이면 true, 0이면 false를 출력한다.)
	//입력 예 )  4 5 	/ 출력 에 ) 4 > 5 --- 0
	// 							   4 < 5 --- 1
	//							   4 >= 5 --- 0
	//                             4 <= 5 --- 1
	System.out.println("========================================");
	System.out.println("Exercise #6");
	System.out.print("첫번째 값 입력 : "); int ex6_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex6_num2 = sc.nextInt();
	System.out.println(ex6_num1 + " > " + ex6_num2 + " = " + (ex6_num1 > ex6_num2)); 
	System.out.println(ex6_num1 + " < " + ex6_num2 + " = " + (ex6_num1 < ex6_num2)); 
	System.out.println(ex6_num1 + " >= " + ex6_num2 + " = " + (ex6_num1 >= ex6_num2)); 
	System.out.println(ex6_num1 + " <= " + ex6_num2 + " = " + (ex6_num1 <= ex6_num2)); 
	
	
	
	//Exercise #7 )2개의 정수를 입력 받아서 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오. (수가 0 이 아닌 경우 참으로, 0 인 경우 거짓으로 간주합니다.)
	//[JAVA]2개의 정수를 입력 받아서 0이 아니면 참(true), 0이면 거짓(false)으로 처리하고 두 값의 논리곱(&&)과 논리합(||)의 결과를 출력하는 프로그램을 작성하시오.
	//​hint : 정수 a를 입력받은 후 boolean c = (a != 0);을 실행하면 c에 a의 논리값이 저장된다.
	//입력 예 )  2 0 	/ 출력 에 ) 0 1  	[JAVA] false true
	System.out.println("========================================");
	System.out.println("Exercise #7");
	System.out.print("첫번째 값 입력 : "); int ex7_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex7_num2 = sc.nextInt();
	System.out.println(((ex7_num1 != 0) && (ex7_num2 != 0)));
	System.out.println(((ex7_num1 != 0) || (ex7_num2 != 0)));
	
	
	
	//Exercise #1 )3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
	//(JAVA는 1이면 true, 0이면 false를 출력한다.)
	//입력 예 )  10 9 9 	/ 출력 에 ) 1 0
	System.out.println("========================================");
	System.out.println("Exercise #8");
	System.out.print("첫번째 값 입력 : "); int ex8_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex8_num2 = sc.nextInt();
	System.out.print("세번째 값 입력 : "); int ex8_num3 = sc.nextInt();
	System.out.print((ex8_num1 > ex8_num2 && ex8_num1 > ex8_num3)+ " " + (ex8_num1 == ex8_num2 && ex8_num1 == ex8_num3));
	
	
	
	//Exercise #9 )국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
	//입력 예 )  70 95 63 100 	/ 출력 에 ) sum 328
	//									   avg 82
	System.out.println("========================================");
	System.out.println("Exercise #9");
	System.out.print("국어 점수 입력 : "); int ex9_kor = sc.nextInt(); 
	System.out.print("영어 점수 입력 : "); int ex9_eng = sc.nextInt(); 
	System.out.print("수학 점수 입력 : "); int ex9_math = sc.nextInt(); 
	System.out.print("컴퓨터 점수 입력 : "); int ex9_cse = sc.nextInt(); 
	System.out.println("sum : "+ (ex9_kor + ex9_eng + ex9_math + ex9_cse));
	System.out.printf("avg : %d\n", (int)(ex9_kor + ex9_eng + ex9_math + ex9_cse)/4);	//좀더 확실히 버림하기 위해 int형으로 강제 형변환.
	
	
	
	//Exercise #10 )두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
	//입력 예 ) 35 10   	/ 출력 에 ) 35 / 10 = 3...5
	System.out.println("========================================");
	System.out.println("Exercise #10");
	System.out.print("첫번째 값 입력 : "); int ex10_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex10_num2 = sc.nextInt(); 
	System.out.printf("%d / %d = %d...%d\n", ex10_num1, ex10_num2, (int)(ex10_num1/ex10_num2), (int)(ex10_num1%ex10_num2));
	
	
	
	//Exercise #11 )직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
	//입력 예 )  20 15 	/ 출력 에 ) width = 25
	//							   length = 30
	// 							   area = 750
	System.out.println("========================================");
	System.out.println("Exercise #11");
	System.out.print("가로 길이 입력 : "); int ex11_width = sc.nextInt(); 
	System.out.print("세로 길이 입력 : "); int ex11_length = sc.nextInt(); 
	System.out.printf("width = %d\nlength = %d\narea = %d\n", ex11_width+5,ex11_length*2, ((ex11_width+5)*(ex11_length*2)) );
	
	
	
	//Exercise #12 )두 정수를 입력받아 첫 번째 수는 전치증가연산자를 사용하고 두 번째 수는 후치감소연산자를 사용하여 출력하고 바뀐 값을 다시 출력하는 프로그램을 작성하시오.
	//입력 예 )  10 15 	/ 출력 에 ) 11 15
	// 							   11 14
	System.out.println("========================================");
	System.out.println("Exercise #12");
	System.out.print("첫번째 값 입력 : "); int ex12_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex12_num2 = sc.nextInt(); 
	System.out.printf("%d %d\n", ++ex12_num1, ex12_num2--);
	System.out.printf("%d %d\n", ex12_num1, ex12_num2);
	


	
	//Exercise #13 )민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
	//(JAVA는 1 이면 true, 0 이면 false를 출력한다.)
	//입력 예 ) 150 35			/ 출력 에 ) 0
	//			145 35  	
	System.out.println("========================================");
	System.out.println("Exercise #13");
	System.out.print("첫번째 키 입력 : "); int ex13_height1 = sc.nextInt(); 
	System.out.print("첫번째 몸무게 입력 : "); int ex13_weight1 = sc.nextInt(); 
	System.out.print("두번째 키 입력 : "); int ex13_height2 = sc.nextInt(); 
	System.out.print("두번째 몸무게 입력 : "); int ex13_weight2 = sc.nextInt(); 
	System.out.println( (ex13_height1 > ex13_height2 && ex13_weight1 > ex13_weight2) );


	sc.close();
	System.out.println("========================================");
	System.out.println("Operation Exerice 종료합니다. 수고하셨습니다.");
  }
}