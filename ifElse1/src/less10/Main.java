package less10;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ВВедите произвольную цифру");
        int a = tt.nextInt();
        String w;
        switch (a)
        {
            case 1: w = "понедельник";
                break;

            case 2: w = "вторник";
                break;

            case 3: w = "среда";
                break;

            case 4: w = "четверк";
                break;

            case 5: w = "пятница";
                break;

            case 6: w = "суббота";
                break;

            case 7: w = "воскресенье";
                break;

            default: w = "такого дня недели не существует";
        }
        System.out.println(w);

    }
}
