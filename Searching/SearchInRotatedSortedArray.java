public class SearchInRotatedSortedArray {

    public static int search(int[] arr, int target,
            int low, int high) {

        // Base case
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[low] <= arr[mid]) {

            if (target >= arr[low] && target < arr[mid]) {
                return search(arr, target, low, mid - 1);
            } else {
                return search(arr, target, mid + 1, high);
            }

        } else {
            // Right half is sorted
            if (target > arr[mid] && target <= arr[high]) {
                return search(arr, target, mid + 1, high);
            } else {
                return search(arr, target, low, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 70, 10, 20, 30};
        int target = 20;

        int result = search(arr, target, 0, arr.length - 1);

        System.out.println(result);
    }
}
