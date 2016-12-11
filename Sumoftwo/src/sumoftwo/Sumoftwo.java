/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoftwo;

import java.util.Scanner;
/**
 *
 * @author ravi
 */
public class Sumoftwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdIn = new Scanner(System.in);
        double first;
        first=0;
        double second;
        second=0;
        double third;
        third=0;
        
        System.out.println("Enter two numbers to add : ");
        first = stdIn.nextDouble();
        second = stdIn.nextDouble();
        third = first + second;
        
        System.out.println("The sum is : "+third);
    }
    
}
