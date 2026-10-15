import java.util.Scanner;
public class P16InvertedRightAlignedStarTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for ( int i = 1; i <=size; i++){
            for ( int j = 1; j<i; j++ ){
                System.out.print(" ");
            }
                for ( int k = 1; k<=size - i+1;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
        sc.close();
    }
}
/*
 amar > java 02-StarPatterns/P16InvertedRightAlignedStarTriangle.java
Enter size : 5
*****
 ****
  ***
   **
    *

*/