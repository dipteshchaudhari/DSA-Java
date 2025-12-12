// We have to find which is the largest among all strings 
// laxicographic wise :
// we'll Use function called [compateTo()]

public class Question3 {
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","mango"};

        String largest = fruits[0];
        for(int i = 0 ; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }   
        }
        System.out.println(largest);
    }
}
