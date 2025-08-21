package stringProject;

public class Palindrome {

	public static void main(String[] args) {
 
		String name="bharathi";
		 String bharathi="";
		 char[] name1=name.toCharArray();
		 for(int i=name1.length-1;i>=0;i--) {
			 bharathi=bharathi+name1[i];

	}
		 if(name.equals(bharathi)) {
			 System.out.println("the string is palindrome");
		 }
		 else {
			 System.out.println("the string is not palindrome");
		 }
	}
}
