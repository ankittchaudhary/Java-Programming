public class InvertedRightTriangle {
    static void main(String[] args) {
        //Inverted Right Angled Triangle Pattern
        /*

         * * * *
         * * *
         * *
         *

         */
        int n = 4;
        for (int i=n; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
