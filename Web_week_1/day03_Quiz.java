import java.util.Scanner;	
import java.util.Random;

class Main {
  public static void main(String[] args) {
	
	/* Quiz */
	//사람과 컴퓨터의 가위 바위 보 게임을 만드세요
	//컴퓨터는 난수를 발생시켜서 가위바위보를 구현한다.
	//경우 1 . 비겼습니다. / 경우 2. 당신이 이겼습니다. / 경우 3. 컴퓨터가 이겼습니다.
	//조건 !!! 1. switch문을 이용할 것 2. 30줄 이하

	//austiny@gatech.edu 이메일로 제출 

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	while(true){
		//인터페이스
		System.out.print("입력 (가위 = 1, 바위 = 2, 보 = 3, 나가기 = 0) : "); int usr_input = sc.nextInt();

		//컴퓨터 난수 결정
		int comp = rand.nextInt(3) + 1;

		//승부 계산
		switch(usr_input){
			case 1: //가위
				if (comp == 2) { System.out.println("컴퓨터가 이겼습니다."); }
				else if (comp == 3){ System.out.println("당신이 이겼습니다."); }
				else { System.out.println("비겼습니다.."); }
				break;
			case 2: //바위
				if (comp == 1) { System.out.println("당신이 이겼습니다."); }
				else if (comp == 3) { System.out.println("컴퓨터가 이겼습니다."); }
				else { System.out.println("비겼습니다.."); }
				break;
			case 3: //보
				if (comp == 1) { System.out.println("컴퓨터가 이겼습니다."); }
				else if(comp == 2) { System.out.println("당신이 이겼습니다."); }
				else { System.out.println("비겼습니다.."); }
				break;
			default : System.out.println("잘못 입력하셨습니다. (1~3)"); break;
		}
	}
  }
}