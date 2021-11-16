public class day13_Tiger extends day13_Animal implements day13_Predetor, day13_bark{
    public String getFood(){
        return "apple";
    }

    public void barkable(){
        System.out.println("어흥");
    }
}
