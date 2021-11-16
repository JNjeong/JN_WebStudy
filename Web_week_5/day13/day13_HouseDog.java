public class day13_HouseDog extends day13_Dog{

    public day13_HouseDog(String name){
        this.setName(name);
    }



    @Override
    public void sleep(){
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour){
        System.out.println(this.name + " zzz in house for "+hour + "hour(s)");

    }


}
