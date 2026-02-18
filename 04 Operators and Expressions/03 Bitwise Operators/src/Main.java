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
        _ 0 0 0 0 1 0 1 _
        |               | -> no place here
 vacant so filled by 0

        value of z becomes ->  0  0   0     0     1    0    1
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

    }
}