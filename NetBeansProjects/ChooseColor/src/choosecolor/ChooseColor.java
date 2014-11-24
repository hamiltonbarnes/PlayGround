/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choosecolor;

/**
 *
 * @author benedict
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChooseColor {
    //dECLARING MY PANEL OUTSIDE THE CONSTRUCTOR TO MK IT A GLOBAL VARIABLE
//JPanel pan;

//creating a constructor
    public ChooseColor(){
JFrame evt = new JFrame();

//Adding a panel to my frame.
 final JPanel pan = new JPanel();
/*//placing a blue button in my panel
JButton blue = new JButton("Blue");
//registering a listener with the source
blue.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
   pan.setBackground(Color.blue);
}

});
pan.add(blue);
//place a red butt0n in my panel
JButton red = new JButton("Red");
//registering a listner with the source
red.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

pan.setBackground(Color.red);
}
        
});
pan.add(red);
*/
 JButton red = new JButton("Choose a color");
//registering a listner with the source
red.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

Color color = new JColorChooser;
           
        }
});
 evt.add(pan);





//evt.setLayout(null);
evt.setSize(600,350);
evt.setTitle("Events Handling");
evt.setVisible(true);
evt.setLocationRelativeTo(null);
evt.setDefaultCloseOperation(evt.EXIT_ON_CLOSE);
evt.setResizable(true); 





    /**
     * @param args the command line arguments
     */
    

      public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
