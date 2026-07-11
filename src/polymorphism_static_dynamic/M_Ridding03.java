package polymorphism_static_dynamic;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is Sleeping");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey is Climbing and eating ");
    }
    public void sleep(){
        System.out.println("Monkey sleeps on trees");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer Eating in Caves");
    }
    public void sleep(){
        System.out.println("Deer is Sleeping in caves");
    }
}
class Lion extends Animal{
    public void eat(){
        System.out.println("Lion Hunts and eat");
    }
    public void sleep(){
        System.out.println("Lion sleeps on Jungle");
    }
}
class Forest{
    public void allowAnimal(Animal animal){
        animal.eat();
        animal.sleep();
        System.out.println();
    }
}

public class M_Ridding03 {
    static void main() {
        Forest f = new Forest();
        f.allowAnimal(new Monkey());
        f.allowAnimal(new Deer());
        f.allowAnimal(new Lion());
    }


}
