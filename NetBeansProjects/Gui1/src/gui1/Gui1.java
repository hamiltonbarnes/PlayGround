/*M Y FIRST GRAPHICAL USER INTERFACE
 */
package gui1;
import javax.swing.*;
import java.awt.*;
public class Gui1 extends JFrame{
/**
 *
 * @author benedict
 */
public  Gui1() {
    
    JLabel label = new JLabel("Label");
    add(label);
    
    
    JTextField tf = new JTextField(25);
    add(tf);
    
    setLayout(new FlowLayout());
    
    JButton button = new JButton("Button");
    add(button);
    
    JCheckBox cb = new JCheckBox("Checkbox");
    add(cb);
    
   setSize(600,400);     
   setTitle("My first GUI");
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setLocationRelativeTo(null);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gui1 fg = new Gui1(); // TODO code application logic here
    fg.setVisible(true);
    
    }
    
}
