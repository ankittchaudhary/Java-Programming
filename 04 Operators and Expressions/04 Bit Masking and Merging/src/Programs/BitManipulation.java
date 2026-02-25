package Programs;

public class BitManipulation {
    static void main(String[] args) {

        //store both values in byte c as 9, 12 takes only 1 nibble that is 4 bits so c can hold both together using
        //9 = 1001
        //12 = 1100

        /*
        idea
        byte c  = 0 0 0 0  0 0 0 0
                  -------  -------
                     9       12
                  1 0 0 1  1 1 0 0

         */

        /*
        c = c | a

        c   -> 0 0 0 0 0 0 0 0
        a   -> 0 0 0 0 1 0 0 1

        c|a -> 0 0 0 0 1 0 0 1

        now c has 9
        but, we want to store 12 = 1100
        c =  0 0 0 0  1 0 0 1
             -------  -------
                 |       9
               here 12

         left shift c by 4 that is c<<4
         c now 1 0 0 1 0 0 0 0
                       -------
         c = c | b
         c   -> 1 0 0 1 0 0 0 0
         b   -> 0 0 0 0 1 1 0 0
         c|b -> 1 0 0 1 1 1 0 0
               -------- -------
                  9        12
         */
        byte a = 9;  //1001
        byte b = 12; //1100
        byte c = 0;
        c = (byte)(c|a); //9 = 1001

        c = (byte) (c<<4); //10010000

        c = (byte) (c|b); // 10011100 first half 9 second half 12


        //unpack
        // right shift 10011100 becomes
        //          0 0 0 0 1 0 0 1
        // & 0x0F = 0 0 0 0 1 1 1 1
        //          0 0 0 0 1 0 0 1 = 9
        int first  = (c >> 4) & 0x0F;

        //c =       10011100
        // & 0x0F = 00001111
        int second = c & 0x0F; //12

        System.out.println(first);   // 9
        System.out.println(second);  // 12

    }
}
