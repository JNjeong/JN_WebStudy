
import java.util.Scanner;


class day01 {
  public static void main(String[] args) {

	/* variables */
	// int a;		<- int 자료형 변수 선언
	// String b;  	<- String 자료형 변수 선언

	// a = 1;				<- int 값 대입
	// b = "Hello World";	<- String 값 대입
	
	int a = 1;					//<-int 자료형 선언과 대입
	String b = "Hello World~";	//<-String 자료형 선언과 대입

	System.out.println(a);
	System.out.println(b);


	
	/* calc */
	int aa = 10;
	int bb = 5;
	int cc = 7;

	System.out.println(aa%bb);

	System.out.println(aa%2); 
	System.out.println(cc%2); 


	/* ++ , --*/
	int i = 0;
	i++; // i = i + 1; , i += 1;와 동일하다.
	System.out.println(i);

	
	/* String.equals, String == */
	String str1 = "hello";
	String str2 = "java";
	String str3 = "hello";
	
	System.out.println(str1.equals(str2)); //false 
	System.out.println(str1.equals(str3)); //true

	System.out.println(str1 == str2); //false
	System.out.println(str1 == str3); //true

	String str4 = "hello";
	String str5 = new String("hello");

	System.out.println(str4 == str5); //false

	
	/* String methods */
	/* IndexOf */
	String aaaa = "Hello Java";
	System.out.println(aaaa.indexOf("Java")); //6

	/*replaceAll*/
	System.out.println(aaaa.replaceAll("Java", "World")); //Hello World

	/*Substring*/
	System.out.println(aaaa.substring(0, 4)); //Hell

	/*toUpperCase*/
	System.out.println(aaaa.toUpperCase()); //HELLO WORLD
	

	/*toLowerCase*/
	System.out.println(aaaa.toLowerCase()); //hello world

	
  }
}

