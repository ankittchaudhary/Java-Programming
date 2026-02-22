package Programs;

public class Swapping {
    static void main(String[] args) {
        System.out.println("Swapping");
        int a = 9;
        int b = 12;
        System.out.println("Value before swapping: "+ "a is "+a+" and b is "+ b);
        a = a^b;  //5
        b = a^b;  //9
        a = a^b;  //12

        System.out.println("Value after swapping: "+ "a is "+a+" and b is "+ b);
    }
}
