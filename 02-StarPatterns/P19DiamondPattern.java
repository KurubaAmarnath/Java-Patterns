import java.util.Scanner;
public class P19DiamondPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for(int i = 1; i <= size; i++){
            for(int j = 1; j<=size -i;j++){
                System.out.print(" ");
            }
            for ( int k = 1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i = 1; i <= size-1; i++){
            for ( int j = 1; j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*(size-i)-1;k++){
                System.out.print("*");
            }
                 System.out.println();
        }
        sc.close();
   
    }
}
/*

Enter size : 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/