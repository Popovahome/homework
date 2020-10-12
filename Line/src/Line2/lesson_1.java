package Line2;
//* задача перевернутого трехзначного числa
import java.util.Scanner;

public class lesson_1 {
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Введите трехзначнoe числo");
        int a = t.nextInt();
        int a1 = a / 100;
        int a3 = a % 10;
        int a2 = a / 10 % 10;
        System.out.println(a3 * 100 + a2 * 10 + a1);
    }


}
