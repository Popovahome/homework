package array_max;



public class Main {

    public static void main(String[] args) {
        int n = 15;
        int[] arr1;
        arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = (int) Math.floor(Math.random() * 32) + 154;

        }
        int max = 186;
        int min = 154;
        int nMax = 0;
        int nMin = 0;
        int sum = 0;
        float middle;
        for (int i = 0; i < n; i++ ){
            if(arr1[i] <= min){
                nMin = i;
            }
            if(arr1[i] >= max){
                nMax = i;
            }
            sum += arr1[i];
        }
        middle = sum /15;
        System.out.println("Самый низкий " + min + " списке под номером " + nMin);
        System.out.println("Самый высокий " + max + " списке под номером " + nMax);
        System.out.println("Средний рост - " + middle + " см");


    }
}
