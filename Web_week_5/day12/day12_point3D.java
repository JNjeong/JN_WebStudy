public class day12_point3D extends day12_point{
    int z;

 

    day12_point3D(int x, int y){
        super(x, y);
    }

    day12_point3D(int x, int y, int z){
        super(x, y);
        // this.x = x;
        // this.y = y;
        this.z = z;
    }

    @Override
    String getLocation(){
        return "x : " + x + "y : " + y + "z : " + z;
    }
}
