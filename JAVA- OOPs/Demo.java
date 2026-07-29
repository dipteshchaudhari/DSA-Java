class Mobile{
    String brand;
    String model;
    int price;

    void call() {
        System.out.println("calling...");
    }
    void msg(){
        System.out.println("messeging...");
    }
}
public class Demo{
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "samsung";
        m1.model = "s24";
        m1.price = 500000;

        System.out.println("phone brand : " + m1.brand);
        System.out.println("phone model : " + m1.model);
        System.out.println("phone brand : " + m1.price);

        m1.call();
        m1.msg();
    }
}