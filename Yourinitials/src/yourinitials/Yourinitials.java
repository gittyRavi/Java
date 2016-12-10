/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourinitials;
import java.util.Scanner;
/**
 *
 * @author ravi
 */
public class Yourinitials {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // TODO code application logic here
        String firstName;
        String lastName;
        System.out.println("Enter yor name : ");
        firstName = stdIn.nextLine();
        lastName = stdIn.nextLine();
        System.out.println("Your initials are : "+firstName.charAt(0)+"."
                +lastName.charAt(0)+".");
        
    }
    
}
