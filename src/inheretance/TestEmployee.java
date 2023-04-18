package inheretance;
import inheretance.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Akshay",1200000.0,2020,"abi123456");
		System.out.println(e1.getName());
		System.out.println(e1.getAnnualSalary());
		System.out.println(e1.getYearStarted());
		System.out.println(e1.getInsurenceNumber());
	}

}
