package stringProject;

public class SwapProgram {

	public static void main(String[] args) {
	 int a,b,temp;
	 a =10;
	 b=20;
	System.out.println(a +"," +b);
	 
	// temp=a;a=b;b=temp;
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	
	 System.out.println("a,b ="+a +"," +b);
	
//split method 

        String name ="bharathi,kanmani,kannammma";
        String[]name1=name.split(",");
        for(String name2:name1) {
        	System.out.println(name2);
        }
        
       
        }
    
}