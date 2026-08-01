// single inheritance : 

class Animal{
    void eat(){
        System.out.println("eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking...");
    }
}
class program1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}