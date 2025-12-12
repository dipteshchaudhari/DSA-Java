// TC = 0(n)
public class Question2 {
    public static float shortestPath(String directions) {
        int x = 0;
        int y = 0;

        for(int i = 0 ; i < directions.length() ; i++) {
            char dir = directions.charAt(i);

            if(dir == 'S') {
                y--;
            }else if(dir == 'E') {
                x++;
            }else if(dir == 'W') {
                x--;
            }else{
                y++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    } 
    public static void main(String[] args) {
        // String directions = "WNEENESENNN";
        String directions = "NS";

        float ans = shortestPath(directions);

        System.out.print(ans);

    }
}
