import java.util.Scanner;
public class P09DecreasingRowSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for ( int i = 1; i <=size; i++){
            for ( int j = 1; j<=size-i+1; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}