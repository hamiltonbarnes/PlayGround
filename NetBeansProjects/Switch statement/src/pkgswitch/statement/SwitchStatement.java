/*
 Switch Statements
 */
package pkgswitch.statement;

/**
 *24/09/2014
 * @author benedict
 */
import java.util.*;
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int score;
        String grade;
                
        System.out.println("Enter your score :");
        Scanner Grade = new Scanner(System.in);
        score = Grade.nextInt();
     
        switch(score/100){
            case 1:      
                System.out.println("You got an A+");
            break;
            case 2:      
                System.out.println("You got an A+");
            break;
            case 3:      
                System.out.println("You got an A+");
            break;
            case 4:      
                System.out.println("You got an A+");
            break;
            case 5:      
                System.out.println("You got an A+");
            break;
            default:
                System.out.println("Study hard");
        }
    }
    
}
