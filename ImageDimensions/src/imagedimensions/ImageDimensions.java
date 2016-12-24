/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagedimensions;
import java.util.Scanner;
import javax.swing.ImageIcon;
/**
 *
 * @author ravi
 */
public class ImageDimensions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        ImageIcon image;
        // TODO code application logic here
        System.out.print("Enter image file name"
                + " (or full address when "
                + "in other folder) : ");
        image = new ImageIcon(stdIn.next());
        System.out.println("Image width = " + image.getIconWidth());
        System.out.println("Image height = " + image.getIconHeight());
    }
    
}
