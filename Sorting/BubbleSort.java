
public class BubbleSort {

    // Bubble Sort function
    public static void bubbleSort(int nums[]) {
        boolean swapped;

        for (int turn = 0; turn < nums.length - 1; turn++) {
            swapped = false;

            for (int j = 0; j < nums.length - 1 - turn; j++) {

                if (nums[j] > nums[j + 1]) {
                    // Swap adjacent elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (swapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 1, 3, 2};

        // Call Bubble Sort
        bubbleSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


