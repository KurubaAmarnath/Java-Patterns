import java.util.Scanner;
public class P21HollowRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size  : ");
        int rowSize = sc.nextInt();
        System.out.print("Enter column size  : ");
        int columnSize = sc.nextInt();
        for ( int i = 1; i<=rowSize; i++){
            for ( int j = 1; j<=columnSize; j++){
                if ( i == 1 || i == rowSize || j == 1 || j == columnSize){
                System.out.printf("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}