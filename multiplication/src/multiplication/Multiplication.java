/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication;

/**
 *
 * @author nickhnl
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j,p, sum=0;
        for (i = 2;i <= 2; i++) {
            for (j = 1; j <= 10; j++) {
            /** 
             * System.out.println(i + "*" + j + "=" + (i * j));
             */
             if(j%2!=0)
             {
                 p= i*j;
             
              sum +=p;
            }
  
                
            
           
        }
            System.out.println(sum);

    }

    // ODO code application logic here
}
