/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledialogboxtest;

import javax.swing.JOptionPane;

/**
 *
 * @author ravi
 */
public class Simpledialogboxtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String itemName;
        int quantity;
        double priceofone;
        
        itemName = JOptionPane.showInputDialog("Name of purchase item : ");
        
        priceofone = Double.parseDouble(JOptionPane.showInputDialog("Price"
                + " "
                + "of one item : "));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity :"
                + " "));
        
        JOptionPane.showMessageDialog(null,"Purchase Order : \n\n" 
                + "Item : " + itemName + "\nQuantity : " + quantity 
        + "\nPrice of one item : " + priceofone + "\nTotal Price : Rs " 
        + (quantity*priceofone));
    }
    
}
