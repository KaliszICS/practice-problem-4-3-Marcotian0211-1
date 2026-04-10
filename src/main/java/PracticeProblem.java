import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		Scanner scanner=new Scanner(System.in);
		int i;
		System.out.print("Input a positive integer: ");
		i=scanner.nextInt();
		do{
			if (i<0){
				System.out.print("Input a positive integer: ");
				i=scanner.nextInt();
			}
		}
		while(i<0);
		System.out.println(i*2);

		
		//Write question 1 code here
	}

	public static void q2() {
		Scanner scanner=new Scanner(System.in);
		String i;
		String i1;
		do{
		System.out.print("Input a password: ");
		i=scanner.nextLine();
		System.out.print("Confirm the password: ");
		i1=scanner.nextLine();
		if(!i.equals(i1)){
		System.out.print("Input a password: ");
		i=scanner.nextLine();
		System.out.print("Confirm the password: ");
		i1=scanner.nextLine();}
	}while ( !i.equals(i1));
	System.out.println("success.");


		
		//Write question 2 code here
	}

	public static void q3() {
		Scanner scanner=new Scanner(System.in);
		int i;
		int i1;
		do{
		System.out.print("Input an integer: ");
		i=scanner.nextInt();
		 System.out.print("Input an integer that is a multiple of the first integer: ");
          i1=scanner.nextInt();
		  if (i1 % i != 0){
		System.out.print("Input an integer: ");
		 i=scanner.nextInt();
		 System.out.print("Input an integer that is a multiple of the first integer: ");
          i1=scanner.nextInt();
		  }}
		  while(i1 % i != 0);
		  System.out.println("success.");
		//Write question 3 code here
	}
}
