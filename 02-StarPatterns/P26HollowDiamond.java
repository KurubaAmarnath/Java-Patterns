import java.util.Scanner;

public class P26HollowDiamond {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size : ");
    int size = sc.nextInt();

    // Upper half
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= size - i; j++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == 1 || k == 2 * i - 1) {
         System.out.print("*");
            } else {
     System.out.print(" ");
            }
        }
 System.out.println();
    }
    // Lower half
    for (int i = 1; i <= size - 1; i++) {
        for (int j = 1; j <= i; j++) {
           System.out.print(" ");
        }
        for (int k = 1; k <= 2 * (size - i) - 1; k++) {
            if (k == 1 || k == 2 * (size - i) - 1) {
        System.out.print("*");
            } else {
     System.out.print(" ");
            }
        }   System.out.println();
    }
    sc.close();
}
}
