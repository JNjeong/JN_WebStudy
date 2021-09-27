import java.util.Scanner;

class day03_ControlStatementExercise {
  public static void main(String[] args) {
    /* Operation Exercises */
	Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
	System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");

	
	
	//Exercise #1 ) 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
	//입력 예) -5   / 출력 예 ) -5
    //                          minus	 
    System.out.println("========================================");
	System.out.println("Exercise #1");
	System.out.print("첫번째 값 입력 : "); int ex1_num1 = sc.nextInt(); 
    System.out.println(ex1_num1);
    if (ex1_num1 < 0) System.out.println("minus");
	
	
	//Exercise #2 )“몸무게+100-키”를 비만수치 공식이라고 하자.
    //키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 비만수치가 0보다 크면 다음줄에 비만("Obesity")이라는 메시지를 출력하는 프로그램을 작성하시오. 
    //입력 예 ) 155 60 / 출력 예 ) 5
    //                            Obesity
    System.out.println("========================================");
	System.out.println("Exercise #2");
	System.out.print("키 입력 : "); int ex2_height = sc.nextInt(); 
	System.out.print("몸무게 입력 : "); int ex2_weight = sc.nextInt(); 
	System.out.println( (ex2_weight+100)-ex2_height );
    if ( ((ex2_weight+100)-ex2_height) > 0) System.out.println("Obesity");
	
	
	//Exercise #3 )나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
	//입력 예 ) 18  	/ 출력 에 ) 2 years later
	System.out.println("========================================");
	System.out.println("Exercise #3");
	System.out.print("나이 입력 : "); int ex3_age = sc.nextInt(); 
	if (ex3_age >= 20) System.out.println("adult");
    else System.out.printf("%d years later\n", (20-ex3_age));
	
	
	
	
	//Exercise #4 ) 복싱체급은 몸무게가 50.80kg 이하를 Flyweight, 61.23kg 이하를 Lightweight, 72.57kg 이하를 Middleweight, 88.45kg 이하를 Cruiserweight, 88.45kg 초과를 Heavyweight 라고 하자.
    //몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
	//입력 예 ) 87.3    /   출력 예 ) Cruiserweight
    System.out.println("========================================");
	System.out.println("Exercise #4");
	System.out.print("몸무게 입력 : "); double ex4_weight = sc.nextDouble(); 
	if (ex4_weight <= 50.8) System.out.println("Flyweight");
    else if (ex4_weight <= 61.23) System.out.println("Lightweight");
    else if (ex4_weight <= 72.57) System.out.println("Middleweight");
    else if (ex4_weight <= 88.45) System.out.println("Cruiserweight");
    else System.out.println("Heavyweight");
    
    
	
	
	//Exercise #5 ) 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
	//입력 예 ) 4.3 3.5	/ 출력 에 ) B
	//입력 예 ) 4.0 2.9	/ 출력 에 ) C
	System.out.println("========================================");
	System.out.println("Exercise #5");
	System.out.print("첫번째 값 입력 : "); Double ex5_num1 = sc.nextDouble(); 
	System.out.print("두번째 값 입력 : "); Double ex5_num2 = sc.nextDouble();
    if (ex5_num1 >= 4.0 && ex5_num2 >= 4.0) System.out.println("A");
    else if (ex5_num1 >= 3.0 && ex5_num2 >= 3.0) System.out.println("B");
    else System.out.println("C");
    
	
	
	//Exercise #6 )남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
    //성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
	//입력 예 )  F 15	/ 출력 에 ) GIRL
    
	System.out.println("========================================");
	System.out.println("Exercise #6");
	System.out.print("성별 입력(남자=M , 여자=F) : "); String ex6_sex = sc.nextLine(); 
	System.out.print("나이 입력 : "); int ex6_age = sc.nextInt();
    if (ex6_sex.equals("M")) {
        if(ex6_age >= 18) System.out.println("MAN");
        else System.out.println("BOY");
    }
    else if(ex6_sex.equals("F")){
        if(ex6_age >= 18) System.out.println("WOMAN");
        else System.out.println("GIRL");
    }
    
    
	
	
	
	//Exercise #7 )영문 대문자를 입력받아 'A'이면 “Excellent”, 'B'이면 “Good”, 'C'이면 “Usually”, 'D'이면 “Effort”, 'F'이면 “Failure”, 그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
	//입력 예 )  B 	/ 출력 에 ) GOOD  	
	System.out.println("========================================");
	System.out.println("Exercise #7");
	System.out.print("입력 : "); String ex7_alpha = sc.next(); 
    switch (ex7_alpha){
        case "A" : System.out.println("Excellent"); break;
        case "B" : System.out.println("Good"); break;
        case "C" : System.out.println("Usually"); break;
        case "D" : System.out.println("Effort"); break;
        case "F" : System.out.println("Failure"); break;
        default : System.out.println("error"); break;
    }
    
	
	
	
	//Exercise #1 )4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오. (java는 switch문 사용) (입력은 0~4.5)
    //4.0 이상 : "scholarship" 3.0 이상 : "next semester" 2.0 이상 : "seasonal semester" 2.0 미만 : "retake"​
    //실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))
	//입력 예 )  3.5	/ 출력 에 ) next semester
	System.out.println("========================================");
	System.out.println("Exercise #8");
	System.out.print("점수 입력 : "); Double ex8_gpa = sc.nextDouble(); 
    if (ex8_gpa > 4.5 || ex8_gpa < 0) System.out.println("잘못된 입력");
    else {
        switch ((int)(ex8_gpa/1)){
            case 4 : System.out.println("scholarship"); break;
            case 3 : System.out.println("next semester"); break;
            case 2: System.out.println("seasonal semester"); break;
            default : System.out.println("retake"); break;
        }
    }
    
	
	//Exercise #9 )3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
	//입력 예 )  18 -5 10	/ 출력 에 ) -5
	System.out.println("========================================");
	System.out.println("Exercise #9");
	System.out.print("첫번째 정수 입력 : "); int ex9_num1 = sc.nextInt();  
	System.out.print("두번째 정수 입력 : "); int ex9_num2 = sc.nextInt();  
	System.out.print("세번째 정수 입력 : "); int ex9_num3 = sc.nextInt();
    int ex9_minor = ex9_num1; 
    if (ex9_minor > ex9_num2) ex9_minor = ex9_num2;
    if (ex9_minor > ex9_num3) ex9_minor = ex9_num3;
    System.out.println(ex9_minor);
	
    
	
	//Exercise #10 )두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
	//입력 예 ) 50 85 	/ 출력 에 ) 35
    
	System.out.println("========================================");
	System.out.println("Exercise #10");
	System.out.print("첫번째 값 입력 : "); int ex10_num1 = sc.nextInt(); 
	System.out.print("두번째 값 입력 : "); int ex10_num2 = sc.nextInt(); 
	System.out.printf("%d\n", Math.abs((ex10_num1 - ex10_num2)) );
	
	
	//Exercise #11 ) 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
	//입력 예 )  0  	/ 출력 에 ) zero
	System.out.println("========================================");
	System.out.println("Exercise #11");
	System.out.print("입력 : "); int ex11_num = sc.nextInt(); 
	if (ex11_num > 0) System.out.println("plus");
    else if (ex11_num < 0) System.out.println("minus");
    else System.out.println("zero");
	
	
	//Exercise #12 )년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
    //400으로 나누어떨어지면 윤년이다. 또는 4로 나누어떨어지고 100으로 나누어떨어지지 않으면 윤년이다. 나머지는 모두 평년이다.
	//입력 예 ) 2008 	/ 출력 예 ) leap year
	System.out.println("========================================");
	System.out.println("Exercise #12");
	System.out.print("년도 입력 : "); int ex12_year = sc.nextInt(); 
    boolean isLeap = (ex12_year % 400 == 0 || ex12_year % 4 == 0 && ex12_year % 100 != 0);
    if (isLeap) System.out.println("leap year");
    else System.out.println("common year");
	
    
    */
    
	
	//Exercise #13 )1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
    //해당 번호가 없으면 "I don't know."라고 출력한다. 개-dog 고양이-cat 병아리-chick​ 
	//입력 예 ) Number? 2		/ 출력 에 ) cat
	System.out.println("========================================");
	System.out.println("Exercise #13");
	System.out.print("Number? "); int ex13_animal = sc.nextInt(); 
    switch (ex13_animal) {
        case 1 : System.out.println("dog"); break;
        case 2 : System.out.println("cat"); break;
        case 3 : System.out.println("chick"); break;
        default : System.out.println("I don't know.");
    }
    
    //Exercise #14 )1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
	//입력 예 ) 2		/ 출력 에 ) cat
	System.out.println("========================================");
	System.out.println("Exercise #13");
	System.out.print("년도 : "); int ex14_num = sc.nextInt(); 
    switch (ex14_num) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("31"); break;
        case 4: case 6: case 9: case 11: System.out.println("30"); break;
        case 2: System.out.println("28"); break;
    }
    
  
	sc.close();
	System.out.println("========================================");
	System.out.println("Control Statement Exerice 종료합니다. 수고하셨습니다.");
  }
}