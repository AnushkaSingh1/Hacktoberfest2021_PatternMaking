
public class Ten{

    public static void main(String args[]){

      System.out.println( );

      //Pattern No.5
           int rows = 5, k = 0;
            for (int r = 1; r <= rows; ++r, k = 0) {
                  for (int space = 1; space <= rows - r; ++space) {
                    System.out.print("  ");
                  }
                      while (k != 2 * r - 1) {
                        System.out.print("* ");
                              ++k;
                      }
                            System.out.println();
            }
      System.out.println();
      }
}





