import java.util.Scanner;
public class P15RightAlignedStarTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for ( int i = 1; i <=size; i++){
            for ( int j = 1; j<=size-i; j++ ){
                System.out.print(" ");
            }
                for ( int k = 1; k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
        sc.close();
    }
}
/* Output : 
Enter size : 5
    *
   **
  ***
 ****
***** 

*/

