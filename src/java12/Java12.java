/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java12;

/**
 *
 * @author lenovo
 */
public class Java12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k=0, n, dem, j=0;
       while (j<10)
       {
           k++;
           dem=0;
           for (n=2;n<=k;n++)
           {
               if(k%n==0)
               {dem++;
               }
               
           }
           if (dem==1)
           {
               System.out.print(k+ " ");
               j++;
           }
           
       }
        // TODO code application logic here
    }
    
}
