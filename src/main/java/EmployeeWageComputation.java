// UC-1
public class EmployeeWageComputation  {
	void checkEmployeeAttendence() {
	 	   int IS_FULL_TIME = 1;
	 	   double empCheck = Math.floor(Math.random() * 10)%2;
	 	   if(empCheck == IS_FULL_TIME)
	 		   System.out.println("Employee is present");
	 	   else
	 		   System.out.println("Employee is Absent");

	    }
	//UC-2
	//Daily Employee Wage
	void checkDailyWages() {
		int IsFullTime=1;
	    int EmployeeRatePerHr=20;
	    int FulldayHr=8;
	    
	    double employeeCheck = Math.floor(Math.random() * 10) %2;
		if ( employeeCheck == IsFullTime ) {
			System.out.println( "EmployeeFulldaywage = " + ( FulldayHr * EmployeeRatePerHr));
		}
			else {
				System.out.println ("Employeewage=" + (0));
			}
	}

	//public static void main(String[] args) {
	//	EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		//Emp.checkDailyWages();
	
//	public static void main(String[] args) {		EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		
//UC-3
void checkPartimeandFulltimeWages() {
	int IsFullTime = 1;
    int IsPartTime= 2 ;
    int EmployeeRatePerHr= 20;
    int empHrs= 0;
    int empWage= 0;
    
    double employeeCheck = Math.floor(Math.random() * 10) %3;
	if ( employeeCheck == IsFullTime ) {
		empHrs= 8;
	}
		else if ( employeeCheck == IsPartTime){		
			empHrs=4;
		}
	empWage = empHrs * EmployeeRatePerHr;
System.out.println("empWage : =" + empWage);
}

public static void main(String[] args) {
	EmployeeWageComputation  Emp = new EmployeeWageComputation ();
		Emp.checkPartimeandFulltimeWages();
}
}