package stringProject;

public class Bharathi {

	public static void main(String[] args) {
		String a="I am currently learning software testing ";
		String b="bharathi2005sk@&&";
		String c="i  AM currently learning software testing ";
		String name="bharathi";
		String name2="BHARATHI";
	
		boolean contain=a.contains("z");
		System.out.println(contain);
		String replace=a.replace("software testing", "java");
		System.out.println(replace);
		String bharathi=a.replaceAll("[^A-Z,a-z]", "");
		System.out.println(bharathi);
		String kanmani=b.replaceAll("[^0-9]","");
		System.out.println(kanmani);
		System.out.println();
		
		System.out.println();
		if(name.equalsIgnoreCase(name2)) {
			System.out.println("true");
		}
			else
			{
			System.out.println("false");
				
			}
	
		 {
			
			char[]charArray=a.toCharArray();
			for(char d:charArray) {
				System.out.print(name +"  ");
				
				
				
			
			}
			
		 
			

	}
		
		
		
		
	

	}

}

