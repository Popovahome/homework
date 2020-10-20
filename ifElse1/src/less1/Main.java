package less1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ВВедите два числа");
        int a = tt.nextInt();
        int b = tt.nextInt();

        System.out.println(a>b);
    }
}