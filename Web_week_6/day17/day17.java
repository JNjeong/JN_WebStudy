package day17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.io.*;

public class day17 {
    public static void main(String[] args) throws IOException {
        
        /* Map */
        
        //Map 기초
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.size());
        System.out.println(map.get("people"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.size());
        System.out.println("=============================================================");


        
        /* File */
        FileOutputStream output = new FileOutputStream("day17_FileOutputStream_out.txt");
        for(int i = 0 ; i < 11; i++){
            String data = i + "번째 줄입니다. \n";
            output.write(data.getBytes());
        }
        output.close();

        
    
        FileWriter output2 = new FileWriter("day17_FileWriter_out.txt");
        for(int i = 0 ; i < 11; i++){
            String data = i + "번째 줄입니다. \n";
            output2.write(data);
        }
        output2.close();



        PrintWriter output3 = new PrintWriter("day17_PrintWriter_out.txt");
        for(int i = 0 ; i < 11; i++){
            String data = i + "번째 줄입니다.";
            output3.println(data);
        }
        output3.close();

        
        //파일 수정하기
        PrintWriter output4 = new PrintWriter(new FileWriter("day17_FileOutputStream_out.txt"), true);
        for(int i = 11; i < 21; i++){
            String data = i + "번째 줄입니다.";
            output4.println(data);
        }
        output4.close();

        
        //파일 읽기
        BufferedReader br = new BufferedReader(new FileReader("day17_FileOutputStream_out.txt"));
        while(true){
            String line = br.readLine();
            if(line == null) break;
            System.out.println(line);
        }
        br.close();
        System.out.println("==========================================");


        /* Set */

        //set 기초
        Object[] objArr = {"1", "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet<>();

        for(int i = 0 ; i < objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);
        System.out.println("=============================================");


        //set 활용 lotto machine 
        Set lotto = new HashSet<>();
        for( int i = 0 ; lotto.size() < 6; i++){
            int num = (int)(Math.random()*45) + 1;
            System.out.println(num);
            lotto.add(num);
            System.out.println("lotto : " + lotto);
        }
        System.out.println("=================================================");


        //set 활용 bingo game
        Set bingo = new HashSet<>();
        int[][] board = new int[5][5];

        for(int i = 0 ; bingo.size() < 25; i++){
            bingo.add(new Random().nextInt(25)+1);
        }
        System.out.println("bingo : " +bingo);

        Iterator<String> it = bingo.iterator(); //iterator를 거치면 object 타입이다.
        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[i].length; j++){
                board[i][j] = Integer.parseInt(String.valueOf(it.next()));
                System.out.print(board[i][j] + ((board[i][j] < 10) ? "  " : " ") );
            }
            System.out.println("");
        }
        

        
    }
}
