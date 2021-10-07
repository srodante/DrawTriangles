public class DrawTriangles {
    public static void main(String[]args){
        int ctr = 1;

        // output is 1, 12, 123, 123, 12345
        for (int i = 1; i <= 5; i++) {
            for (int i2 = 1; i2 <= i; i2++) {
                System.out.print(i2);
            }
            System.out.println();
        }

        // output is 1, 22, 333, 4444, 55555
        for (int i = 1; i <= 5; i++){
            for (int i2 = 1; i2 <= i; i2++){
                System.out.print(i);
            }
            System.out.println();
        }

        // output is 1, 2 3, 4 5 6, 7 8 9 10
        for (int i = 1; i <= 4; i++){
             for (int i2 = 1; i2 <= i; i2++){
             System.out.print(ctr + " ");
             ctr ++;
             }
            System.out.println();
        }

        // output is 1, 01, 101, 0101, 10101
        for (int i = 1; i <= 5; i++){
            for (int i2 = 1; i2 <= i; i2++){
                if (i % 2 == 1){
                   System.out.printf("%d", i2 % 2);
                } else
                    System.out.printf("%d", (i2 + 1) % 2);
            }
            System.out.println();
        }
    }
}
