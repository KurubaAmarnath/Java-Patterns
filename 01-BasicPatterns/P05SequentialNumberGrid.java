import java.util.Scanner;
public class P05SequentialNumberGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for ( int i = 1; i<=size;i++){
            for ( int j = 1; j<=size;j++){
                System.out.printf("%02d ",number);
                number++;
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
