/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucc.addressbook;

/**
 *
 * @author benedict
 */
//importing the swing,awt,util and text packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UccAddressbook {
//creating a constructor
    public UccAddressbook() {

//setting up a frame.
JFrame f = new JFrame();
       
//creating obejects of some classes(date,simpledateformat,)
Date todaydate = new Date();
SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");    

//Setting up a label which onlystates "UNIVERSITY OF CAPECOAST" and setting the bounds of the label to(30,20,200,50)       
JLabel label = new JLabel("UNIVERSITY OF CAPE COAST");
label.setBounds(90,20,450,50);
label.setFont(new Font("Comic Sans Ms",Font.BOLD,35));
label.setForeground(Color.blue);
f.add(label);

JTextField dateField = new JTextField();
dateField.setEditable(false);
dateField.setText(df.format(todaydate));
dateField.setBounds(200,80, 80, 30);
f.add(dateField);

JLabel title = new JLabel("TITLE :");
title.setBounds(20,150,100,50);
f.add(title);

JComboBox Title = new JComboBox();
        Title.setBounds(90,165,100,20);
        Title.addItem("" );
        
        Title.addItem("Mr.");
        Title.addItem("Mrs.");
        Title.addItem("Miss.");
        Title.addItem ("Dr.");
f.add(Title);



JLabel firstname = new JLabel ("FirstName :");
firstname.setBounds(20, 200, 100, 20);
f.add(firstname);

JTextField name = new JTextField ("");
name.setBounds(120,200,150,20);
f.add(name);

JLabel surname = new JLabel ("SurName :");
surname.setBounds(300, 200, 100, 20);
f.add(surname);
JTextField name2 = new JTextField("");
name2.setBounds(390, 200, 150, 20);
f.add(name2);


JLabel Gender = new JLabel ("Gender :");
Gender.setBounds(20,300, 150, 20);
f.add(Gender);

JComboBox gender = new JComboBox();
        gender.setBounds(90,300,150,20);
        gender.addItem("" );
        
        gender.addItem("Male");
        gender.addItem("Female");
        gender.addItem("other");
f.add(gender);

JLabel bday = new JLabel ("Birthday :");
bday.setBounds(300,300, 150, 20);
f.add(bday);

JTextField bday1 = new JTextField ("");
bday1.setBounds(390,300,150,20);
f.add(bday1);


JPanel panel = new JPanel();
JRadioButton single = new JRadioButton("single");
panel.add(single);

JRadioButton divorce = new JRadioButton("divorce");
panel.add(divorce);

JRadioButton Married = new JRadioButton("Married");
panel.add(Married);

f.add(panel);
panel.setBounds(100,400,300,50);
panel.setBorder(BorderFactory.createTitledBorder("Marital Status"));


JMenuBar menubar = new JMenuBar();
JMenu fileMenu = new JMenu("File ");
JMenuItem fileItem1 = new JMenuItem("New");
fileMenu.add(fileItem1);


JMenuItem fileItem2 = new JMenuItem("Open");
fileMenu.add(fileItem2);

JMenuItem fileItem3 = new JMenuItem("Close");
fileItem3.addActionListener(new ActionListener(){

    public void actionPerformed(ActionEvent e){

System.exit(0);
}

});
fileMenu.add(fileItem3);


menubar.add(fileMenu);

f.setJMenuBar(menubar);


JMenuBar editmenu = new JMenuBar();
JMenu EditMenu = new JMenu("Edit ");

JMenuItem editItem1 = new JMenuItem("Undo");
EditMenu.add(editItem1);


JMenuItem editItem2 = new JMenuItem("Redo");
EditMenu.add(editItem2);

JMenuItem editItem3 = new JMenuItem("Copy");
EditMenu.add(editItem3);

JMenuItem editItem4 = new JMenuItem("Paste");
EditMenu.add(editItem4);

JMenuItem editItem5 = new JMenuItem("Cut");
EditMenu.add(editItem5);

editmenu.add(EditMenu);

menubar.add(editmenu);






f.setLayout(null);
f.setSize(600,600);
f.setTitle("UCC AddressBook"); 
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setVisible(true);
f.setResizable(false);  







}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    UccAddressbook addressbook = new UccAddressbook();
    }
    
}
