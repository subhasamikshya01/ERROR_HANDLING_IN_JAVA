class CustomNullPointerException extends RuntimeException{
	public CustomNullPointerException(String msg) {
		super(msg);
	}
}
public class Q3 {

	public static void main(String[] args) {
		try {
			String str=null;
			if(str==null) {
				throw new CustomNullPointerException("Custom Null Pointer Exception: The string is null.");
			}
			System.out.println(str.length());//This line won't be executed if an exception is thrown
		}
		catch(CustomNullPointerException e) {
			System.out.println("Caught CustomNullPointerException:- "+e.getMessage());
		}
	}
}
