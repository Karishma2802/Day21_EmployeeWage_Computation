public class EmployeeWage
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;

	public static int computeEmpWage()
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)

	{
		totalWorkingDays++;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch(empCheck)
		{
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
			default:
				empHrs=0;
		}
		totalEmpHrs+=empHrs;
		System.out.println("Day#: " + totalWorkingDays + " EmpHr: " +empHrs);
	}
	int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
	System.out.println("Total Emp Wage: " + totalEmpWage);
	return totalEmpWage;
	}

	public static void main(String[] args)
	{
	computeEmpWage();
	}
}
