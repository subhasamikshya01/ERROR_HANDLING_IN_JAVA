import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:- ");
		String s=sc.nextLine();
		try {
			int n=Integer.parseInt(s);
			System.out.println("The no. entered is:- "+n);
		}
		catch(NumberFormatException e) {
			System.out.println("Error:- Input is not a valid integer.");
		}
		sc.close();
	}

}
