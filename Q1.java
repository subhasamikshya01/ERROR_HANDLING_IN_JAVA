package Q1;

public class Q1 {

	public static void main(String[] args) {
		try {
			String s=null;
			int length=getlength(s);
			System.out.println("Length of the string is:- "+length);;
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException caught:- "+e.getMessage());
		}
	}

	public static int getlength(String s) {
		 if(s==null) {
			 throw new NullPointerException("String is null");
		 }
		 return s.length();
	}

}
