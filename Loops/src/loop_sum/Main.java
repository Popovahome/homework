package loop_sum;
import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {

        int s = 0,a;
        for (int i = 0; i < 5; i ++){
            System.out.println("ВВедите " + (i +1) + " число");
            a = tt.nextInt();
            s += a;
        }
        System.out.println("уммв 5-ти чисел равняетс " + s);
        double n = s/5;
        System.out.println("реднее 5 чисел" + n);
    }
}
