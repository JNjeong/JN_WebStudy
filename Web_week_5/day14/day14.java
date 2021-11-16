package day14;

public class day14 extends RuntimeException{

    public void shouldbeRun(){
        System.out.println("ok thanks");
    }

    public void say(String nick){
        try{
            if("fool".equals(nick)) throw new day14();
            System.out.println("당신의 별명은 " +nick + "입니다.");

        }
        catch (day14 e){
            System.out.println("에러가 발생했습니다.");
        }
    }

    public void say2(String nick) throws day14{
        if("fool".equals(nick)) throw new day14();
        System.out.println("당신의 별명은 " +nick + "입니다.");
    }


    public static void main(String[] args) {
        /* Exception */
    
        //ArithmeticException
        // int c = 4 / 0;
        // System.out.println(c);

        //IndexOutOfBoundsException
        // int[] a = {1, 2, 3};
        // System.out.println(a[3]);
        

        //try-catch
        int c;
        try{
            c = 4 / 0;
            System.out.println(c);
        }
        catch(ArithmeticException a){
            c = -1;
        }
       
        //finally
        day14 main = new day14();
        int d; 
        try{
            d = 4 / 0;
        } 
        catch(ArithmeticException a){
            c = -1;
            System.out.println("0으로 나눌 수 없습니다.");
        }
        finally{
            main.shouldbeRun();
        }


        /* throw, throuws */

        //throw
        day14 main2 = new day14();
        //상단에 say() 메소드는 fool입력시 종료되지만, 에러를 띄우게도 가능하다.
        main2.say("fool");
        main2.say("genious");

        
        //throws
        try{
            main2.say2("fool");
            main2.say2("genious");
        }   
        catch(day14 ds){
            System.out.println("에러가 발생했습니다.");
        }     


        /* abstract */


    }
}
