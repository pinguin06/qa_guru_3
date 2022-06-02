package qaguru;

public class Main {

    public static void main(String[] args) {

        String str = "Learning Java Bas";
        System.out.println(str);

        byte a = 100;
        short b = -20000;
        int c  = 6400000 / a;
        long d = c * 100000L;
        double e = 101.1d;
        float f = 25.3f;
        char ch = 'O';
        boolean b1 = true;
        boolean b2 = a < b;


        System.out.println("Example 1: " + ((c / b) + a - d));
        System.out.println("Example 2: " + ((e % 4) - (1 / f)+a * 0.3));
        System.out.println("Example 3: " + (ch * 2 - f));
        System.out.println("Example 4: " + b2);

        System.out.print("Example 5:");
        if (a == (b/(-200)) && b2 == false) {
            System.out.println("OK");
        } else {
            System.out.println("no OK");
        }

        System.out.print("Example 6:");
        if (ch != 'A' || b2 == true) {
            System.out.println("OK");
        } else {
            System.out.println("no OK");
        }

        System.out.print("Example 7:");
        if (f < d || c >= a) {
            System.out.println("OK");
        } else {
            System.out.println("no OK");
        }

        byte pMax = Byte.MAX_VALUE;
        byte pMin = Byte.MIN_VALUE;

        System.out.println("Example 8: Max overflow = " + pMax * 2);
        System.out.println("Example 9: Min overflow = " + pMin * 2);

    }
}
