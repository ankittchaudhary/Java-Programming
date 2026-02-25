public class RightTriangleWithIncreasingNums {
    static void main(String[] args) {
        //Right Angled Triangle with Increasing Nums Pattern
        /*

         1
         1 2
         1 2 3
         1 2 3 4

         */
        int n = 5;
        for (int i=0; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("\n");
        }

        System.out.println("=================================");
        System.out.println("Repeating Numbers");
        //Repeating nums
        /*

         1
         2 2
         3 3 3
         4 4 4 4

         */
        int m = 4;
        for (int i=1; i<=m; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }
}
