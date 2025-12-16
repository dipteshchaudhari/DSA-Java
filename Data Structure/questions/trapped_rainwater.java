public class trapped_rainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        int asn = trapped_water(height);
        System.out.println("trapped rainwater is="+asn);
    }
    public static int trapped_water(int height[]) {
        //we use auxiliary arrays 
        // maximum left boundry for each bar
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];

        for(int i=1; i<height.length; i++) {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        // maximum right boundry for each bar
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];

        for(int i=height.length-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trapped_waterr = 0;
        for(int i=0; i<height.length; i++) {

            int water_level = Math.min(leftmax[i],rightmax[i]); 
            trapped_waterr += (water_level - height[i]);
        }
        return trapped_waterr;
    }
}
