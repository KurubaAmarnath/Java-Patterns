import java.util.Scanner;
public class P11EvenNumberSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for ( int i = 1; i <=size; i++){
            for ( int j = 1; j<=i; j++ ){
                
                System.out.print(2*j);
            }
            System.out.println();
        }
        sc.close();
    }
}