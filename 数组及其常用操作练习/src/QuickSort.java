import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        int low = lowIndex;
        int high = highIndex;
        int mid;
        if(highIndex > lowIndex) {
            mid = arr[(lowIndex + highIndex)/2]; //确定中间分界点元素值
            while(low <= high) {
                while ((low < highIndex) && (arr[low] < mid)) {
                    ++low;
                }
                while ((high > lowIndex) && (arr[high] > mid)) {
                    --high;
                }
                if(low <= high) {
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    ++low;
                    --high;
                }
            }
            if(lowIndex < low) {
                quickSort(arr, lowIndex, high);
            }
            if(low < highIndex) {
                quickSort(arr, low, highIndex);
            }
        }
    }
}
