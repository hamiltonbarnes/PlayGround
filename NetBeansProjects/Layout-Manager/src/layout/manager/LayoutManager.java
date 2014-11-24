/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.manager;

/**
 *
 * @author benedict
 */
import javax.swing.*;
import java.awt.*;
public class LayoutManager {
     public LayoutManager(){
        //Creating a jframe method and Calling methods and also putting in arguements.
       
        JFrame f = new JFrame();
        ImageIcon img =  new ImageIcon("life.jpg");
        f.setIconImage(img.getImage());
       
        
        //Flow layout places the components close to each other.
        /*for (int i=1; i<=6;i++){
            f.add(new JButton("Button"+i));
        }
        //Flow layout places the components close to each other.
        f.setLayout(new FlowLayout());*/
        //The flowlayout ends here.
        
        
    /*  //Dividing the frame into five regions using the Borderlayout or Borderlayout divides the fram into five regions.  
       JButton north =new JButton("North");
       f.add(north,BorderLayout.NORTH);
       JButton south = new JButton("South");
       f.add(south,BorderLayout.SOUTH);
       JButton center = new JButton("Center"); 
       f.add(center,BorderLayout.CENTER); 
       JButton west = new JButton("West");
         f.add(west,BorderLayout.WEST);
       JButton east = new JButton("East");  
        f.add(east,BorderLayout.EAST);
     */
        for(int i=1;i<=6;i++){
            f.add(new JButton("Button"+i));
        }
       //grid layout divides the frame into bricks of equal sizes
        
        f.setLayout(new GridLayout(2,3));
        
        f.setSize (600,600);
        f.setTitle ("Layout Manager");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
     
     }

    public static void main(String[] args) {
        // TODO code application logic here
    LayoutManager layout=  new LayoutManager();
    }
    
}
