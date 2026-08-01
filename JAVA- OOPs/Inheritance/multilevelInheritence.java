class Professor{
    void Teaching(){
        System.out.println("professor is teaching one subject in class");
    }
}
class Peon extends Professor{
    void Work(){
        System.out.println("peon comes to the professor and ask for signing the document");
    }
}
class student extends Peon{
    void shouting(){
        System.out.println("students started shouting when professor is busy signing");
    }
}
public class multilevelInheritence {
    public static void main(String[] args) {
        student s = new student();
        s.Teaching();
        s.Work();
        s.Teaching();
    }
}
