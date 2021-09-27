import java.util.Scanner;

class day04_LoopExercise_while {
	public static void main(String[] args) {
		/* Loop Exercises 1 */
		Scanner sc = new Scanner(System.in); //Scanner 를 사용할 수 있도록 sc객체 생성 (향후 지속적으로 이용)
		System.out.println("========================================");
	System.out.println("해당 문제들에선 입력 란이 따로 없습니다.\n풀이의 원활함을 위해 입력란이 제공됩니다.\n(입력란이 따로 지정된 경우 변경될 수 있습니다.)");
	System.out.println("========================================");
	
	
	
	
	//Exercise #1 )1부터 15까지 차례로 출력하는 프로그램을 작성하시오. while문을 이용하세요.
	// 출력 예 ) 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    System.out.println("========================================");
	System.out.println("Exercise #1");
	int ex1_num1 = 1;
	while (ex1_num1 <= 15){
		System.out.printf("%d ",ex1_num1++);
	}
    System.out.println("");
	
	

	//Exercise #2 )100 이하의 양의 정수만 입력된다.
    //while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
   
    //입력 예 ) 10 / 출력 예 ) 55
    System.out.println("========================================");
	System.out.println("Exercise #2");
	System.out.print("입력 : "); int ex2_num= sc.nextInt();
    int sum = 0; int cnt = 0 ;
    while(cnt<=ex2_num){ sum += cnt; cnt++;}
    System.out.println(sum);

	

	
	//Exercise #3 )한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
	//입력 예 ) number? -10 	/ 출력 에 ) negative number
	System.out.println("========================================");
	System.out.println("Exercise #3");

	while(true){
        System.out.print("number? "); int ex3_num = sc.nextInt(); 
        if (ex3_num > 0) { System.out.println("positive number");}
        else if(ex3_num<0) System.out.println("negative number");
        else break;
    }


	
	
	//Exercise #4 ) 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오 (평균은 반올림하여 소수 첫째자리까지 출력한다.)
	//입력 예 ) 1 2 3 4 5 6 7 8 9 10 100    /   출력 예 ) 155\n14.1
    System.out.println("========================================");
	System.out.println("Exercise #4");
	sum = 0;
	cnt = 0;
	while(true){
		System.out.print("입력 : "); int ex4_num = sc.nextInt(); 
		sum += ex4_num;
		cnt++;

		if (ex4_num >= 100) break;
	}
	Double avg = (double)(sum)/cnt;
	avg = Math.round(avg*10.0)/10.0;
	System.out.printf("%d\n%.1f",sum, avg );

    

	
	//Exercise #5 ) 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
	//3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
	//-1이 입력되면 종료하는 프로그램을 작성하시오.
	//입출력 예 ) 5 12 (4) 21 (7) 100 -1
	System.out.println("========================================");
	System.out.println("Exercise #5");
    while(true){
		System.out.print("입력 : "); int ex5_num = sc.nextInt();
		if (ex5_num % 3 == 0){
			System.out.println((ex5_num/3));
		}
		if(ex5_num == -1) break;
	}
    
	

	
	//Exercise #6 )아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.
	//* 각 나라의 수도 : 
	// 대한민국 = 서울(Seoul)
	// 미국 = 워싱턴(Washington)
	// 일본 = 동경(Tokyo)
	// 중국 = 북경(Beijing)
	//입출력 예
	// 1. Korea
	// 2. USA
	// 3. Japan
	// 4. China
	// number? 1

	// Seoul

	// 1. Korea
	// 2. USA
	// 3. Japan
	// 4. China
	// number? 5

	// none
	System.out.println("========================================");
	System.out.println("Exercise #6");
	while (true){
		System.out.println("1. Korea\n2. USA\n3. Japan\n4. China"); 
		System.out.println("number? "); int ex6_num = sc.nextInt();
		boolean flag = false;

		switch (ex6_num){
			case 1: System.out.println("Seoul\n"); break;
			case 2: System.out.println("Washington\n"); break;
			case 3: System.out.println("Tokyo\n"); break;
			case 4: System.out.println("Beijing\n"); break;
			default: System.out.println("none\n"); flag = true; break;
		}
		if (flag) break;
	}
	

	
	

	
	//Exercise #7 )정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
	//입력 예 )  5 	/ 출력 에 ) 1 2 3 4 5
	System.out.println("========================================");
	System.out.println("Exercise #7");
	System.out.print("입력 : "); int ex7_num = sc.nextInt(); 
    for (int i = 1; i <= ex7_num; i++){
		System.out.printf("%d ",i);
	}
    
	
	
	
	//Exercise #8 )0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
	// 0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
	// 홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
	//입력 예 )  9 7 10 5 33 65 0	/ 출력 에 ) odd : 5
	// 										   even : 1
	System.out.println("========================================");
	System.out.println("Exercise #8");
	int odd = 0; int even = 0;
	while (true){
		System.out.print("입력 : "); int ex8_num = sc.nextInt();
		if (ex8_num == 0) break;
		if (ex8_num % 2== 0) even++;
		else if(ex8_num % 2 == 1) odd++;
	}
	System.out.printf("odd : %d\neven : %d", odd, even);

    
	
	//Exercise #9 )0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
	//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
	//입력 예 )  55 100 48 36 0 101	/ 출력 에 ) sum : 239
	//										   avg : 47.8
	System.out.println("========================================");
	System.out.println("Exercise #9");
	int ex9_num=0;
	sum = 0;
	avg = 0.0;
	cnt = 0;
	while(true){
		System.out.print("입력 : "); ex9_num = sc.nextInt();  
		if (ex9_num < 0 || ex9_num > 100) break;
		sum += ex9_num;
		cnt++;
	}
	avg = (double)(sum) / (double)(cnt);
	avg = Math.round(avg*10.0)/10.0;
	System.out.printf("sum : %d\navg : %.1f", sum, avg);
	
    
	
	//Exercise #10 )0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
	//입력 예 ) 1 2 3 4 5 6 7 8 9 10 0 	/ 출력 에 ) 5
    
	System.out.println("========================================");
	System.out.println("Exercise #10");
	cnt = 0 ;
	while(true){
		System.out.print("입력 : "); int ex10_num = sc.nextInt(); 
		if (ex10_num == 0) break;
		if(ex10_num % 3 == 0 || ex10_num % 5 == 0) continue;
		cnt++;
	}
	System.out.println(cnt);
	
	
	

	//Exercise #11 ) 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
	//(넓이는 반올림하여 소수 첫째자리까지 출력한다.)
	//입출력 예)
	// Base = 11
	// Height = 5
	// Triangle width = 27.5
	// Continue? Y
	// Base = 10
	// Height = 10
	// Triangle width = 50.0
	// Continue? N​
	System.out.println("========================================");
	System.out.println("Exercise #11");
	while (true){	
		System.out.print("Base = "); int ex11_base = sc.nextInt();
		System.out.print("Height = "); int ex11_height = sc.nextInt();
		double width = (double)(ex11_base*ex11_height)/2.0;
		width = Math.round(width*10.0)/10.0;
		System.out.printf("Triangle width = %.1f\n", width);

		System.out.print("Continue? "); char ex11_str = sc.next().charAt(0);

        if (ex11_str == 'Y' || ex11_str == 'y') continue;
		break;
	}
	
	
  
	sc.close();
	System.out.println("========================================");
	System.out.println("Control Statement Exerice 종료합니다. 수고하셨습니다.");
  }
}