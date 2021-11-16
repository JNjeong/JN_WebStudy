public class day13_Crocodile extends day13_Animal implements day13_Predetor, day13_bark{
    public String getFood(){
        return "cherry";
    }

    public void barkable(){
        System.out.println("크롱");
    }
}
