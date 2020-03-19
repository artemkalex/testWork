package merge_sort;

public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length < 2){
            return;
        }
        int n = array.length;
        int middle = n / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < n; i++) {
            rightArray[i - middle] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);

    }

    private static void merge(int[] array, int[] left, int[] right) {

        int elementLeft = 0;
        int elementRight = 0;
        for (int i = 0; i < array.length; i++){
            if (elementLeft == left.length){
                array[i] = right[elementRight++];
            }else if (elementRight == right.length) {
                array[i] = left[elementLeft++];
            }else if (left[elementLeft]<right[elementRight]){
                array[i] = left[elementLeft++];
            }else {
                array[i] = right[elementRight++];
            }
        }

    }

}
