
public class Gorilla extends Mammal{
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("The gorilla just threw something at some people! Let's hope it wasn't poop...");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate a banana and he looks satisfied!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.printf("The gorilla climbed a super tall tree.");
		energyLevel -= 10;
	}
}
