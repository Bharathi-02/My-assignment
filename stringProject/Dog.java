package stringProject;

public class Dog extends Animal implements Pet {
	void makesound() {
		System.out.println("the dog pow pow");
	}


 public void play() {
	System.out.println("the dog play");
	
}
 

public static void main (String[]args) {
	Dog d=new Dog();
     d.makesound();
     d.play();

	
}}