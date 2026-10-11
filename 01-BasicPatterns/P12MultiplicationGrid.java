import java.util.Scanner;
public class P12MultiplicationGrid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for ( int i = 1; i<=size; i++){
            for ( int j = 1; j<=size; j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
        sc.close();
        
    }
}