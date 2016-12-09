/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconstructor1;

/**
 *
 * @author ravi
 */
public class Javaconstructor1 {

    /**
     * @param args the command line arguments
     */
    public Javaconstructor1() { /* constructor */
        System.out.println("This is provided by constructor.");
    }
    
    public void method(){   /* method or function */
        System.out.println("This text comes from method or function.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("When no input is provided.");
        Javaconstructor1 obj = new Javaconstructor1();
        obj.method();
    }
    
}
