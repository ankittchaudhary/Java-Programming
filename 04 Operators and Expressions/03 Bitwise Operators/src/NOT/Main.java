package NOT;

public class Main {
    static void main(String[] args) {
        System.out.println("NOT OPERATOR");

        int x = 10, y = 6, z;
        /*
        x -> 0 0 0 0 1 0 1 0
        z = ~ x //every bit is inverted

        0 0 0 0 1 0 1 0
        1 1 1 1 0 1 0 1

        z = ~x -> 1 1 1 1 0 1 0 1                                // its 11 but signed bit us 1 so its -11
                  |
                this is signed bit as per byte so it will become -ve value as MSB is 1

         to find actual value we have to find 2's compliment

         z ->   1 1 1 1 0 1 0 1
         1's->  0 0 0 0 1 0 1 0

        //for 2's compliment
         1's -> 0 0 0 0 1 0 1 0
                            + 1
                0 0 0 0 1 0 1 1

         2's compliment -> 0 0 0 0 1 0 1 1     //11 in decimal so if we go to line 15


         OBSERVATION

         10 ka not becomes - 11
         so if num = 6 it will become -7

         */
    }
}
