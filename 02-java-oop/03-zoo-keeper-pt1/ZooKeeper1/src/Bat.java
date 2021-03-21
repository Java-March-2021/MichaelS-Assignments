
public class Bat extends Mammal{
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("Woosh!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("You hear the roaring of fire, and the crackling of wood as the village burns!");
		energyLevel -= 100;
	}
}
