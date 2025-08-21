package stringProject;

public class Sum {
public static void main(String[] args) {
	int num=556;
	int sum=0;
	while(num>0)
	{
		int remainder=num%10;//556%10 , 55%10, 5%10
		sum=sum+remainder;//0+6 6+5 11+5
		num=num/10;//55 5 0
		System.out.println(sum);
	}
	//System.out.println(sum);
}
}
