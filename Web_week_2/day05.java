import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);

	// /* Loop Review */
	// //Review Quiz #1 ) 1부터 몇까지 더하면 그 누적 합계까 200을 넘지 않는 제일 큰 수가 될까?
	int sum = 0;
	int i = 0;
	while( (sum += ++i) <200 ){
		System.out.print(i + "     "+ sum);
	}
  
	// //Review Quiz #2) 합계를 구할 숫자르 계속 입력받아서 0을 입력하면 입력한 숫자들 전부의 합을 계산하여 출력
	 sum = 0;
	 while(true){
	 	System.out.print("입력 : "); int num = sc.nextInt();
	 	if(num == 0 ) break;
	 	sum += num;
	 }
	 System.out.println(sum);
  

	/* do~while */

	// do~while Exercise #1) 1에서 100사이의 정수를 입력하세요 > ???
	// 더 작은 값으로 다시 입력하세요
	// 더 큰값으로 다시 입력하세요
	 Random rand = new Random();
	 int randint = rand.nextInt(101);
	 int usrinput = 0;
	 do{
	 	System.out.print("1~100사이의 정수를 입력하세요");
	 	usrinput = sc.nextInt();
	 	if (usrinput > randint) System.out.println("더 작은값으로 다시 입력하세요");
	 	else if (usrinput < randint) System.out.println("더 큰값으로 다시 입력하세요");
	 } while(usrinput != randint);
	
	// System.out.println(randint + " 정답!!");


	//do~while Exercise #2) 
	//숫자중에 3의 배수가 포함된 갯수만큼 박수를 치는 프로그램을 작성하세요 (1~100)
	 int i = 1;
	 do{
	 	if(i%3==0){
	 		System.out.print(i + "짝");
	 		if (i<10) System.out.print("\b");
	 		if ((i/10) % 3 == 0 && !(i%10 ==0)) System.out.print("짝");
	 		System.out.println("");
	 	}
	 	i++;
	 }while(i != 100);



	/* break , continue */
	//continue를 사용하여 3의 배수는 제외하고 1에서 10까지 출력하세요
	 int i = 0;
	 while(i != 10){
	 	i++;
	 	if (i % 3 == 0) continue;
	 	System.out.println(i);
	 }

	
	//break Exercise #1)
	//1. 파이썬
	//2. CSS
	//3. 자바
	 int usr = 1;
	 do{
	 	System.out.println("1. 파이썬\n2. CSS\n3. 자바\n0. 종료");
	 	usr = sc.nextInt();
	 	if (usr == 0) continue;
	 	switch(usr){
	 		case 1 : System.out.println("파이썬");break;
	 		case 2 : System.out.println("CSS");break;
	 		case 3 : System.out.println("자바");break;
	 	}
	 }while(usr != 0);


	/* 이중반복문 빠져나오기 */
	Loop1 : for(int i = 2; i <= 9 ; i++){
		for(int j = 1 ; j <= 9 ; j++){
			// if (j == 5) break;	//각 단의 4까지만 찍는다.
			if (j == 5) break Loop1;
			System.out.printf("%d * %d = %d\n", i, j , (i*j));
		}
	}



	/* diagram code */
	int arr[] = {1,2,3,4,5};
	sum = 0;
	for(int i = 0 ; i <5; i++){
		if (i < 5) sum += arr[i];
	}
	System.out.println(sum);
  
  
  
  
  
  
  
  
  
  
  
  
  }
}