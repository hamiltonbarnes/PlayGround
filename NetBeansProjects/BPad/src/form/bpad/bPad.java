/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.bpad;



//Importing for events and actions.
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

//
import java.io.*;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

//importing for features of GUI
import javax.swing.*;
/**
 *
 * @author benedict barnes
 */
public class bPad extends javax.swing.JFrame {
   
    /**
     * Creates new form bPad
     */
    //Creating a method for Openfolder
    public static void desktop() throws IOException{
    
// Demonstrate "Openfolder" dialog:

    Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File("/home/benedict/Desktop");
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
    }
    
    //Creating a method/function for Openfile
     static void Openfile(JTextArea output) throws IOException{
     
// Demonstrate "Openfile" dialog:

         int val =  FileChooser.showOpenDialog(null); 
      if (val == JFileChooser.APPROVE_OPTION){ 
          File file =FileChooser.getSelectedFile();
          
          try{
          output.read(new FileReader(file.getAbsolutePath()),null);
              
          } catch(IOException e){
          System.out.println("Problem accessing file");
          }
                }
      
      else{
      System.out.println("File cannot be accessed");
      }        
    }                                          
 //Creating a method/function for savefile      
      public static void saveFile() throws IOException
    {
        
//        JFrame saveFile = new JFrame();
// 
//            JFileChooser fileChooser = new JFileChooser();
//fileChooser.setDialogTitle("Save ");   
//int userSelection = fileChooser.showSaveDialog(saveFile);
//if (userSelection == JFileChooser.APPROVE_OPTION) {
//    
//// creates a File object
//File savefile = new File("/home/benedict/Document");
// 
//
//// if file doesnt exists, then create it
//      if (!savefile.exists()) {
//            savefile.createNewFile();
//        }
//      try{
//        FileWriter fw = new FileWriter(savefile.getAbsoluteFile());
//       
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(text.getText());
//        bw.close();
//        }catch(Exception m){
//    
//}
// // Display that the file has being saved.
//      JOptionPane.showMessageDialog(null,"File Saved!");
//
//    
//    File fileToSave = fileChooser.getSelectedFile();
//    System.out.println("Save  file: " + fileToSave.getAbsolutePath());
//}

//String filename = JOptionPane.showInputDialog("Name this file");
        JFileChooser savefile = new JFileChooser();
        String filename = "";
        
        savefile.setSelectedFile(new File(filename));
        savefile.showSaveDialog(savefile);
        BufferedWriter writer;
        int sf = savefile.showSaveDialog(null);
        if(sf == JFileChooser.APPROVE_OPTION){
            try {
          writer = new BufferedWriter(new FileWriter(savefile.getSelectedFile()));
                text.write(writer);
                writer.close();
                JOptionPane.showMessageDialog(null, "File has been saved","File Saved",JOptionPane.INFORMATION_MESSAGE);
                

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if(sf == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "File save has been canceled");
        }
    
    }

    
//Creating a method/function for  Save file  As "Save As"
        public static void SaveAs()throws IOException{
            
        JFrame saveAs = new JFrame();
 
            JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Save As ");   
 
// Demonstrate "SaveAs" dialog:
int userSelection = fileChooser.showSaveDialog(saveAs);
if (userSelection == JFileChooser.APPROVE_OPTION) {
    File fileToSave = fileChooser.getSelectedFile();
    System.out.println("Save file as: " + fileToSave.getAbsolutePath());
  
        }  
        }
     //Creating  a method/function to help paste to textarea from any origin  
    static void Paste(JTextArea output) throws IOException{
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        String writeMe = null;
        Transferable text = new StringSelection(writeMe);
        clip.setContents(text, null);
    }
    
    //Creating  a method/function to help cut to from text area
    public static void cut(JTextArea output) throws IOException{
    Clipboard clipbd = Toolkit.getDefaultToolkit().getSystemClipboard();
    String selection = text.getSelectedText();
    StringSelection clipString = new StringSelection(selection);
    clipbd.setContents(clipString, clipString);
text.replaceRange("", text.getSelectionStart(),
                        text.getSelectionEnd());
    }
    
    public bPad() {
        initComponents();
         
        
        this.setLocationRelativeTo(null);    
        this.setSize(600,600);
          ImageIcon img =  new ImageIcon("frnds1.jpg");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text.setColumns(20);
        text.setFont(text.getFont());
        text.setLineWrap(true);
        text.setRows(5);
        text.setWrapStyleWord(true);
        jScrollPane1.setViewportView(text);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/new file.png")); // NOI18N
        jMenuItem1.setText("New File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/new file.png")); // NOI18N
        jMenuItem2.setText("Open File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/folder.jpg")); // NOI18N
        jMenuItem3.setText("Open Folder");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu3.setText("Open Recent");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Reopen Closed Files");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem4.setText("Clear Opened File List");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Save");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Save As");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Save All");
        jMenu1.add(jMenuItem7);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/Print.png")); // NOI18N
        jMenuItem11.setText("Print");
        jMenu1.add(jMenuItem11);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("New Window");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Close Window");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/u.jpg")); // NOI18N
        jMenuItem12.setText("Undo");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/r.jpg")); // NOI18N
        jMenuItem13.setText("Redo");
        jMenu2.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/copy.GIF")); // NOI18N
        jMenuItem14.setText("Copy");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/cut.GIF")); // NOI18N
        jMenuItem15.setText("Cut");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(new javax.swing.ImageIcon("/home/benedict/NetBeansProjects/BPad/paste.GIF")); // NOI18N
        jMenuItem16.setText("Paste");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setText("Paste and Indent");
        jMenu2.add(jMenuItem17);

        jMenuItem25.setText("Select All");
        jMenu2.add(jMenuItem25);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Run");

        jMenuItem18.setText("Run using Google Chrome");
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Run using Mozilla FireFox");
        jMenu4.add(jMenuItem19);

        jMenuItem20.setText("Run using Internet Explorer");
        jMenu4.add(jMenuItem20);

        jMenuBar1.add(jMenu4);

        jMenu8.setText("Find");

        jMenuItem23.setText("Find");
        jMenu8.add(jMenuItem23);

        jMenuItem24.setText("Find Next");
        jMenu8.add(jMenuItem24);

        jMenuItem28.setText("Find Previous");
        jMenu8.add(jMenuItem28);

        jMenuItem29.setText("Replace");
        jMenu8.add(jMenuItem29);

        jMenuBar1.add(jMenu8);

        jMenu5.setText("Tools");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Preferences");
        jMenuBar1.add(jMenu6);

        jMenu9.setText("Help");

        jMenu10.setText("Contents");

        jMenuItem26.setText("About Us");
        jMenu10.add(jMenuItem26);

        jMenuItem27.setText("Contact");
        jMenu10.add(jMenuItem27);

        jMenu9.add(jMenu10);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed
      // implementing window events
    //exit window on exit
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
                       System.exit(0);        
    }//GEN-LAST:event_jMenuItem9ActionPerformed
          // implementing window events
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
                    // Adding an  event to Reopen closed files in  bpad.
        new ReOpenClosedFiles().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    
    }//GEN-LAST:event_jMenuItem4ActionPerformed
               // implementing window events
           //Open a new file upon  demand
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            Openfile(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
                                               
               // implementing window events
    //Copy from text area
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
         
        java.awt.datatransfer.Clipboard clipbd = getToolkit().getSystemClipboard();
        String selection = text.getSelectedText();
                StringSelection clipString = new StringSelection(selection);
                clipbd.setContents(clipString, clipString);    
            
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        
        try {
            Paste(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
               new Newfile().setVisible(true); 
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed
        // implementing window events
    //Save a file as what one prefers
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
                   try{  SaveAs();}
                catch(IOException m){
                    m.printStackTrace();
                };  
                
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    
    
    
    // implementing window events
    // Open a folder
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                try{  desktop();}
                catch(IOException m){
                    m.printStackTrace();
                };        
        

    }//GEN-LAST:event_jMenuItem3ActionPerformed
        // implementing window events
          //Save a file
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            saveFile();
        } catch (IOException ex) {
            ex.printStackTrace();//(bPad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        try {
            cut(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bPad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bPad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JFileChooser FileChooser;
    private static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private static javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private static javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    private static javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
    
    }

  

