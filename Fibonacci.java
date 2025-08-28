package stringProject;

public class Fibonacci {
	public static void main(String[] args) {
		
	int num=10,firstnum=0,secondnum=1,sum;
	System.out.println(firstnum);
	System.out.println(secondnum);
	for(int i=1;i<=num;i++) {
		sum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=sum;
	
	System.out.println(sum);
		
	}

	}	}


