package stringProject;

public class Bharathi {

	public static void main(String[] args) {
		String a="I am currently learning software testing ";
		String b="bharathi2005sk@&&";
		String name="siva,parvathi,karthikeyan,vinayager";
		boolean contain=a.contains("z");
		System.out.println(contain);
		String replace=a.replace("software testing", "java");
		System.out.println(replace);
		String bharathi=a.replaceAll("[^A-Z,a-z]", "");
		System.out.println(bharathi);
		String kanmani=b.replaceAll("[^0-9]","");
		System.out.println(kanmani);
		String[] name1=name.split(",");
		for(String names:name1 ) {
			System.out.println(names);
		 
			

	}
		
		
		
		
	

	}

}

