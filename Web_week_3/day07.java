import javax.swing.event.ChangeListener;

class TV {
    //TV의 속성
    String color;
    boolean power;
    int channel;

    //TV의 기능(method)
    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

public class day07 {
    public static void main(String[] args) {
        /* 2차원 배열 */

        //2차원 배열 Exercise #1)
        int[][] score = { {100,100,100}, {30,40,20}, {70,80,100}, {70,60,60} };
        
        int sum = 0;
        for(int i = 0 ; i < score.length; i++){
            for(int j = 0 ; j < score[0].length; j++){
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("=============================================");



        //위의 문제 다른 풀이
        for (int[] temp : score){
            for(int i : temp){
                sum += i;
            }
        }





        //2차원 배열 Exercise #2) 각 과목별 총 합, 평균, 학생별 총합, 평균
        int korSum=0, engSum=0, mathSum=0;
        int std1=0, std2=0, std3=0, std4=0;
        System.out.println("       국어    영어     수학     총점    평균");
        System.out.println("=============================================");
        for(int k = 0; k<score.length; k++){
            korSum += score[k][0];
            engSum += score[k][1];
            mathSum += score[k][2];
        }
        for(int st = 0 ; st < score[0].length; st++){
            std1 += score[0][st];
            std2 += score[1][st];
            std3 += score[2][st];
            std4 += score[3][st];
        }
        for(int i = 0 ; i < score.length; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print("      ");
                System.out.printf("%3d", score[i][j]);
            }
            if(i==0) System.out.printf("      %3d    %.2f", std1, (double)(std1/3.0));
            if(i==1) System.out.printf("      %3d    %.2f", std2, (double)(std2/3.0));
            if(i==2) System.out.printf("      %3d    %.2f", std3, (double)(std3/3.0));
            if(i==3) System.out.printf("      %3d    %.2f", std4, (double)(std4/3.0));
            System.out.println("");
        }
        System.out.println("=============================================");
        System.out.printf("총점   %3d     %3d      %3d      %3d     %.1f\n", korSum, engSum, mathSum,(korSum+engSum+mathSum), (double)((korSum+engSum+mathSum)/3.0) );
        System.out.printf("평균   %.1f    %.1f    %.1f    %.1f    %.1f\n",(double)(korSum/4.0),(double)(engSum/4.0),(double)(mathSum/4.0), ((double)(korSum/4.0)+(double)(engSum/4.0)+(double)(mathSum/4.0)), ((double)(korSum/4.0)+(double)(engSum/4.0)+(double)(mathSum/4.0)/4.0));
        


        //위 문제의 다른 풀이
        System.out.println("--------------------------------------------------------------");
        System.out.println("번호 국어 영어 수학 총점 평균");
        int korsum =0, engsum =0, mathsum=0;
        for(int i=0;i<score.length; i++){
            int sumstd = 0;
            double avg = 0.0;

            korsum += score[i][0];
            engsum += score[i][1];
            mathsum += score[i][2];
            System.out.printf("%3d",i+1);

            for(int j=0; j <score[i].length; j++){
                sumstd+= score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg=sumstd/(double)score[i].length;
            System.out.printf("%5d %5.1f\n",sumstd,avg);
        }
        System.out.println("==========================================");
        System.out.printf("총점 : %3d %4d %4d\n", korsum, engsum, mathsum);


    /* 객체 */
    //클래스의 생성

    // class TV {
    //     //TV의 속성
    //     String color;
    //     boolean power;
    //     int channel;

    //     //TV의 기능(method)
    //     void power(){
    //         power = !power;
    //     }
    //     void channelUp(){
    //         channel++;
    //     }
    //     void channelDown(){
    //         channel--;
    //     }
    // }
    // ---------맨위 구현된 클래스 참고

    TV ledTV = new TV();
        
    ledTV.channel = 7;
    ledTV.channelDown();
    System.out.println(ledTV.channel);
    ledTV.channelUp();
    System.out.println(ledTV.channel);
    ledTV.channelUp();
    ledTV.channelUp();
    System.out.println(ledTV.channel);

    TV lcdTV = new TV();
    lcdTV.channel = 11;
    lcdTV.channelUp();
    System.out.println(lcdTV.channel);








    }
}
