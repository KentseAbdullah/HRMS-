import java.io.Serializable;
import java.util.Date;

public class employee {
	
   public int employeeid;
   public String firstname;
   public String lastname;
   public Date dateofbirth;
   public String gender;
   public String address;
   public String titleofemployment;
   public Date datehired;
   public String department;
   public int hoursworked;
   public double rateofpay;
   public int leavedays;
   public double carallowance;
   public double monthlygrtuity;
   public double taxrate;
	
   public employee (){}
	
   public int getEmployeeid() {
      return employeeid;
   }
   public void setEmployeeid(int employeeid) {
      this.employeeid = employeeid;
   }
   public String getFirstname() {
      return firstname;
   }
   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }
   public String getLastname() {
      return lastname;
   }
   public void setLastname(String lastname) {
      this.lastname = lastname;
   }
   public Date getDateofbirth() {
      return dateofbirth;
   }
   public void setDateofbirth(Date dateofbirth) {
      this.dateofbirth = dateofbirth;
   }
   public String getGender() {
      return gender;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getTitleofemployment() {
      return titleofemployment;
   }
   public void setTitleofemployment(String titleofemployment) {
      this.titleofemployment = titleofemployment;
   }
   public Date getDatehired() {
      return datehired;
   }
   public void setDatehired(Date datehired) {
      this.datehired = datehired;
   }
   public String getDepartment() {
      return department;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
   public int getHoursworked() {
      return hoursworked;
   }
   public void setHoursworked(int hoursworked) {
      this.hoursworked = hoursworked;
   }
   public double getRateofpay() {
      return rateofpay;
   }
   public void setRateofpay(double rateofpay) {
      this.rateofpay = rateofpay;
   }
   public int getLeavedays() {
      return leavedays;
   }
   public void setLeavedays(int leavedays) {
      this.leavedays = leavedays;
   }
   public double getCarallowance() {
      return carallowance;
   }
   public void setCarallowance(double carallowance) {
      this.carallowance = carallowance;
   }
   public double getMonthlygrtuity() {
      return monthlygrtuity;
   }
   public void setMonthlygrtuity(double monthlygrtuity) {
      this.monthlygrtuity = monthlygrtuity;
   }
   public double getTaxrate() {
      return taxrate;
   }
   public void setTaxrate(double taxrate) {
      this.taxrate = taxrate;
   }
	
   public double getSalary() {
      double employeeSalary;
      double gross;
      double taxpaid;
      gross = ((rateofpay * hoursworked) +(carallowance + monthlygrtuity));
      taxpaid = ((taxrate/100) * gross);
      employeeSalary = (gross - taxpaid);
      return employeeSalary;
   }
	
   public double getGross() {
      double gross;
      gross = ((rateofpay * hoursworked) +(carallowance + monthlygrtuity));
      return gross;
   }
	
   public double getTaxpaid() {
      double gross;
      double taxpaid;
      gross = ((rateofpay * hoursworked) + (carallowance + monthlygrtuity));
      taxpaid = ((taxrate/100) * gross);
      return taxpaid;
   }
	
	
	

}
