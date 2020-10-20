package loop_tr;

public class Main {
    public static void main(String[] args) {
        //мой первый ребенок от 10 до 1
        System.out.println("мой первый ребенок от 10 до 1");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //второй ребенок Миши
        // от 1 до 10
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("второй ребенок учителя");
        //второй ребенок учителя
        //куб
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("третий ребенок учителя");
        //третий ребенок учителя
        for (int i = 10; i > 0; i--) {

            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("четвертый ребенок учителя");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
