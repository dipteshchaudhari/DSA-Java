// pattern 4 :

        // A
        // B C
        // D E F 
        // G H I J

public class character {
    public static void main(String[] args) {
        
        // int n=4;
        // char ch='A';
        // for(int line=1;line<=n;line++){
        //     for(int chars=1;chars<=line;chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }



        // pattern:

        //   1 2 3 4 5 
        //   1 2 3 4
        //   1 2 3
        //   1 2
        //   1

        // int n=5;

        // for(int line=1 ; line<=n ;line ++){
        //     for(int nums=1;nums<=(n-line+1);nums++){
        //         System.out.print(nums);
        //     }
        //     System.out.println();
        // }

        // pattern : 

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 10 11 12 13 14
        
        int n = 4;
        int num = 1;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(" " +num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
