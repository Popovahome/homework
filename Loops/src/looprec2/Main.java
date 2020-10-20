package looprec2;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("Вывод чисел методом рекурсия");
            int n = tt.nextInt();
            System.out.println( lera(n));
    }
    public static int lera(int n) {

        if(n<10){
            return n;
        }
        return n % 10 + lera(n/10);
    }
}
