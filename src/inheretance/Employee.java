package inheretance;
import inheretance.Person;
 class Employee extends Person {
	 double annualSalary;
	 int yearStarted;
	 String insurenceNumber;
	 Employee(String name,double annualSalary, int yearStarted,String insurenceNumber){
		 this.name=name;
		 this.annualSalary= annualSalary;
		 this.yearStarted= yearStarted;
		 this.insurenceNumber= insurenceNumber;
	 }
	 String getName() {
		 return this.name;
	 }
	 double getAnnualSalary() {
		 return this.annualSalary;
	 }
	 int getYearStarted() {
		 return this.yearStarted;
	 }
	 String getInsurenceNumber() {
		 return this.insurenceNumber;
	 }
 }
