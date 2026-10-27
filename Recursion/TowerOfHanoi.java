
public class TowerOfHanoi {

    public static void towerOfHanoi(int n, int A, int C, int B) {

        // Base case
        if (n == 0) {
            return;
        }

        // Move n-1 disks from A to B using C
        towerOfHanoi(n - 1, A, B, C);

        // Move the nth disk from A to C
        System.out.println("Moving " + n + "th disk from " + A + " to " + C);

        // Move n-1 disks from B to C using A
        towerOfHanoi(n - 1, B, C, A);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 10, 30, 20);
    }
}
