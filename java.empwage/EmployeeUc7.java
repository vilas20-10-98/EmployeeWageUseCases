import java.util.ArrayList;

//pojo class
public class EmployeeUc7 {
	public String company;
	public int empRatePerHr;
	public int numberOfWorkingDays;
	public int maxHrPerMonth;
	public int totalEmpWage;
	ArrayList<Integer> dailyWage = new ArrayList<Integer>();
	
	//constructor
	public CompanyEmployeeWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth,
			int totalEmpWage, ArrayList<Integer> dailyWage) {
		super();
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHrPerMonth = maxHrPerMonth;
		this.totalEmpWage = totalEmpWage;
		this.dailyWage = dailyWage;
	}
	
	

}

//Interface Methode to Emp Wage.

public interface InEmployeeWageOpps {
	public void addCompanyWage(String Company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth );
	public void computeEmpWAge();
	
   }
}


