import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:- ");
		Double n=sc.nextDouble();
		double k;
		try {
			if(n%(Math.PI/2)!=0) {
				k=(Math.sin(n)+Math.cos(n))/Math.tan(n);
				System.out.println(k);
			}
			else {
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Error:- The number inpted should not be multiple of PI/2");
		}
		catch(Exception e){
 			System.out.println("Error:- Invalid input or any unknown error occured")
		}
	}

}
