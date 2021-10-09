//Using a Using a loop statement (for) get the following outputs

public class Ten{

    public static void main(String args[]){

            for (int l=5; l>=0 ; l--)  {
                  for (int m=0; m<=l; m++)  {
                        System.out.print("*");
                  }
               System.out.println();
            }
      System.out.println();

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






  
