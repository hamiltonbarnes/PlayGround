/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.bpad;

/**
 *
 * @author benedict barnes
 */

import java.io.*;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import form.bpad.bPad;
import java.awt.datatransfer.StringSelection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.Clipboard;
public class jmenu extends JMenuBar {
    
       // JTextArea text;
        
    public jmenu(JTextArea output, JTextArea editable){
       // this.text = editable;
        //creating a  menubar
        JMenuBar menubar = new JMenuBar();
      //Creating a file menu and it sub  menus
JMenu fileMenu = new JMenu("File ");
JMenuItem fileItem1 = new JMenuItem("New File");

// implementation of event listners
    //defines what should be done when a user performs a certain action 
 
fileItem1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                new Newfile().setVisible(true);
            }    
});
fileMenu.add(fileItem1);

JMenuItem fileItem9 = new JMenuItem("Open File");

// implementation of event listners
    //defines what should be done when a user performs a certain action 
 
fileItem9.addActionListener(new ActionListener(){
          

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  
                    bPad.Openfile(output);
                } catch (IOException ex) {
                    Logger.getLogger(jmenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
});
fileMenu.add(fileItem9);


JMenuItem fileItem2 = new JMenuItem("Open Folder");

// implementation of event listners
    //defines what should be done when a user performs a certain action 
 
fileItem2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bPad.desktop();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
    
});
fileMenu.add(fileItem2);

JMenu menuItem = new JMenu("Open Recent");

JMenuItem menuItem1 = new JMenuItem("ReOpen Closed Files");
menuItem.add(menuItem1);

JMenuItem menuItem2 = new JMenuItem("Clear Opened File List");
menuItem.add(menuItem2);

fileMenu.add(menuItem);

JMenuItem fileItem3 = new JMenuItem("Save");

// implementation of event listners
    //defines what should be done when a user performs a certain action 
 
fileItem3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                /*try*/ {
                    try {
                        //                     bPad.saveFile(JTextArea editable, File file, boolean overWrite);
                        // JTextArea editable = new JTextArea();
                        //File file = null;
                        //boolean overWrite = true;
                        //bPad.saveFile(editable, file, overWrite);
                        bPad.saveFile();
                    } catch (IOException ex) {
                       ex.printStackTrace();
                    }
            
            } //catch (IOException ex) {
                    //ex.printStackTrace();
                }
           // }
});
fileMenu.add(fileItem3);

JMenuItem fileItem4 = new JMenuItem("Save As");

// implementation of event listners
    //defines what should be done when a user performs a certain action 
 
fileItem4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
});
 


fileMenu.add(fileItem4);

JMenuItem fileItem5 = new JMenuItem("Save All");
fileMenu.add(fileItem5);

JMenuItem fileItem6 = new JMenuItem("Print");
fileMenu.add(fileItem6);

JMenuItem fileItem7 = new JMenuItem("New Window");
fileMenu.add(fileItem7);

JMenuItem fileItem8 = new JMenuItem("Close Window");

// implementation of event listners
    //defines what should be done when a user performs a certain action  
fileItem3.addActionListener(new ActionListener(){

    public void actionPerformed(ActionEvent e){

System.exit(0);
}

});
fileMenu.add(fileItem8);
add(fileMenu);

//Building the edit menu togather with it submenus
JMenuBar editmenu = new JMenuBar();
JMenu EditMenu = new JMenu("Edit ");

JMenuItem editItem1 = new JMenuItem("Undo");
EditMenu.add(editItem1);


JMenuItem editItem2 = new JMenuItem("Redo");
EditMenu.add(editItem2);

JMenuItem editItem3 = new JMenuItem("Copy");
editItem3.addActionListener(new ActionListener(){
            java.awt.datatransfer.Clipboard clipbd = getToolkit().getSystemClipboard();
            @Override
            public void actionPerformed(ActionEvent e) {
             String selection = output.getSelectedText();
                StringSelection clipString = new StringSelection(selection);
                clipbd.setContents(clipString, clipString);    
            
            }
});
EditMenu.add(editItem3);

JMenuItem editItem4 = new JMenuItem("Paste");
editItem4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bPad.Paste(output);
                } catch (IOException ex) {
                   ex.printStackTrace();
                }
            }
});

EditMenu.add(editItem4);

JMenuItem editItem5 = new JMenuItem("Paste and Indent");
EditMenu.add(editItem5);

JMenuItem editItem6 = new JMenuItem("Cut");
editItem6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            try{
                bPad.cut(output);
            }  catch(IOException ex){
            ex.printStackTrace();
            } 
            
            }



});
EditMenu.add(editItem6);

editmenu.add(EditMenu);

add(editmenu);
//Building the run menu also togather  with  it's submenus
JMenuBar runmenu = new JMenuBar();
JMenu RunMenu = new JMenu("Run ");

JMenuItem runItem1 = new JMenuItem("Run with Google Chrome");
RunMenu.add(runItem1);


JMenuItem runItem2 = new JMenuItem("Run with  FireFox Mozilla");
RunMenu.add(runItem2);

JMenuItem runItem3 = new JMenuItem("Run with Internet Explorer");
RunMenu.add(runItem3);

runmenu.add(RunMenu);

add(runmenu);

JMenuBar findmenu = new JMenuBar();
JMenu FindMenu = new JMenu("Find ");

JMenuItem findItem1 = new JMenuItem("Find");
FindMenu.add(findItem1);


JMenuItem findItem2 = new JMenuItem("Find Next");
FindMenu.add(findItem2);

JMenuItem findItem3 = new JMenuItem("Find Previous");
FindMenu.add(findItem3);

JMenuItem findItem4 = new JMenuItem("Replace");
FindMenu.add(findItem4);

findmenu.add(FindMenu);

add(findmenu);



//Building the tools menu togather with it submenus
JMenuBar toolsmenu = new JMenuBar();
JMenu    ToolMenu = new JMenu("Tools");
        
    /*JMenuItem runItem1 = new JMenuItem("Run with Google Chrome");
RunMenu.add(runItem1);


JMenuItem runItem2 = new JMenuItem("Run with  FireFox Mozilla");
RunMenu.add(runItem2);

JMenuItem runItem3 = new JMenuItem("Run with Internet Explorer");
RunMenu.add(runItem3);

runmenu.add(RunMenu);
*/
toolsmenu.add(ToolMenu);
add(toolsmenu);
    
JMenuBar pmenu = new JMenuBar();
JMenu    PMenu = new JMenu("Preferences");
    /*JMenuItem runItem1 = new JMenuItem("Run with Google Chrome");
RunMenu.add(runItem1);


JMenuItem runItem2 = new JMenuItem("Run with  FireFox Mozilla");
RunMenu.add(runItem2);

JMenuItem runItem3 = new JMenuItem("Run with Internet Explorer");
RunMenu.add(runItem3);

runmenu.add(RunMenu);
*/
pmenu.add(PMenu);
add(pmenu);
//Building the help menu and it's subs
JMenuBar helpmenu = new JMenuBar();
JMenu       HelpMenu = new JMenu("Help");
    JMenu helpItem1 = new JMenu("Contents");
HelpMenu.add(helpItem1);


JMenuItem helpItem2 = new JMenuItem("About");
HelpMenu.add(helpItem2);

JMenuItem helpItem3 = new JMenuItem("Contacts");
HelpMenu.add(helpItem3);

helpmenu.add(HelpMenu);
add(helpmenu);
    
    
    }

    jmenu(JTextArea text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


        }
