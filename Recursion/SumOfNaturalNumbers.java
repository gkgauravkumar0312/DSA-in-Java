public class SumOfNNaturalNumbers {

    // Calculate sum of first n natural numbers using recursion
    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }

        int sum = n + sumOfN(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
}
