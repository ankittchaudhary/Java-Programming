package challenges;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfTriangle {
    static void main(String[] args) {
        //sides of triangle are a b and c
        float a, b, c;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter sides of triangle: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();

        //Semiperimeter
        float semiperimeter = (float) ((a + b + c)/2f);
        //area = (s(s-a)(s-b)(s-c))^1/2

        double area = (Math.pow(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c),0.5));
        System.out.println("Area of Triangle with sides " + a + "cm " + b + "cm and " + c +"cm " + " is " + area+" cm2");
    }
}
