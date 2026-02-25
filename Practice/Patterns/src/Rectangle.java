public class Rectangle {
    static void main(String[] args) {
        //Square Pattern
        /*

         * * * *
         * * * *
         * * * *
         * * * *
         * * * *
         * * * *

         6x4

         */
        int rows = 6;
        int cols = 4;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
