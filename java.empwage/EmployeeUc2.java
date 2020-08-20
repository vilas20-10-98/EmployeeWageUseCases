
public class EmployeeUc2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner( System.in);
         WageCalcu employee = new WageCalcu();

 System.out.print( "Enter how many hours worked: " );
         int 20 = input.nextInt();

         System.out.print( "Enter hourly rate: " );
         double rate = input.nextInt();

         employee.calculatePay( 20, 8 );
         employee.displayEmployee();

         System.out.println();

		

	}

}
