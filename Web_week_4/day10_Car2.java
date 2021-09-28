public class day10_Car2 {
    String color;
    String gearType;
    int door;
    
    day10_Car2(){
        this("white","auto",4);
    }    
    
    day10_Car2(String color){
        this(color,"auto",4);
    }


    public day10_Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearType() {
        return this.gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getDoor() {
        return this.door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public day10_Car2 color(String color) {
        setColor(color);
        return this;
    }

    public day10_Car2 gearType(String gearType) {
        setGearType(gearType);
        return this;
    }

    public day10_Car2 door(int door) {
        setDoor(door);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof day10_Car2)) {
            return false;
        }
        day10_Car2 day10_Car2 = (day10_Car2) o;
        return Objects.equals(color, day10_Car2.color) && Objects.equals(gearType, day10_Car2.gearType) && door == day10_Car2.door;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gearType, door);
    }

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", gearType='" + getGearType() + "'" +
            ", door='" + getDoor() + "'" +
            "}";
    }
}
