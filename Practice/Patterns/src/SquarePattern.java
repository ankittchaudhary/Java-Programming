public class SquarePattern {
    static void main(String[] args) {
        //Square Pattern
        /*

        * * * *
        * * * *
        * * * *
        * * * *

         */
        int n = 4; //6x6 square
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
