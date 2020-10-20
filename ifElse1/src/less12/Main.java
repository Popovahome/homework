package less12;
import java.util.Scanner;
public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 6;
        int x2 = 6;
        int y2 = 3;
        int x12 = 3;
        int y12 = 5;
        int x22 = 9;
        int y22 = 2;
        System.out.println("ВВедите x1 ");
        int z1 = tt.nextInt();
        System.out.println("ВВедите y1 ");
        int z2 = tt.nextInt();
        boolean p = (z1 > x1 & z1< x2 & z2 >y2 & z2 < y1) & (z1 < x12 & z1 > x22 & z2 >y22 & z2 < y12);
        if (p) {System.out.println("Точка входит в эти два прямоугольника");}
        else {System.out.println("Точка не входит в эти два прямоугольника");}
        }
    }


