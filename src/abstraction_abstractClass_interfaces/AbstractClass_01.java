package abstraction_abstractClass_interfaces;
// Do you relate it is actually a Abstraction happens here
//Exposing the set of Services but hiding the internal Implementation
//here the Plane class shows only service name and hiding internal things of Services that's mean Plane Class follow Abstraction Rule
 abstract class Plane{
    public abstract void takeoff();
    public abstract void fly();
    public abstract void land();
}
class PassengerPlane extends Plane {
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
class CargoPlane extends Plane {
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
    void allowplane(Plane ref) {
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class AbstractClass_01 {
    static void main() {
        AirPort a = new AirPort();
        a.allowplane(new PassengerPlane());
        a.allowplane(new CargoPlane());
        a.allowplane(new FighterPlane());




    }
}

