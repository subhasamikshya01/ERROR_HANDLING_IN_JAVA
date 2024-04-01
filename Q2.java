package Q2;

public class Q2 {

	public static void main(String[] args) {
		try { //Begins a block of code in which exceptions may occur. We use try-catch to handle potential exceptions gracefully.
			String s="ac1b2cd4e5f";
			displayNumericChars(s);
		}
		catch(NullPointerException e){
			System.out.println("Error: Input String is null/empty.");
		}
		catch(Exception e) {//catches any other exception that may occur during execution
			System.out.println("An unexpected error occured: "+e.getMessage());
		}
	}

	public static void displayNumericChars(String s) {
		if(s==null||s.isEmpty()) {
			throw new NullPointerException("Input string is null/ empty.");
		}
		boolean found=false;//initializes a boolean variable named found to keep track of whether numeric characters meeting the conditions were found.
		for(int i=2;i<s.length();i++) {
			char c=s.charAt(i);//current character
			char pc=s.charAt(i-1);//previous character
			char ppc=s.charAt(i-2);//character before the previous character
			if(Character.isDigit(c) && isVowel(ppc) && !isVowel(pc)){//checks if the current character is digit and the 2 preceding characters form a vowel-consonant sequence.
				System.out.println(c+" ");
				found=true;
			}
		}
		if(!found) {
			System.out.println("No numeric characters preceded by a vowel and consonant found.");
		}
	}

	public static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c)!=-1;//returns true if the given character is a vowel, otherwise returns false 
	}
}
//int indexOf(String str)
//parameter:- str
//return value:- if the substring is found within the calling string, the index of the 1st occurrence of the substring is returned. else if the substring isn't found then -1 is returned


