public class day13_Lion extends day13_Animal implements day13_Predetor, day13_bark{
    public String getFood(){
        return "banana";
    }

    public void barkable(){
        System.out.println("으르렁");
    }
}
