public class Vehicle {
    String Hand_steering;
    int gears;
    int Speed;

    public Vehicle (){
        this("Decent", 6,150 );


    }

    public Vehicle (int gears, int speed){
        this("Decent", gears, speed);


    }

    public Vehicle(String hand_steering, int gears, int speed) {
        this.Hand_steering = hand_steering;
        this.gears = gears;
        this.Speed = speed;
    }
}
