/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facto1;

import java.util.Scanner;
/**
 *
 * @author ravi
 */
public class Facto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        // TODO code application logic here
        double facto;
        int i,n;
        char ch;
        ch = 'y';
        while(ch == 'y' || ch == 'Y'){
        facto=1.0;
        System.out.print("Enter the number for factorial value : ");
        n = stdIn.nextInt();
        for(i=1;i<=n;i++){
            facto*=i;
        }
        System.out.println("The factorial value of " + n + " is : " + facto);
        System.out.print("\n" + "Do you want to continue (y/n) : ");
        ch = stdIn.next().charAt(0);
        }
    }
    
}
