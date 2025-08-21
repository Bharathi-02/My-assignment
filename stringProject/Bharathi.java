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
				{
				
				
				
				
				
			
			}
			
			
			

	}
		 System.out.println();
		 
		 String word="hello";
		 char karthi=word.charAt(1);
		
				 System.out.println(karthi);{
					 
				 
				   String name6="revathi";
				 
				 char[] object= name6.toCharArray();
				 for(char g:object) {
					 System.out.println(g);
				 }
				 String statment="bhjj,ygyg,yugyug";
				 String[] furite=statment.split(",");
				 for(String furites:furite) {
					 System.out.println(furites);
				 }
		
		
				 String keerthi="bharathi";
				 String keerthi2="bharathyi2005sk";
					boolean contains=keerthi.contains("b");
					System.out.println(contains);
					
					 String kanmani1=keerthi.replace("b", "k");
					 System.out.println(kanmani1);
					String kanmani2=keerthi2.replaceAll("[^0-9]", "");
					System.out.println(kanmani2);
					if(keerthi.equals(keerthi2)) {
						System.out.println("if its same to display the true");
					}
					else
					{
						System.out.println("if its not same diplay false");
					}
	              if(keerthi.equalsIgnoreCase(keerthi2)) {
	            	  System.out.println("true");
	             
	             }
	              else
	              {
	            	  System.out.println("false");
	              }
	              String prathika="i am a good girl";
	              char[] prathika1=prathika.toCharArray();
	              for(char m:prathika1) {
	            	  System.out.println(m);
	              }
	              String prathika12="bharathi,subashini,karthikeyan";
	              String[] h=prathika12.split(",");
	              for(String m:h) {
	            	  System.out.println(m);
	              }
	              String firstname="siva";
	              char first=firstname.charAt(2);
	              char second=firstname.charAt(3);
	              System.out.println("first:"+first);
	              System.out.println("second:"+second);
             	}

}
	}
}
