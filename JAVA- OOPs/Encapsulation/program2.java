package Encapsulation;

class vehicle{
    private String vehicle_name;
    private String owner_name;
    private int speed;

    public void setName(String name){
        owner_name = name;
    }
    public String getName(){
        return owner_name;
    }

    public void setSpeed(int speed){
        if(speed < 120) {
            this.speed = speed;
        }else{
            System.out.println("Invalid speed");
        }
    }
    public int getSpeed() {
        return speed;
    }
}
public class program2 {
    public static void main(String[] args) {
        
        vehicle v1 = new vehicle();

        v1.setName("messi");
        System.out.println(v1.getName());

        v1.setSpeed(121);
        System.out.println(v1.getSpeed());
    }
}
