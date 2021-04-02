import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class quick_sort {
    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        sort(arr, 0, arr.size() - 1);
        return arr;
    }

    private static void sort(ArrayList<Integer> arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get((low + high) / 2);
        while (low <= high) {
            while (arr.get(low) < pivot) low++;
            while (arr.get(high) > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(ArrayList<Integer> arr, int i, int j) {
        int tmp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j, tmp);
    }
}
