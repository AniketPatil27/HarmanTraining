package day1;

public class AssignmentNo2 {

	public static void main(String[] args) {
		
		int year;
       
		for (int i=0; i<args.length;i++) 
		{
			year=Integer.parseInt(args[i]);
			if(year%4==0)
        	{
        		System.out.println("Leap Year");
        	}
        	else
        	{
        		System.out.println("Non Leap Year");
        	}
		}
	}
}
