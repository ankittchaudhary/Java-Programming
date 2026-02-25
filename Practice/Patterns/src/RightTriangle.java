public class RightTriangle {
    static void main(String[] args) {
        //Right Angled Triangle Pattern
        /*

        *
        * *
        * * *
        * * * *

         */
        int n = 4;
        for (int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
