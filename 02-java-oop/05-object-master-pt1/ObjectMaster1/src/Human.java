
public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	protected String name;
	
	public Human(int strength, int stealth, int intelligence, int health, String name) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void attack(Human target) {
		int health = target.getHealth();
		health -= strength;
		target.setHealth(health);
		System.out.printf("Player attacks for " + this.strength + " damage!");
	}
}