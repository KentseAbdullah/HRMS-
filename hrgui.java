
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.event.*;

public class hrgui extends JPanel {
   private JButton jcomp1;
   private JButton jcomp2;
   private JButton jcomp3;
   private JLabel jcomp4;
   private JButton jcomp5;
   private JList jcomp6;
   private JTextArea jcomp7;
   private JList jcomp8;
   private JTextField jcomp9;
   private JButton jcomp10;
   private JButton jcomp11;
   private JButton jcomp12;

   public hrgui() {
   
      //construct preComponents
      String[] jcomp6Items = {};
      String[] jcomp8Items = {};
      
   
      //construct components
      jcomp1 = new JButton ("TITLES");
      jcomp1.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            		
            	
                  //calls external method employeetitles from employeefunctions class
               employeefunctions.employeetitles();
            		
            		
               try { 	
                  FileInputStream fstream = new FileInputStream("titles.txt");
                  DataInputStream in = new DataInputStream(fstream);
                  BufferedReader br = new BufferedReader(new InputStreamReader(in));
                  String strLine;
                  DefaultListModel listModel = new DefaultListModel();
                  while ((strLine = br.readLine()) != null)   
                  {
                     listModel.addElement(strLine); 
                     System.out.println(strLine); 
                  	           
                  }
               
                  jcomp6.setModel(listModel);
                  in.close();
               } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
               }
            		
            		
            		
            		 
            }
         });
      
      jcomp2 = new JButton ("FEMALES");
      jcomp2.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            
            //calls external method femaleemployees from employeefunctions class
               employeefunctions.femaleemployees();
            
               try { 	
                  FileInputStream fstream = new FileInputStream("females.txt");
                  DataInputStream in = new DataInputStream(fstream);
                  BufferedReader br = new BufferedReader(new InputStreamReader(in));
                  String strLine;
               
               
                  DefaultListModel listModel = new DefaultListModel();
                  while ((strLine = br.readLine()) != null)   
                  {
                     listModel.addElement(strLine); 
                     System.out.println(strLine); 
                  }
               
                  jcomp6.setModel(listModel);
                  in.close();
               } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
               }
            }
         
         });
      
      
      jcomp3 = new JButton ("EXIT");
      jcomp3.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            		
               System.exit(0);
            }
         });
      
      jcomp4 = new JLabel ("HR MANAGEMENT SYSTEM");
      
      jcomp5 = new JButton ("SALARIES");
      jcomp5.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            
            
               employeefunctions.employebasicsalaries();
            
               try { 	
                  FileInputStream fstream = new FileInputStream("basicsalaries.txt");
                  DataInputStream in = new DataInputStream(fstream);
                  BufferedReader br = new BufferedReader(new InputStreamReader(in));
                  String strLine;
                  DefaultListModel listModel = new DefaultListModel();
                  while ((strLine = br.readLine()) != null)   
                  {
                     listModel.addElement(strLine); 
                     System.out.println(strLine); 
                  }
               
                  jcomp6.setModel(listModel);
                  in.close();
               } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
               }
            }
         
         });
      
      jcomp6 = new JList (jcomp6Items);
      
      jcomp7 = new JTextArea (10, 10);
      
      jcomp8 = new JList (jcomp8Items);
      
      jcomp9 = new JTextField (5);
      
      jcomp10 = new JButton ("SEARCH");
      jcomp10.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            
            
               String searchText = jcomp9.getText();
               try (BufferedReader reader = new BufferedReader(new FileReader(new File("basicsalaries.txt")))) {
                   	 
                  String text = null;
                  while ((text = reader.readLine()) != null) {
                       	
                     if (text.contains(searchText)) {
                           	
                        jcomp7.setText("");
                           	
                        jcomp7.append(text+'\n');
                           
                     }
                  
                  }
               
               } catch (IOException exp) {
               
                  exp.printStackTrace();
                  JOptionPane.showMessageDialog(null, "Could not create file", "Error", JOptionPane.ERROR_MESSAGE);
               
               }
            
            
            }
         });
      
      jcomp11 = new JButton ("GROSS");
      jcomp11.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            
            
               employeefunctions.employeesgross();
            
               try { 	
                  FileInputStream fstream = new FileInputStream("gross.txt");
                  DataInputStream in = new DataInputStream(fstream);
                  BufferedReader br = new BufferedReader(new InputStreamReader(in));
                  String strLine;
                  DefaultListModel listModel = new DefaultListModel();
                  while ((strLine = br.readLine()) != null)   
                  {
                     listModel.addElement(strLine); 
                     System.out.println(strLine); 
                  }
               
                  jcomp6.setModel(listModel);
                  in.close();
               } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
               }
            }
         
         });
      
     
      jcomp12 = new JButton ("EMP COUNT");
      jcomp12.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            		
               employeefunctions.employeelocation();
               HashMap<String, WordData> Words = new HashMap<String, WordData>();
               try {
                  File f1 = new File("location.txt");
                  Scanner scan1 = new Scanner(f1, "UTF-8");
                  String word, line;
                  WordData wordData;
                  String[] wordsOfLine;
                  while (scan1.hasNext()) {
                     line = scan1.nextLine().trim();
                     wordsOfLine = line.split("\\s");
                  
                     for (int i = 0; i < wordsOfLine.length&&wordsOfLine[i]!=""; i++) {
                                	
                        word = wordsOfLine[i].trim();
                        if (Words.get(word)==null){
                           wordData = new WordData(1, word);
                           Words.put(word, wordData);
                        } else {
                           wordData = Words.get(word);
                           wordData.increaseFrequency();
                           Words.put(word, wordData);
                        }
                     }
                  }
                  for (WordData s : Words.values()){
                     DefaultListModel listModel = new DefaultListModel();
                     listModel.addElement(s.getWord() +": " + s.getFrequency()); 
                     jcomp6.setModel(listModel);
                           	
                     System.out.println(s.getWord() +": " + s.getFrequency());
                              
                  }
               
               } catch (Exception ex) {
                  ex.printStackTrace();
               }}
         });
   
      //adjust size and set layout
      setPreferredSize (new Dimension (667, 509));
      setLayout (null);
   
      //add components
      add (jcomp1);
      add (jcomp2);
      add (jcomp3);
      add (jcomp4);
      add (jcomp5);
      add (jcomp6);
      add (jcomp7);
      add (jcomp8);
      add (jcomp9);
      add (jcomp10);
      add (jcomp11);
      add (jcomp12);
   
      //set component bounds (only needed by Absolute Positioning)
      jcomp1.setBounds (530, 305, 120, 60);
      jcomp2.setBounds (530, 375, 120, 55);
      jcomp3.setBounds (530, 440, 120, 55);
      jcomp4.setBounds (165, 25, 360, 35);
      jcomp5.setBounds (530, 240, 120, 55);
      jcomp6.setBounds (25, 85, 485, 215);
      jcomp7.setBounds (25, 400, 485, 165);
      jcomp8.setBounds (25, 365, 480, 130);
      jcomp9.setBounds (25, 335, 355, 30);
      jcomp10.setBounds (380, 335, 125, 30);
      jcomp11.setBounds (530, 150, 120, 70);
      jcomp12.setBounds (530, 85, 115, 50);
   }


   public static void main (String[] args) {
      JFrame frame = new JFrame ("hrgui");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add (new hrgui());
      frame.pack();
      frame.setVisible (true);
   }
}
