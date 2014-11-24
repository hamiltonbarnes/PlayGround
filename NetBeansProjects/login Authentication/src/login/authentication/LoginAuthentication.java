/*********************************************************************/
/*                  Name : Samuel Benedict Barnes                    */
/*                  Index Number: PS/ITC/12/0050                     */
/*                                                                   */
/*********************************************************************/
 
package login.authentication;

/**
 *  
 * @author Benedict
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  
public class LoginAuthentication {
   
//Creating a constructor        
     
    public LoginAuthentication(){
    
    
    
// Setting up a frame    
    JFrame l = new JFrame();
    

    
    // Inputing a label with name username unto the frame
 final   JLabel username =new JLabel("UserName:");  
    username.setBounds (20,20,80,20);
    l.add(username);
   // Inputing a textfeild for the user to input his/her username     
    JTextField txtuname = new JTextField(20);
    txtuname.setBounds(100,20,150,25);
    l.add(txtuname);  
    
    // Setting up alabel for password
    JLabel password = new JLabel ("PassWord:");
    password.setBounds(20, 70, 80, 25);
    l.add(password);
   // Setting up a textfeild for the user to input his/her password. 
    JPasswordField passfield = new JPasswordField(15);
    passfield.setBounds(110,70,150,25);
    //SetEchoChar is used to change the character representing the password field such as replacing * with #, etc.
    passfield.setEchoChar('&');
    l.add(passfield);
    // creating a log  out button
    JButton logout = new JButton("Log out");
    logout.setBounds(210,120,100,25); 
    //creating an event for the button log out 
    logout.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
     
      txtuname.setText("");
      passfield.setText("");
}
        });
        l.add(logout);
     
    
    l.add(logout);

    // creating a log in button
    JButton ok = new JButton("LogIn");
    ok.setBounds(100,120,100,25); 
    //Setting events for the log in button
        
    l.add(ok);
    //Creating an event for the log in button
ok.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

    String username=txtuname.getText();
   String password=passfield.getText();
      if (username.equals("@Benedict") && password.equals("12345")) {
   JFrame page=new JFrame();
   page.setVisible(true);
   page.setSize(300,200);
   JLabel label = new JLabel("Welcometo your page:"+ username);
   page.getContentPane().add(label);
   }
   else{
   System.out.println("enter the valid username and password");
   JOptionPane.showMessageDialog(null,"Incorrect username or password",
   "Error",JOptionPane.ERROR_MESSAGE);
  
      }

}
    });
    
     l.setLayout(null);
     l.setSize(400,300);
     l.setTitle("Log In");
     l.setVisible(true);
     l.setDefaultCloseOperation(l.EXIT_ON_CLOSE);
        // Setting the frame layout to null using the swing class
     l.setLocationRelativeTo(null);
     l.setResizable(false);

     
    
    
    
    
    
    
    
    
    
    }
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   
      
        //creating an object of the class LoginAuthentication
        LoginAuthentication login = new LoginAuthentication();  
    
    
    }
    
        }
        
     
   
