package merge_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {12,1,3,4,5,5,71,9,2};
        System.out.println("   До сортировки: " + Arrays.toString(a));

        MergeSort.mergeSort(a);

        System.out.println("После сортировки: " + Arrays.toString(a));

    }
}
