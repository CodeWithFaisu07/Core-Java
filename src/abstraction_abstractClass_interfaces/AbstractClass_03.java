package abstraction_abstractClass_interfaces;
abstract class Birds{
    public abstract void flying ();
    public abstract void eating();
}
class Sparrow extends Birds{
    @Override
    public void flying() {
        System.out.println("Sparrow Flying at short height");
    }

    @Override
    public void eating() {
        System.out.println("Sparrow Eats Grain..");
    }
}
abstract class Eagle extends Birds{
    @Override
    public void flying() {
        System.out.println("Eagle Flies on very very height>>>");
    }

    @Override
    public abstract void eating();
}
class GOldenEagle extends Eagle{
    @Override
    public void eating() {
        System.out.println("Catches Pray over the Ocean...");
    }
}
class SprentEagle extends Eagle{
    @Override
    public void eating() {
        System.out.println("Sprint Eagles eats Snakes");
    }
}
class sky{
    public void allowBird(Birds ref){
        ref.flying();
        ref.eating();
        System.out.println();
    }
}

public class AbstractClass_03 {
    static void main() {
        sky s = new sky();
        s.allowBird(new Sparrow());
        s.allowBird(new Eagle() {
            @Override
            public void eating() {

            }
        });
        s.allowBird(new SprentEagle());
        s.allowBird(new GOldenEagle());

    }
}