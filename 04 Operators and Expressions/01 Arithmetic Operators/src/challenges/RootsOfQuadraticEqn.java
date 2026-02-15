package challenges;

import java.util.Scanner;

public class RootsOfQuadraticEqn {
    /*
    Roots Of Quadratic Equation
    ax^2 + bx + c = 0
    root1 = [-b+(b^2-4ac)^1/2]2*a
    root1 = [-b-(b^2-4ac)^1/2]2*a

    if (b^2-4ac)^1/2  i.e., d > 0 we get +ve roots   //d = discriminant
    if d=0 we get equal
    if d<0 we get imaginary roots

    1. input a, b and c
    2. calculate roots double r1, r2
     */
    static void calculateRoots(int a, int b, int c){
        double r1, r2;
        //calculate d
        double d = (b*b - 4*a*c);

        if ( d < 0){
            System.out.println("Imaginary Roots");
        } else if (d == 0) {
            r1 = (double) (-b) / (2 * a);
            System.out.println("Roots are: "+ r1 + ","+r1);
        } else {
            r1 = (-b + Math.sqrt(d))/(2*a);
            r2 = (-b -  Math.sqrt(d))/(2*a);
            System.out.println("Roots are: "+ r1 + ","+r2);
        }
    }

    public static void main(String[] args) {
        int a, b, c;


        Scanner s = new Scanner(System.in);
        System.out.print("Enter coefficient of x^2: ");
        a = s.nextInt();
        System.out.print("Enter coefficient of x: ");
        b = s.nextInt();
        System.out.print("Enter value of c: ");
        c = s.nextInt();

        calculateRoots(a, b, c);
    }

}
