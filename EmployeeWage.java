public class EmployeeWage
{
	public static void main(String[] args)
	{
		int IS_FULL_TIME=1;
		int Result=(int)(Math.random()*10)%2;
		if(Result==IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
