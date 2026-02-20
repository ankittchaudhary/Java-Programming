public class Main {
    static void main(String[] args) {
        /*
        AND	 	 	 	 	 	        &
        OR	 	 	 	 	 	        |
        NOT 	 	 	 	 	        ~
        XOR 	 	 	 	 	 	    ^
        Right Shift 	 	 	 	 	>>
        Unsigned Right Shift 	 	 	>>>
        Left Shift 	 	 	 	 	 	<<
         */

        /*
        AND OPERATOR(&)
        0 & 0 0
        0 & 1 0
        1 & 0 0
        1 & 1 1
         */

        /*
        OR OPERATOR(|)
        0 | 0 0
        0 | 1 1
        1 | 0 1
        1 | 1 1
         */

        /*
        NOT OPERATOR(~)
        0 -> ~ 0 = 1
        1 -> ~ 1 = 0
         */

        /*
        XOR OPERATOR(^)
        0 XOR 0 0
        0 XOR 1 1
        1 XOR 0 1
        1 XOR 1 0
         */

        /*
        LEFT SHIFT OPERATOR (<<)
        int x = 10;
        in binary
        x -> 0 0 0 0 1 0 1 0
        z  = x << 1 (by 1 place)

        0 0 0 0 1 0 1 0
       / / / / / / / /
      0 0 0 0 1 0 1 0 _
                      |
                      vacant so filled by 0

        value of z becomes -> 0 0 0   1     0     1    0    0
        means                        2^4   2^3   2^2  2^1  2^0
                                     16  +  0  +  4  + 0  + 0
                                     = 20
         */
        //If left shift by 1 means no. is multiplied by 2
        // if left shift by 2 places means multiplied by 4
        /*
        if num = n
        left shift by k position
        num becomes n * 2^k
         */

        int m = 10;
        int z = m << 1;
        System.out.println(z);

        /*
        RIGHT SHIFT OPERATOR (>>)
        int x = 10;
        in binary
        x -> 0 0 0 0 1 0 1 0
        z  = x >> 1 (right shift by 1 place)

        0 0 0 0 1 0 1 0
         \ \ \ \ \ \ \ \
        _ 0 0 0 0 1 0 1
        |
 vacant so filled by 0

        value of z becomes ->  0  0   0     0     1    0    1
        means                        2^4   2^3   2^2  2^1  2^0
                                     16  +  0  +  4  + 0  + 1
                                     = 5
         */
        //If right shift by 1 means no. is divided by 2
        // if right shift by 2 places means divided by 4
        /*
        if num = n
        right shift by k position
        num becomes n / 2^k
         */
        int p = 10;
        int q = p >> 1;
        System.out.println(q);


        /*
        for negative numbers
        Negative numbers are represented in 2's compliment form
        int a = -10;
        10 in binary is 0 0 0 0 1 0 1 0
        1's compliment:
        0 0 0 0 1 0 1 0 becomes
        1 1 1 1 0 1 0 1

        2's compliment -> add 1 in 1's compliment
        1 1 1 1 0 1 0 1
                    + 1
        1 1 1 1 0 1 1 0

        so -10 is  1 1 1 1 0 1 1 0

        a -> 1 1 1 1 0 1 1 0
        now
        a >> 1 //a right shift by 1        >> keeps the sign bit MSB = 1 for negative num


        1 1 1 1 0 1 1 0
         \ \ \ \ \ \ \ \
        _ 1 1 1 1 0 1 1
        |
        will be filled by 1 as MSB

        so  right shift of -10
        becomes
        1 1 1 1 1 0 1 1

        sign bit is untouched if num is negative
        if treating num as unsigned then have to include the sign bit
         0 1 1 1 1 0 1 1        //becomes + ve 123

         */

    }
}