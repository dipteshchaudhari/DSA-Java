public class inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
        d.sleep();
    }
}
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
    void sleep(){
        System.out.println("sleeps");
    }
}
class dog extends Animal {
    int legs;

    void bark() {
        System.out.println("barks");
    }
}
// class hybrid extends dog {
//     String breed;
// }
class fish extends Animal {
    int fins;
}


// single inheritance
// multilevel inheritance
// hierarchical inheritance
// hybrid inheritance