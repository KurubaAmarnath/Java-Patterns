import java.util.Scanner;

public class P25HollowInvertedPyramid {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size : ");
    int size = sc.nextInt();
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * (size - i) + 1; k++) {
            if (i == 1 || k == 1 || k == 2 * (size - i) + 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    sc.close();
}
}