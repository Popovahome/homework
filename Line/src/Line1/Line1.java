package Line1;

import java.util.Scanner;

public class Line1 {
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите двухзначнoe числo");
        int a = t.nextInt();
        int a1 = a / 10;
        int a2 = a % 10;
        System.out.println(a1 + a2);
        System.out.println(a1 * a2);
    }
}
