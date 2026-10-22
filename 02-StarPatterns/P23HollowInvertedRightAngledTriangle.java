import java.util.Scanner;
public class P23HollowInvertedRightAngledTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for ( int i = 1 ; i<=size;i++){
            for ( int j = 1; j<=size-i+1;j++){
                if( i == 1 || j == 1 || j == size-i+1){
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