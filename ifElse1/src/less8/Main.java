package less8;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ВВедите число");//без сохранений переменной
        int a = tt.nextInt();
        System.out.println( a % 2 == 0 ? "четное" : "нечетное");


        System.out.println("ВВедите число");//с сохранением переменной
        int b = tt.nextInt();
        String s = b % 2 == 0 ? "четное" : "нечетное";
        System.out.println();
    }
}
