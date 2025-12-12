public class abstraction {
    public static void main(String[] args) {
        
        // we can not create object(instance) of abstact class
        // Animal a = new Animal();  // not possible

        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
    }
}
abstract class Animal {
    String color;
    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}
class chicken extends Animal{
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}
