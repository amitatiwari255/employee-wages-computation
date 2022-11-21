
public class EmployeeWageComputation  {
	void checkEmployeeAttendence() {
	 	   int IS_FULL_TIME = 1;
	 	   double empCheck = Math.floor(Math.random() * 10)%2;
	 	   if(empCheck == IS_FULL_TIME)
	 		   System.out.println("Employee is present");
	 	   else
	 		   System.out.println("Employee is Absent");

	    }
	//Daily Employee Wage
	void checkDailyWages() {
		int IsFullTime=1;
	    int IsPartTime=2;
	    int EmployeeRatePerHr=20;
	    int FulldayHr=8;
	    int HalfdayHr=4;
	    
	    double employeeCheck = Math.floor(Math.random() * 10) %2;
		if ( employeeCheck == IsFullTime ) {
			System.out.println( "EmployeeFulldaywage = " + ( FulldayHr * EmployeeRatePerHr));
		}
			else {
				System.out.println ("EmployeeHalfdaywage=" + (HalfdayHr *EmployeeRatePerHr));
			}
		
	}
	public static void main(String[] args) {
		EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		Emp.checkDailyWages();
	}
//	public static void main(String[] args) {		EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		
}
	
//
