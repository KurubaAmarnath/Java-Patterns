import java.util.Scanner;
public class P22HollowRightAngledTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for ( int i = 1 ; i<=size;i++){
            for ( int j = 1; j<=i;j++){
                if( j == 1 || j == i || i == size){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}