/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventshandling2;

/**
 *
 * @author benedict
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventsHandling2 {

    
    
    
    public EventsHandling2(){
        
        
        JFrame evt = new JFrame();
        
        JLabel title = new JLabel ("Title :");
        title.setBounds(20,20,100,20);
        evt.add(title);
        
        JComboBox Title = new JComboBox();
        Title.setBounds(70,20, 100, 20);
        Title.addItem ("");
        
        Title.addItem ("Mr");
        Title.addItem ("Mrs");
        Title.addItem("Miss");
        Title.addItem("Dr");
        Title.addItem("Prof");
        
        evt.add(Title);
        
        JLabel fname =new JLabel("FirstName:");
        fname.setBounds(20,100,100,20);
        evt.add(fname);
        
        JTextField txtfname = new JTextField();
        txtfname.setBounds(120,100,150,20);
        evt.add(txtfname);
       
         JLabel sname =new JLabel("SurName:");
        sname.setBounds(270,100,100,20);
        evt.add(sname);
        
        JTextField txtsname = new JTextField();
        txtsname.setBounds(370,100,150,20);
        evt.add(txtsname);
       
         JLabel address =new JLabel("Address:");
        address.setBounds(20,150,100,20);
        evt.add(address);
        
        JTextField Address = new JTextField();
        Address.setBounds(120,150,400,100);
        evt.add(Address);
       
        JButton ok = new JButton("OK");
        ok.setBounds(20,300,100,20);
      //Setting events for the button ok
        ok.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
         System.out.println("Title "+ Title.getSelectedItem());
         System.out.println("FirstName: "+txtfname.getText());
         System.out.println("Surname: "+txtsname.getText());
         System.out.println("Address: "+Address.getText());
         }
        });
        evt.add(ok);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(150,300,100,20);
        //setting events for the button cancel
        cancel.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
      Title.setSelectedIndex(0);
      txtfname.setText("");
      txtsname.setText("");
      Address.setText("");
      

              
                }
        
        
        
        });
        evt.add(cancel);
        
        JButton exit = new JButton("Exit");
         exit.setBounds(280,300,100,20);
 //setting events for the button exit...
         exit.addActionListener(new ActionListener(){        
    public void actionPerformed(ActionEvent e){

                System.exit(0);
    }
  });
        evt.add(exit);
        
        evt.setLayout(null);
        evt.setSize(600,600);
        evt.setTitle("Eventshandling2");
        evt.setVisible(true);
        evt.setLocationRelativeTo(null);
        evt.setDefaultCloseOperation(evt.EXIT_ON_CLOSE);
        evt.setResizable(false); 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       // TODO code application logic here
    EventsHandling2 eventshandling = new EventsHandling2();
    }
    
}
