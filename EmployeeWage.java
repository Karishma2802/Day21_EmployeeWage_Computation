public class EmployeeWage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;

	public static void main(String[] args)
	{
		int empHrs=0;
		int salary=0;
		int empCheck=(int)(Math.random()*10)%3;

		switch(empCheck)
		{
			case FULL_TIME:
			empHrs=8;
			break;

			case PART_TIME:
			empHrs=4;
			break;

			default:
			empHrs=0;
		}

		salary=empHrs*EMP_RATE_PER_HR;
		System.out.println("Salary is "+salary);
		}
}
