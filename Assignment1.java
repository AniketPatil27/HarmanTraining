package day1;

public class Assignment1 {

	public static void main(String[] args) {
	
		int principle=Integer.parseInt(args[0]);
		int rate=Integer.parseInt(args[1]);
		int time=Integer.parseInt(args[2]);
		System.out.println("Simple Intrest: "+((principle*rate*time)/100));
	}

}
