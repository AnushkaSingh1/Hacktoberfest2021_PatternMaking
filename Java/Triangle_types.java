
public class Triangle_types{

      public static void main(String args[]){
  
        System.out.println( );
  
        //Pattern No.1
              for(int i=1; i<=5; i++){      
                    for(int j=1; j<=i; j++){      
                          System.out.print(i);
                    } 
                 System.out.println( );       
              }      
        System.out.println();
  
        //Pattern No.2
              for(int a=1; a<=5; a++) {     
               
                    for(int b=1; b<=a; b++) {     
                          System.out.print(b);
                    } 
                 System.out.println( );       
              }
        System.out.println();
        
        //Pattern No.3
              for(int x=1; x<=5; x++) {     
               
                    for(int y=1; y<=x; y++) {     
                          System.out.print("*");
                    } 
                 System.out.println();        
              }      
        System.out.println();     
  
        //Pattern No.4
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
  