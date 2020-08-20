import com.CompanyEmpWage;
import com.companyEmpWag;

public class EmployeeUc4 {

	public static void main(String[] args) {
		private int computeEmpWage(CompanyEmpWage companyEmpWage) {
			// TODO Auto-generated method stub
			
			int empHrs=0;
			int totalEmpHrs=0;
			int totalWorkingDays=0; 
			
			while(totalEmpHrs<=companyEmpWage.maxHrPerMonth && totalWorkingDays < companyEmpWage.numberOfWorkingDays ){
				
				totalWorkingDays++;
				double empCheck=Math.floor(Math.random() * 10) % 3;
				
				switch ((int) empCheck) {
				case IS_FULL_TIME:
						empHrs=8;
						break;
				case IS_PART_TIME:
						empHrs=4;
						break;
				default:
						empHrs=0;
				}
				int daySalary = empHrs * companyEmpWage.empRatePerHr;
				System.out.println(daySalary);
				companyEmpWag
				e.dailyWage.add(daySalary);
				totalEmpHrs += empHrs;
				System.out.println("Total Working Days :: "+totalWorkingDays+"/daily empHrs"+empHrs+"/ total Emp Hrs"+totalEmpHrs);
			}
			System.out.println(companyEmpWage.dailyWage);
			System.out.println(totalEmpHrs*companyEmpWage.empRatePerHr);
			return totalEmpHrs*companyEmpWage.empRatePerHr;
		}



	}

}
