/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templa tes
 * and open the template in the editor.
 */
package swingcomponents;

/**
 * 7TH/0CTOBER/2014.
 * @author benedict
 */
//Importing PACKAGES
import javax.swing.*;
import java.awt.*;

public class SwingComponents {

    //Creating a constructor.
    public SwingComponents(){
        //Creating a jframe method and Calling methods and also putting in arguements.
       
        JFrame f = new JFrame();
        
        // Setting the frame layout to null using the swing class
        f.setLayout(null);
        
        //Creating a new object of the jlabel class.
        JLabel username = new JLabel("username:");
        //Using the setbound  to position the components on the frame by calculating it's (x-axis,y-axis,width.height).
        username.setBounds(20,20,80,20);
        //Adding the username object to the jframe layout.
        f.add(username);
       
         //Creating a new object of the jlabel class which in the swing  package.
        JTextField txtusername = new JTextField();
       //Using the setbound  to position the components on the frame by calculating it's (x-axis,y-axis,width.height). 
        txtusername.setBounds(100,20,100,20);
        f.add(txtusername);
        
        JLabel password = new JLabel("Password :");  
        password.setBounds(20, 70, 80, 25);
       f.add(password);
//Creating a new oobject of the jpassword class which is the swing package.
        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(100,70,100,25);
        //SetEchoChar is used to change the character representing the password field such as replacing * with #, etc.
        pwd.setEchoChar('b');
        f.add(pwd);
              
        
        JTextArea area = new JTextArea( );
        area.setBounds(20,250,350,150);
        f.add(area);
        
        JLabel maritalstatus = new JLabel("Marital Status:");
        maritalstatus.setBounds(20,90, 150, 60);
        f.add(maritalstatus);
        
        JRadioButton single = new JRadioButton("Single");
        single.setBounds(130,110,80,20);
        f.add(single);
        
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(230,110,80,20);
        f.add(married);
        
        JRadioButton Divorce = new JRadioButton("Divorce");
        Divorce.setBounds(330,110,80,20);
        f.add(Divorce);
       
       
        ButtonGroup group = new ButtonGroup();
        group.add(single);
        group.add(married);
        group.add(Divorce);
        
        JCheckBox Accept = new JCheckBox("Accept");
        Accept.setBounds(50,150,100,50);
        f.add(Accept);
        
        JCheckBox Decline = new JCheckBox("Decline");
        Decline.setBounds(150,150,100,50);
        f.add(Decline);
        

        JLabel Date = new JLabel("Date :");
        Date.setBounds(20,200, 50, 20);
        f.add(Date);
        
        JComboBox Day = new JComboBox();
        Day.setBounds(70,200,50,20);
        Day.addItem("" );

        Day.addItem( 01 );
        Day.addItem(02 );
        Day.addItem( 03);
        Day.addItem(04 );
        Day.addItem(05 );
        Day.addItem(06 );
        Day.addItem(07 );
        f.add(Day);

        JComboBox m = new JComboBox();
        m.setBounds(130,200,90,20);
        m.addItem("" );

        m.addItem( "Jan" );
        m.addItem("Feb" );
        m.addItem( "March");
        m.addItem("April" );
        m.addItem("May" );
        m.addItem("June" );
        m.addItem("July" );
        f.add(m);

         JComboBox year = new JComboBox();
        year.setBounds(230,200,90,20);
        year.addItem("" );

        year.addItem( 2010 );
        year.addItem(2011 );
        year.addItem( 2012);
        year.addItem(2013);
        year.addItem(2014);
        year.addItem(2015);
        year.addItem(2016);
        f.add(year);

        
        JButton Ok = new JButton("OK");
        Ok.setBounds(80,450,100,20);
        f.add(Ok);
        
        JButton Cancel = new JButton("Cancel");
        Cancel.setBounds(190,450,100,20);
        f.add(Cancel);
       
        
        Icon icon = new ImageIcon("frnds1.jpg");
        JLabel img = new JLabel (icon);
        img.setBounds (400,20,180,200);
        f.add(img);
        
        f.setSize(600,600);
        f.setTitle("Swing Components");
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        // Setting the frame layout to null using the swing class
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        
        
        
    }
    
    public static void main(String[] args) {
        //Creating a new object of the swing component class
        SwingComponents com = new SwingComponents();
        
    }
    
}
