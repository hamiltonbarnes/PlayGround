/*
 A basic calculator.
 */
package basic.calculator;

/**
 *23/09/2014.
 * @author benedict
 */
import java.util.*;
public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
                double num1; 
                double num2; 
                double num3;
                double answer;
        System.out.println("Enter your first number : ");
        
        num1 = cal.nextDouble();
        
         System.out.println("Enter your secondnumber : ");
        
        num2 = cal.nextDouble();
        
         System.out.println("Enter your third number : ");
        
        num3 = cal.nextDouble();
       
        answer = num1 + num2 * num3 ;
        
        System.out.println("The resulting value is " +answer);
        
    }
    
}
