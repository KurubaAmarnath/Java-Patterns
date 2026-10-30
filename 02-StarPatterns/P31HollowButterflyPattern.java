import java.util.Scanner;
public class P31HollowButterflyPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=i || j>2*n-i){
                    if(j==1 || j==i || j==2*n-i+1 || j==2*n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*n;j++){
                if(j<=i || j>2*n-i){
                    if(j==1 || j==i || j==2*n-i+1 || j==2*n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
