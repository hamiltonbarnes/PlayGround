/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author benedict
 */
import javax.swing.*;
import java.awt.*;

public class LogIn {
    //creaating a constructor public LogIn()
    public LogIn() {
        
        //Creating a frame.
        JFrame b = new JFrame();
        //Creating a panel or declaring a new panel cp and bp.
        JPanel cp,bp;
        
        cp = new JPanel();
        //setting the center panel layout by using the GridLayout.
        cp.setLayout(new GridLayout(4,1));
        
        //adding a label named username to the center pane "cp"
        JLabel username = new JLabel ("UserName :");
        cp.add(username);
        //adding a Textfield  named text to the center panel "cp"
        JTextField Text = new JTextField();
        cp.add(Text);
        
        JLabel password = new JLabel ("PassWord :");
        cp.add(password);
        
        JPasswordField passfield = new JPasswordField();
        cp.add(passfield);
        
        b.add(cp,BorderLayout.CENTER);
        
        bp= new JPanel();
        bp.setLayout(new FlowLayout( FlowLayout.RIGHT));
        JButton ok = new JButton("OK");
        bp.add(ok);
        JButton cancel = new JButton("Cancel");
        bp.add(cancel);
        
        b.add(bp,BorderLayout.SOUTH);
        
        b.setSize(400,400);
        b.setTitle("Login");
        b.setLocationRelativeTo(null);
        b.setDefaultCloseOperation(b.EXIT_ON_CLOSE);
        b.setVisible(true);
        b.setResizable(false);
       
        b.getContentPane().setBackground(Color.MAGENTA);//Setting the background color of the layout to magenta...
       

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //creating an object of the class LogIn
        LogIn login = new LogIn();  //creating an object of the class LogIn
       
    
    }
    
}
