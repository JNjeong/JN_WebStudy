import java.util.Arrays;
import java.util.Random;

public class day06 {
    public static void main(String[] args) {

    /* Array */
    //배열의 기초문법
    int[] score = new int[5];

    score[0] = 50;
    score[1] = 60;
    score[2] = 70;
    score[3] = 80;
    score[4] = 90;

    int temp = score[2] + score[4];
    System.out.println(temp);

    for(int i = 0 ; i < 5; i++){
        System.out.printf("score[%d] : %d\n" , i, score[i]);
    }


    //흔히 발생하는 Error 경우
    // System.out.println(score[5]);    //인덱스 번호 주의!!


    //length()
    System.out.println(score.length);
    for(int i = 0 ; i < score.length; i++){
        System.out.printf("score[%d] : %d\n" , i, score[i]);
    }
    
    
    //for문 사용한 배열
    score = new int[5];
    for(int i = 0 ; i < score.length; i++){  //----------대입전
        System.out.printf("score[%d] : %d\n" , i, score[i]);
    }
    for ( int i = 0 ; i < score.length; i++){ //---------대입
        score[i] = i + 10;
    }
    for(int i = 0 ; i < score.length; i++){ //------------대입후
        System.out.printf("score[%d] : %d\n" , i, score[i]);
    }


    //배열 생성 2
    int[] iArr = {1, 2, 3, 4, 5};
    char[] chArr = {'a', 'b', 'c', 'd', 'e'};
    System.out.println(iArr); //이상한 값 출력됨
    System.out.println(chArr); //제대로 출력됨

    //배열의 출력방법1, for()
    for(int i = 0 ; i < iArr.length; i++){
        System.out.printf("iArr[%d] = %d\n", i , iArr[i]);
    }

    //배열의 출력방법2, Arrays.toSring
    System.out.println(Arrays.toString(iArr));



    /* 배열의 복사 */
    int[] arr= {1, 2, 3, 4, 5};
    int[] tmp = new int[arr.length*2];

    //복사 방법1, for

    for(int i = 0 ; i < tmp.length; i++){  //----------대입전
        System.out.printf("tmp[%d] : %d\n" , i, tmp[i]);
    }

    for ( int i = 0 ; i < arr.length; i++){ //-------tmp에 복사
        tmp[i] = arr[i];
    }

    for(int i = 0 ; i < tmp.length; i++){  //----------대입전
        System.out.printf("tmp[%d] : %d\n" , i, tmp[i]);
    }
    System.out.println("=======================================");

    //복사 방법2, System.arraycopy();
    tmp = new int[arr.length*2]; //tmp 초기화
    System.arraycopy(arr, 0, tmp, 0, 5);

    for(int i = 0 ; i < tmp.length; i++){  //----------확인하기
        System.out.printf("tmp[%d] : %d\n" , i, tmp[i]);
    }


    /* 배열 실전활용 */ 

    // 배열 Exercise #1)
    //1. 총합 평균 ; 배열의 모든 요소를 더해서 총합 평균
    int[] scoreArr = {100, 88, 100, 100, 90};
    int sum = 0;
    for(int i = 0 ; i < scoreArr.length; i++){
        sum+= scoreArr[i];
    }
    System.out.println("총점: " + sum );
    System.out.println("평균: " + (double)((sum)/scoreArr.length)   );


    //배열 Exercise #2) 최고점수, 최저점수출력
    int max = scoreArr[0], min = scoreArr[0];
    for(int i = 0 ; i< scoreArr.length; i++){
        if(max <= scoreArr[i]) max = scoreArr[i];
        if(min >= scoreArr[i]) min = scoreArr[i];
    }
    System.out.println("최고점수 : " + max);
    System.out.println("최저점수 : " + min);
    System.out.println("===========================");


    //배열 Exercise #3) 로또 번호 추첨
    Random rand = new Random();
    int[] Lotto = new int[6];
    int cnt=0;
    boolean flag = false;
    while (true){
        int randint = rand.nextInt(45)+1;
        for(int j = 0 ; j < Lotto.length; j++){
            if(Lotto[j] == randint) flag = true;
        }
        if (flag) continue;
        System.out.printf("ball[%d] : %d\n", cnt, randint);
        cnt ++;
        if (cnt == 6) break;
    }

    /*또 다른 코드*/
    // for(int i = 0 ; i < 6; i++){
    //     Lotto[i] = 1 + rand.nextInt(45);
    //     for(int j = 0 ; j < i; j++){
    //         if(arr[i] == arr[j]) i--;
    //     }
    // }   
 


    /* String 배열 */ 
    //String 배열 기초
    String[] name = new String[5];
    name[0] = "Jeong";
    name[1] = "Ju";
    name[2] = "Nong";

    for( String n : name) {
        System.out.println(n);
    }




    }
}
