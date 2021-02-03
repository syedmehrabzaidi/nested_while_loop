/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_while;

import java.util.Scanner;

/**
 *
 * @author amanlab02
 */
public class Nested_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   	Scanner scan =new Scanner(System.in);
		int a =1;
		int b =1;
		while (a<4) {
			System.out.println("Enter any Number");
			int input = scan.nextInt();
			
                        while (b<=10) {
				int z= input*b;
				System.out.println(+input+"x"+b+"="+z);
				
				b++;
			}b=0;
                        
	a++;	
                }
    
                
                
            
    }
    
}


