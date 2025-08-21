package stringProject;

public class CharcterOccuence {
	public static void main(String[] args) {
		String name="Bharathi";
		//a count to track of how many time the 'a'is appears.
		int count=0;
		//covert the string into the  character array.
		char[] name1=name.toCharArray();
		// when iterate the character by using the for loop.
		for(int i=0;i<name1.length;i++) {
			//to check if the character is 'a'
			if(name1[i]=='a') {
				//if yes, increases the count by 1.
				count++;
			}
		}
		//print the final count of 'a'.
		System.out.println(count);
	}

}
