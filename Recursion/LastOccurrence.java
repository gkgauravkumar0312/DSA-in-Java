public class LastOccurrence {

    // Find the last occurrence of an element in an array
    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int lastIndex = lastOccurrence(arr, key, i + 1);

        if (lastIndex != -1) {
            return lastIndex;
        }

        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;

        int result = lastOccurrence(arr, key, 0);

        System.out.println("Last occurrence of " + key
                + " is at index: " + result);
    }
}
