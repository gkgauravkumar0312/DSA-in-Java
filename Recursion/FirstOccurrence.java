public class FirstOccurrence {

    public static int firstOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5};
        int key = 5;

        int index = firstOccurrence(arr, key, 0);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First occurrence of " + key + " is at index: " + index);
        }
    }
}
