
public class Q27 {

	public static void main(String[] args) {
		try {
			Object o="Hello";
			Integer num=(Integer)o;
			System.out.println("Casting successful:- "+num);
		}
		catch(ClassCastException e) {
			System.out.println("Class cast exception occured:- "+e.getMessage());
		}
	}

}
