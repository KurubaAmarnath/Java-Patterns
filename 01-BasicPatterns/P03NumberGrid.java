import java.util.Scanner;
public class P03NumberGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  size : ");
        int size = sc.nextInt();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}