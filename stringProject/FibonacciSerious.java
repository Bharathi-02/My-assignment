
package stringProject;

//declar the calss name;
public class FibonacciSerious {
	//main method of the program;
public static void main(String[] args) {
	//declar the vari
	int  a=10, fristNumber=0, secondnum=1,sum;
	System.out.println(fristNumber);
	System.out.println(secondnum);
	for(int i=1;i<=a;i++) {
		sum=fristNumber+secondnum;
		fristNumber=secondnum;
		secondnum =sum;
		System.out.println(sum);
}
}
}
