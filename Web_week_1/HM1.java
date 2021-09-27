import java.util.Scanner;

class HW1 {
  public static void main(String[] args) {

	/* homework #1 */
	System.out.println("Jeong\n");
	System.out.println("Jun");
	System.out.println("Hong");

	/* homework #2 */
	int x = 63;
	int y = 18;	
	System.out.println("x값은 "+x+"입니다.");
	System.out.println("x값은 "+y+"입니다.");
	System.out.println("합계는 "+(x+y)+"입니다.");
	System.out.println("평균은 "+ ((x+y)/2) + "입니다.");

	/* homework #3 */
	Scanner sc = new Scanner(System.in);
	System.out.print("정숫값 : ");
	int usr = sc.nextInt();
	System.out.println(usr+" 을(를) 입력했습니다.");

	/* homework #4 */
	System.out.print("정숫값 : ");
	usr = sc.nextInt();
	System.out.println("10을 더한 값은 "+(usr+10)+"입니다.");
	System.out.println("10을 뺀 값은 "+(usr-10)+"입니다.");

	/* homework #5 */
	System.out.println("정숫값 : ");
	usr = sc.nextInt();
	System.out.println("마지막 자릿수를 제외한 값은 "+((usr)/10)+"입니다.");
	System.out.println("마지막 자릿수는 "+((usr)%10)+"입니다.");
	
	sc.close();
  }
}