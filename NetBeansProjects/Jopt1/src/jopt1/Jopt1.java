/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jopt1;

/**
 *
 * @author benedict
 */
import javax.swing.JOptionPane;
public class Jopt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
              String firstnumber = JOptionPane.showInputDialog("Enter a number :");
           
        int num1 = Integer.parseInt(firstnumber);
       
        String Secondnumber = JOptionPane.showInputDialog("Enter a second number :");
           int num2= Integer.parseInt(Secondnumber);

int sum = num1+ num2;
JOptionPane.showMessageDialog(null,
        "The sum is" + sum,
        "sum of two numbers",
        JOptionPane.INFORMATION_MESSAGE);
        
// TODO code application logic here
    }
    
}
