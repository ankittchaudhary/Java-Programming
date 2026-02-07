public class Main {
    static void main(String[] args) {
        // + - * / % can be applied on any type of data except Booleans

        int a = 5;
        int b = 2;

        System.out.println("a + b = " + a+b);
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));  //as its int so answer will be 2
        System.out.println("a % b = " + (a%b));  //gives remainder //1

        // imposing brackets help evaluating the expression first
        float average = ((float) (a + b) /2);  //7/2 = 3.5 if not (float) then 3.0
        System.out.println(average);

    }
}
