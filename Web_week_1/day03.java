import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	
	/* if */
	
	//if문의 기초
	if (5>4){ //조건식
		System.out.println("5가 4보다 큽니다."); //실행구문
	}

	//if문의 조건분기
	int x = 0;
	System.out.printf("x=%d 일 때, 참인 것은 %n", x);
	if (x==0) System.out.println("x == 0");
	if (x!=0) System.out.println("x != 0");

	x = 1;	
	System.out.printf("x=%d 일 때, 참인 것은 %n", x);
	if (x==0) System.out.println("x == 0");
	if (x!=0) System.out.println("x != 0");

	//if문의 블럭 {}
	Scanner sc = new Scanner(System.in);
	int input;
	String temp = sc.nextLine();
	input = Integer.parseInt(temp);

//	 if(input == 0){
//	 	System.out.println("입력하신 숫자는 0입니다.");
//	 }
//	 if(input != 0){
//	 	System.out.printf("입력하신 숫자는 %d입니다.", input);
//	 }
	
	//if ~ else문
	if(input == 0){
		System.out.println("입력하신 숫자는 0입니다.");
	}
	else {
		System.out.printf("입력하신 숫자는 %d입니다.\n", input);
	}

	//if ~ else if ~ else문
	int score = 0;
	char grade, opt = ' ';
	
	System.out.print("학생 점수를 입력하세요."); score = sc.nextInt();

	//if의 중첩문
	if (score >= 90){
		grade = 'A';
		if(score >= 98){
			opt = '+';
		}
		else if(score < 94){
			opt = '-';
		}
	}
	else if (score >= 80){
		grade = 'B';
		if(score >= 88){
			opt = '+';
		}
		else if(score < 84){
			opt = '-';
		}
	}
	else if (score >= 70){
		grade ='C';
		if(score >= 78){
			opt = '+';
		}
		else if(score < 74){
			opt = '-';
		}
	}
	else {grade = 'D';}
	System.out.printf("학생의 학점은 %c%c입니다.\n", grade, opt);
	


	/* switch */
	System.out.print("현재 월을 입력하세요"); int month = sc.nextInt();
	switch (month){
		case 3 : 
		case 4 : 
		case 5 : 
		System.out.println("현재 계절은 봄입니다."); break; 

		case 6 : case 7 : case 8 : 
		System.out.println("현재 계절은 여름입니다."); 
		break; 

		case 9 : case 10 : case 11 : System.out.println("현재 계절은 가을입니다."); break; 

		default : System.out.println("현재 계절은 여름입니다."); break;
	}
	//위는 case 사용을 각각 달리 하는 방법들이다.


  }
}