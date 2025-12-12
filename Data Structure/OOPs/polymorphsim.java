public class polymorphsim {
    public static void main(String[] args) {
        // calculator s = new calculator();
        // System.out.println(s.sum(1, 2));
        // System.out.println(s.sum((float)1.2, (float)2.8));
        // System.out.println(s.sum(1,2,3));

        deer d =new deer();
        d.eat();

    }
}
//method overloading

class calculator {
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

//method overriding 

class Animal{
    void eat(){
        System.out.println("animal eats anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Deer eats Grass");
    }
}