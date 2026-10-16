public class PrintIncreasing {

    // Print numbers from 1 to n in increasing order
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }
}
