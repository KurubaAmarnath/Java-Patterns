import java.util.Scanner;

public class P24HollowPyramid {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size : ");
    int size = sc.nextInt();
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size - i; j++) {
          System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == 1 || k == 2 * i - 1 || i == size) {
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