public class Main {
    static void main(String[] args) {
        System.out.println("Increment and Decrement Operator");

        int x = 5;

        x++; //6
        System.out.println(x);
        ++x; //first x is 6 now it will become 7 and then assigned to x   PREINCREMENT
        System.out.println(x);  //7


        //Difference
        int p = 5, q;
        //q = ++p; //it will be 6 as its Pre increment value is increased first then assigned
        q = p++; // it will be 5 as q = p =5 and value of never incremented //in loop it can be

        System.out.println(q); //5
        //amd p becomes 6
        System.out.println(p);

        for (int i = 0; i<7; i++){
            i++;
            p++;
        }
        System.out.println(p);  //p will become 5 as loop runs 6 times initial p = 5
        /*
        first iteration p =5
        second iteration p = 6
        third -> 7
        fourth -> 8
        fifth -> 9
        sixth -> 10
        end
        p remains ->10
         */

        char c = 'A';
        c++; //B
    }
}