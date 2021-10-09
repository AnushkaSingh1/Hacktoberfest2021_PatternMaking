//  complex matrix pattern program
//  ex: Enter size of square matrix: 6
//      OUTPUT:
/*          * # # # # * 
            $ * # # * $ 
            $ $ * * $ $ 
            $ $ * * $ $ 
            $ * # # * $ 
            * # # # # *           */

import java.util.*;
class cmplxmatrixpattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of square matrix:");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int i,j;
        System.out.println("OUTPUT:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j||i+j==n-1)
                System.out.print("*"+" ");
                else if(i>=0&&i<j&&j!=n-1&&i+j<n)
                System.out.print("#"+" ");
                else if(i<n&&j<i&&j!=0&&i+j>=n)
                System.out.print("#"+" ");
                else if((j>=0)&&i>j)
                System.out.print("$"+" ");
                else
                System.out.print("$"+" ");
            }
            System.out.println();
        }
    }
