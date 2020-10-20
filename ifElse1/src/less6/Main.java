package less6;

 import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ВВедите два числа");
        int a = tt.nextInt();
        int b = tt.nextInt();
        int x1 = a*a;
        int x2 = a;
        int y1 = b*b;
        int y2 = b;
        int c1 = 4;
        int c2 = 0;
        Boolean z1 = (x1 + y1) <= c1;
        Boolean z2 = (x2>= 0) & (y1 != c2);
        Boolean z3 = (x2*y2 != 0) & (y2 > x2);

        if (z1){ System.out.println("Число ");

        }
    }
}