/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.loop;

/**
 *
 * @author Karan
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,result,sum=0;
        for(i=2;i<=5;i++){
            for(j=1;j<=5;j+=2)
            {
            result=(i*j); 
           sum +=result;
            }
            System.out.println(sum);
            System.out.println("=====");
          
            }
        // TODO code application logic here
    }
      
}
