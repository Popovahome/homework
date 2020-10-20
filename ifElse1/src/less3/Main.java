package less3;

import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("ВВедите 3 числа");
        int a = tt.nextInt();
        int b = tt.nextInt();
        int c = tt.nextInt();

        int Ira = b*b - 4 * a * c;
        System.out.println(Ira);
        Boolean Lera = Ira<0;
        if (Lera){
            System.out.println("Нет коней");
        }
        else {
        System.out.println("Кони есть");
        double x1 = (-b - sqrt(Ira))/2*a;
        double x2 = (-b + sqrt(Ira))/2*a;
        System.out.println("x1:" + x1);
        System.out.println("x2:" + x2);}


    }
}