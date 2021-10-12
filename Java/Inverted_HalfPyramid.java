import java.util.*;

public class Inverted_HalfPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer Loop
        for(int i=n; i>=1; i--){
            // Inner Loop
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
