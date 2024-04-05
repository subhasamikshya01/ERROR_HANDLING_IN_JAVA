import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter 2 numbers:- ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(b!=0) {
				double q=a/b;
				System.out.println(a+"/"+b+"="+q);
			}
			else {
				throw new ArithmeticException("Division by 0 error");			}
		}
		catch(ArithmeticException e) {
			System.out.println("Error:- "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error:- Invalid input or any unknown error occured!");
		}
		finally {
			sc.close();
		}
	}

}
