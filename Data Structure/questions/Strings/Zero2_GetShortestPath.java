public class Zero2_GetShortestPath {
    public static void main(String[] args) {
        String Dir = "WNEENESENNN";
        System.out.println(GetShortestPath(Dir));
    }
    public static float GetShortestPath(String Dir){

        int x = 0;
        int y = 0;

        for(int i=0; i<Dir.length(); i++) {
            char direction = Dir.charAt(i);

            if(direction == 'S') {
                y--;
            } else if(direction == 'N') {
                y++;
            } else if (direction == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        
        return (float)Math.sqrt(X2+Y2);
    }
}
