package polymorphism_static_dynamic;
class Plane{
    public void takeoff(){
        System.out.println("Plane tookOff...");

    }
    public void fly(){
        System.out.println("Plane is Flying...");

    }
    public void land(){
        System.out.println("Plane is Landing...");
    }
}
class PassengerPlane extends Plane{
    public void takeoff(){
        System.out.println("Passenger-Plane tookOff...");

    }
    public void fly(){
        System.out.println("Passenger-Plane is Flying...");

    }
    public void land(){
        System.out.println("Passenger-Plane is Landing...");
    }
}
class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("Cargo-Plane tookOff...");

    }
    public void fly(){
        System.out.println("Cargo-Plane flying...");

    }
    public void land(){
        System.out.println("Cargo-Plane is Landing...");
    }
}
class FighterPlane extends Plane {
    public void takeoff(){
        System.out.println("Fighter-Plane tookOff...");

    }
    public void fly(){
        System.out.println("Fighter-Plane flying..");

    }
    public void land(){
        System.out.println("Fighter-Plane is Landing...");
    }

}
class AirPort{
    //Polymorphism Work here a single allow plane method behave diffrent for Object refrence you pass
    void allowplane(Plane p) {
        p.takeoff();
        p.fly();
        p.land();
    }
}

public class M_Riding02 {
    static void main() {
       Plane  p=null;

       PassengerPlane pp= new PassengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f= new FighterPlane();

        AirPort a = new AirPort();
        a.allowplane(pp);
        a.allowplane(c);
        a.allowplane(f);



    }
}
