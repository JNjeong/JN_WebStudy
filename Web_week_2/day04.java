import java.util.Scanner;

public class day04 {
    public static void main(String[] args) {
        
        
        // /* for문 */
        
        // //기초 문법
        // for (int i = 1; i<=10; i++){
        //     System.out.printf("Hello World ");
        // }
        // System.out.println("");
        
        // //2 starts
        // for(int i = 1, j = 10 ; i<=10; i++,j--){
        //     System.out.printf("Hi ");
        // }
        // System.out.println("");
        
        // //for example #1)
        // for( int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }
        
        // //for example #2) 1~10까지 누적합계 계산
        // int sum = 0;
        // for ( int i = 0; i < 10; i++ ) {
        //     sum += i;
        // }
        // System.out.println("1~10 sum : " + sum);
        
        // //2 starts for example #3)
        // for(int i = 1, j = 10 ; i<=10; i++,j--){
        //     System.out.printf(i+ "\t" + j+ "\n");
        // }
        
        // //위의 기능을 효율적으로 기능시키기
        // for(int i= 1; i <= 10; i++){
        //     System.out.println(i + "\t" + (11-i));
        // }
        
        
        

        // /* 이중 for()  / 중첩 for() */
        // //이중 for example #1)
        // //*****
        // //*****
        // //*****
        // //*****
        // //***** 를 구현하기
        
        // //for() 한번만 사용할 경우
        // for(int i = 0 ; i < 5; i++){
        //     System.out.println("*****");
        // }
        
        // System.out.println("==================================================");
        // //이중 for() 사용할 경우
        // for(int i = 0 ; i < 5 ; i++){
        //     for(int j = 0 ; j < 5 ; j++){
        //         System.out.printf("*");
        //     }
        //     System.out.println("");
        // }
        
        
        // //이중 for example #2)
        // //*
        // //**
        // //***
        // //****
        // //*****
        // System.out.println("====================================");
        // for(int i = 0 ; i < 5 ; i++){
        //     for (int j = 0 ; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // //이중 for example #3)
        // //숫자를 입력받아서 그 줄 수만큼의 삼각형 출력
        // System.out.println("====================================");
        // Scanner sc = new Scanner(System.in);
        // System.out.print("줄 수 입력 : "); int n = sc.nextInt();
        // for(int i = 0 ; i < n ; i++){
        //     for (int j = 0 ; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // sc.close();


        // //이중 for example #4)
        // //2번문제 거꾸로 직각삼각형 출력
        // System.out.println("====================================");
        // for(int i = 1 ; i <= 5 ; i++){
        //     for (int j = 5 ; j >= i ; j --){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // //이중 for example #5)
        // //구구단 출력
        // System.out.println("====================================");
        // for ( int i = 2; i <= 9; i++){
        //     for (int j = 1; j <= 9; j++){
        //         System.out.printf("%d * %d = %d\n", i, j, (i*j));
        //     }
        // }



        // /* Advanced for() */
        // int arr[] = {1,2,3,4,5};
        
        // //배열 요소 찍기
        // for(int i = 0; i < arr.length ; i++){
        //     System.out.println(arr[i]);
        // }

        // //배열 사용시 기법
        // for(int t : arr){
        //     System.out.println(t);
        // }



        // /* while() */

        // //while 기초문법
        // int k = 5 ;
        // while( k-- != 0){   //0이 아닌 동안만 참
        //     System.out.println("----");
        //     System.out.println(k);
        // }

        //while example #1)
        //숫자를 입력받아서 각 자리수들의 합계를 계산
        //12345 -> 1+2+3+4+5 = 15를 출력하는 프로그램, while활용하기
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : "); int input = sc.nextInt();
        int sum = 0;
        while(input != 0){
           sum += input%10;
           input = input / 10;
        }
        System.out.println(sum);

    }
}
