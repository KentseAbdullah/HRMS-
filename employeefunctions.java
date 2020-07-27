import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class employeefunctions{
	
	
   public static void femaleemployees(){
   	
      employee emp = new employee();
   	
      try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
      	     BufferedWriter bw = new BufferedWriter(new FileWriter("females.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(" ");
            if (values.length >= 3)
               if(values[4].equals("Female")) {
                 		
                  bw.write(values[1] +' '+ values[2] +' ' + '\n');}
         }
      }
      
      catch(Exception e) {
         JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
      	
      }
   }
	
	
   public static void employeetitles(){
   	
      employee emp = new employee();
   	
      try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
      	     BufferedWriter bw = new BufferedWriter(new FileWriter("titles.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(" ");
            if (values.length >= 3)
                 	
               emp.setFirstname(values[1].toString());
            emp.setLastname(values[2].toString());
            emp.setTitleofemployment(values[6].toString());
                // employee.setEmployeeid(employeeid);
                 	
            bw.write(emp.getFirstname()+' '+ ' ' +emp.getLastname() +' '+ ' ' + emp.getTitleofemployment() + '\n');
         }
      }
      
      catch(Exception e) {
         JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
      	
      }
   }
	
	
	
   public static void employeelocation(){
   	
      employee emp = new employee();
   	
      try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
      	     BufferedWriter bw = new BufferedWriter(new FileWriter("location.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(" ");
            if (values.length >= 3)
                 	
               emp.setAddress(values[5].toString());
            bw.write(emp.getAddress()+ '\n');
         }
      }
      
      catch(Exception e) {
         JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
      	
      }
   }
	
	
   public static void employebasicsalaries(){
   	
   	//employee instance 
      employee emp = new employee();
   	
      try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
      	     BufferedWriter bw = new BufferedWriter(new FileWriter("basicsalaries.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(" ");
            if (values.length >= 14)
                 	
               
               emp.setFirstname(values[1].toString());
            emp.setLastname(values[2].toString());
                 
            emp.setRateofpay(Double.parseDouble(values[10]));
            emp.setHoursworked(Integer.parseInt(values[9]));
            emp.setCarallowance(Double.parseDouble(values[12]));
            emp.setMonthlygrtuity(Double.parseDouble(values[13]));
            emp.setTaxrate(Double.parseDouble(values[14]));
              			        	
            bw.write(emp.getFirstname()+' '+ ' ' +emp.getLastname() +' '+ ' ' + emp.getSalary()+' '+ ' ' +emp.getTaxpaid()+ '\n');
         }
      }
      
      catch(Exception e) {
         JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
      	
      }
   }
	
   public static void employeesgross(){
   
      employee emp = new employee();
   
      try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
           BufferedWriter bw = new BufferedWriter(new FileWriter("gross.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
            String[] values = line.split(" ");
            if (values.length >= 14)
              	
            
               emp.setFirstname(values[1].toString());
            emp.setLastname(values[2].toString());
              
            emp.setRateofpay(Double.parseDouble(values[10]));
            emp.setHoursworked(Integer.parseInt(values[9]));
            emp.setCarallowance(Double.parseDouble(values[12]));
            emp.setMonthlygrtuity(Double.parseDouble(values[13]));
            emp.setTaxrate(Double.parseDouble(values[14]));
              
              
             // employee.setEmployeeid(employeeid);
              	
            bw.write(emp.getFirstname()+' '+ ' ' +emp.getLastname() +' '+ ' ' + emp.getGross()+ '\n');
         }
      }
      
      catch(Exception e) {
         JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
      
      }
   }


}

