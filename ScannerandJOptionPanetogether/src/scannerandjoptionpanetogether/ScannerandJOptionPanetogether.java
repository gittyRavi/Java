/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerandjoptionpanetogether;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ravi
 */
public class ScannerandJOptionPanetogether {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        // TODO code application logic here
        String firstName;
        String lastName;
        System.out.println("Enter your name : ");
        
        firstName = stdIn.next();
        lastName = stdIn.next();
        
        System.out.println("Hello Mr./Mrs./Miss " + firstName.charAt(0) + " " 
                + lastName + "." + "\nGive your orders for items. ");
       
        
        String itemName;
        double priceofone;
        int quantity;
        
        itemName = JOptionPane.showInputDialog("Enter the name of item for"
                + " "
                + "purchase : ");
        priceofone = Double.parseDouble(JOptionPane.showInputDialog("Enter "
                + "price of one item :"));
        
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter "
                + "quantity of the item : "));
        
        JOptionPane.showMessageDialog(null,"Purchase order : \n\n" + "Item : " 
        + itemName + "\nQuantity : " + quantity + "\nPrice of one item : " + 
                priceofone + "\nTotal price : " + (priceofone*quantity));
        
    }
    
}
