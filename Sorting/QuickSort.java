
public class QuickSort {

    // Quick Sort function
    public static void quickSort(int arr[], int start, int end) {

        // Base condition
        if (start >= end) {
            return;
        }

        // Find the correct position of pivot
        int pivotIndex = partition(arr, start, end);

        quickSort(arr, start, pivotIndex - 1); // Left Part
        quickSort(arr, pivotIndex + 1, end);   // Right Part
    }

    // Partition function
    public static int partition(int arr[], int start, int end) {

        int pivot = arr[end]; // Last element as pivot
        int i = start - 1;

        // Place smaller elements before pivot
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Place pivot at its correct position
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        return i; // Return pivot index
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 6, 3, 9, 1};

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
