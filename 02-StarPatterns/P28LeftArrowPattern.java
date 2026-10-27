import java.util.Scanner;

public class P28LeftArrowPattern {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size : ");
    int size = sc.nextInt();
    // Upper half
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // Lower half
    for (int i = 1; i <= size - 1; i++) {
        for (int j = 1; j <= size - i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
}
}