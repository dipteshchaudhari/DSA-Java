// create a book class with : title, author.
// initialize both values using parameterized constructors and display them.

class book{
    String title;
    String author;

    book(String t, String a){
        title = t;
        author = a;
    }
}
public class practice1 {
    public static void main(String[] args) {
        
        book b1 = new book("Subtle Art Of Not Giving a F", "Mark Menson");

        System.out.println(b1.title);
        System.out.println(b1.author);
    }
}
