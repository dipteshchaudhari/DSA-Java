class Animal {
    void eat(){
        System.out.println("Animal Eats the Food..");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog is barking..");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing..");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
        
        cat c = new cat();
        c.meow();
        c.eat();
    }
}
