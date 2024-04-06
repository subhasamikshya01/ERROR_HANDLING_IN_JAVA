import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x:- ");
		double x=sc.nextDouble();
		try {
			double n=Math.log(Math.sin(x)+Math.cos(x));//numerator
			double d=Math.tan(x)-(1/Math.tan(x));
			if(d==0) {
				throw new ArithmeticException("Divide by zero error");
			}
			if(n<=0) {
				throw new ArithmeticException("Log cannot be applied over negative numbers or zero ");
			}
			double k=n/d;
			System.out.println(k);
		}
		catch(ArithmeticException e){
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
