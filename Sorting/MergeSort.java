public class MergeSort {

    // Merge Sort Algorithm
    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid); // Left Part
        mergeSort(arr, mid + 1, end); // Right Part

        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];

        int i = start; // Iterator for left Part
        int j = mid + 1; // Iterator for right Part
        int k = 0; // Iterator for temp array

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right Part
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
