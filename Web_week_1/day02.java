import java.util.Scanner;
import java.util.Random;

class day02 {
	public static void main(String[] args) {
		/* Operation */
		//산술변환
		int i = 10;
		float f = 20.0f;

		float result = (float)i + f; //i를 강제 형변환 시켜서 자료형을 동일화 시켜야 연산이 가능하다.
		float auto_result = i + f; //자동형변환 => 형변환을 생략가능하다.



		/* increment Operation */
		//후위형
		int k = 5;
		k++;	// k = k + 1;	,	k += 1;		모두 동일한 기능
		System.out.println(k); //6

		//전위형
		k = 5;
		++k;
		System.out.println(k); //6
		//위와 같이 실행한다면, 둘다 동일한 기능 (1증가) 한다.
		//그렇다면 전위형과 후위형은 완전히 동일한가?


		//후위형
		int m = 5, n = 0;
		n = m++;
		System.out.println("n = m++; 실행 후, m : "+ m+ ", n : "+n); //m : 6, n : 5

		//전위형
		m = 5; n = 0;
		n = ++m;
		System.out.println("n = m++; 실행 후, m : "+ m+ ", n : "+n); //m : 6, n : 6
		//후위형은 m이 증가하기 전에 n에 대입된다. 이후에 1 증가
		//전위형은 m이 먼저 증가한 후, n에 대입된다. 
		

		//increment Operation example
		int r = 5, s = 5;
		System.out.println(r++);			//후위형 r은 출력 후, 증가
		System.out.println(++s); 			//전위형 s는 출력 전에 증가, 그 후 출력
		System.out.println(r+", "+s);		//결과적으로 증가는 됬음을 알 수 있다.
		
		

		/* Scanner */
		Scanner sc = new Scanner(System.in);

		//String scan
		System.out.print("성 : "); String lastName = sc.next();
		System.out.print("이름 : "); String firstName = sc.next();
		System.out.println("안녕하세요. "+lastName+firstName+"님");


		//integer scan
		System.out.print("변수 num1 : "); int num1 = sc.nextInt();
		System.out.print("변수 num2 : "); int num2 = sc.nextInt();

		if(num1 % num2 == 0){
			System.out.println("num2는 num1의 약수입니다.");
		}
		else{
			System.out.println("num2는 num1의 약수가 아닙니다.");
		}
		

		//Exercise #1 ) 입력받는 정수값 판단하기 ( 양수, 음수, 0 )
		//답안 예시 ) 값이 양수입니다. 값이 음수입니다. 값이 0입니다.
		System.out.print("입력 : "); int exer_num = sc.nextInt();
		if(exer_num > 0) System.out.println("값이 양수입니다.");
		else if(exer_num < 0) System.out.println("값이 음수입니다.");
		else System.out.println("값이 0입니다.");


		//Exercise #2 ) 세 개의 정수를 입력받아서, 그 중에서 최소값을 구하기 
		int minor = 0;
		System.out.print("정수 A 입력 : "); int numA = sc.nextInt();
		System.out.print("정수 B 입력 : "); int numB = sc.nextInt();
		System.out.print("정수 C 입력 : "); int numC = sc.nextInt();
		if (numA > numB){
			if(numB > numC)	minor = numC;
			else minor = numB;
		}
		else minor = numA;
		System.out.println("최소값 : "+ minor);



		/* Random */
		Random rand = new Random();
		int rn1 = rand.nextInt(10); //10미만의 난수 발생
		int rn2 = rand.nextInt(90)+10; // 10~90 사이의 난수 발생
		int rn3 = -10 - rand.nextInt(100); //-10부터 - 110까지의 난수 발생
		int rn4 = rand.nextInt(10) * -1; //0부터 -9까지의 난수 발생



		/* 삼항 연산자 */
		int x, y, z, ax, ay, az;
		x = 10;
		y = -5;
		z = 0;
		
		ax = (x >= 0) ? x : -x;	//x의 절대값 구하기
		ay = (y >= 0) ? y : -y;	//y의 절대값 구하기
		az = (z >= 0) ? z : -z;	//z의 절대값 구하기
		System.out.println(ax);
		System.out.println(ay);
		System.out.println(az);



		/* Casting */
		//강제 형변환
		double d = 3.14;
		int number = (int)d;
		System.out.println(number); //3
		System.out.println(d); //3.14 <= int형이 되어 3으로 짤리지 않고, 여전히 double타입인 실수이다.

		//자동형변환
		float exf = 1234; //형변환 생략 => float exf = (float)1234; 가 생략된 것.
		
		//자동형변환 Error Case
	//	byte exb = 1000;	//에러가 발생한다. byte의 범위 : -128 ~ 127
		
		//명시적형변환을 해준 경우
		char ch = (char)1000; 	//에러가 발생하지 않는다.

		//계산식의 경우
		int exi = 3;
		double exd = 1.1 + exi;
		System.out.println(exd);



		/* Rounding */
		double pi = 3.141592;
		System.out.println(Math.round(pi)); //정수값 3이 출력된다. 
		double shortpi = Math.round(pi*1000) / 1000.0; //3.142 => 특정 자릿수까지만 round하는 방법이다.
		System.out.println(shortpi);
		
		sc.close();
	}
}