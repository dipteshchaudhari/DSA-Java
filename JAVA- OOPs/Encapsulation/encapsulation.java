package Encapsulation;
class Student{
    private String name;
    private int age;

    public void setAge(int age){

        if(age > 0) {
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }

    public int getAge(){
        return age;
    }

}
class encapsulation{
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(-20);
        System.out.println(s1.getAge());

    }
}