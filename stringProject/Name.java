package stringProject;

public class Name implements InterFaceAnimal1 {
	public void speed() {
		System.out.println("the cat run fast");
	}
	public void makesound() {
		System.out.println("wow wow");
		
	
	}
	
	public static void main(String[] args) {
		
		Name n=new Name();
		n.speed();
		n.makesound();
	}

}
