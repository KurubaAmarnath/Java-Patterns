import java.util.Scanner;

public class P32HollowHourglass {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size: ");
    int size = sc.nextInt();

    // Upper Half
    for (int i = 1; i <= size; i++) {

        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * (size - i) + 1; j++) {
            if (i == 1 || j == 1 || j == 2 * (size - i) + 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    // Lower Half
    for (int i = size - 1; i >= 1; i--) {

        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * (size - i) + 1; j++) {

            if (i == 1 || j == 1 || j == 2 * (size - i) + 1) {
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