package stringProject;
 
abstract class AbstractionVechical {
	abstract  void speed();
	void speed1() {
		System.out.println("the vechical speed is 60");
	}
}
class Car extends AbstractionVechical
{
	 void speed() {
		System.out.println("the car speed is 120");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.speed();
		c.speed1();
		
	}
}

