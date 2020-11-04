package arrays_1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr1;
        double arr2[] ;
        String [] arr3;
        int arr4 [] = {45,76,36,98};
        int n = 3;
        String a3;
        int a1;
        double a2;

        arr1 = new int[n];
        arr2 = new double[n];
        arr3 = new String[n];
        //ввод с клавиатуры
        for(int i = 0; i < n; i++){
            System.out.println("ведите имя " + (i + 1) + "ученика");
            a3 = tt.nextLine();
            arr3[i] = a3;

        }
        //вод по формуле
        for(int i = 0; i < n; i++){
            arr2[i] = 3.14 * i;

        }
        for (int i = 0; i<n; i ++){
            arr1[i] = (int) Math.floor(Math.random() * 10);
        }
        for (int i = 0; i<n; i ++){
           System.out.println(arr1[i]);
        }
        for (int i = 0; i<n; i ++){
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0; i<n; i ++){
            System.out.print(arr3[i] + " ");
        }
        for (int i = 0; i<n; i ++){
            System.out.println(arr4[i]);
        }
    }
}
