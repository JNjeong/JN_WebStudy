import java.util.ArrayList;

public class day15 extends Thread {
    
    int seq;
    public day15(int seq){
        this.seq = seq;
    }
    
    public void run(){
        System.out.println("thread start");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("thread error");
        }
        System.out.println(this.seq+"thread end.");
    }
    
    public static void main(String[] args)  {
        
        /* thread */
        
        //thread 기초
        // for(int i = 0 ; i < 10; i++){
        //     Thread t = new day15(i);
        //     t.start();
        // }
        // System.out.println("main ends.");        //main 이후에서야 thread종료. 순서도 뒤죽박죽임
        // System.out.println("=================================================================");

        
        // //main 종료전에 thread 종료되도록 변경
        // ArrayList<Thread> threads = new ArrayList<Thread>();
        // for(int i = 0 ; i < 10; i++){
        //     Thread t2 = new day15(i);
        //     t2.start();
        //     threads.add(t2);
        // }

        // for(int i = 0 ; i < threads.size(); i++){
        //     Thread t3 = threads.get(i);
        //     try{
        //         t3.join();
        //     }
        //     catch(Exception e){;}
        // }
        // System.out.println("main ends");
        // System.out.println("==============================================");

        /* Thread extends 구현, interface 구현 */
        day15_ThreadExtends thE = new day15_ThreadExtends();
        Runnable r = new day15_ThreadInterface();

        Thread t = new Thread(r);

        t.start();
        thE.start();





    }
}
