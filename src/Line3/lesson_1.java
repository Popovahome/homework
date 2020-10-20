package Line3;
import java.util.Scanner;
public class lesson_1 {
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите ваше конечное число: ");
        int a = t.nextInt();
        int a1 = a / 100;
        int a2 = a / 10 % 10;
        int a3 = a % 10;
        System.out.println("То бишь ваше первоначальное число: ");
        System.out.println(a2 * 100 + a1 * 10 + a3);
    }


}

