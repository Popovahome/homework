package loop_del;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ВВедите произвольные числа ");
        int a = tt.nextInt();
        int b = 1;
        int c = 0;
        while (b <= a){
            int d = a%b;
            if (d == 0){
                c +=1;
            }
            b +=1;
        }
        System.out.println("Чисто имеет " + c + " делителей");
    }
}
