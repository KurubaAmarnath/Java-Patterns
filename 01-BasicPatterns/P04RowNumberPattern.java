import java.util.Scanner;
public class P04RowNumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  size : ");
        int size = sc.nextInt();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}