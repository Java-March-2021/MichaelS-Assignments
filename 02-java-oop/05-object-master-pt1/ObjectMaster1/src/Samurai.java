public class Samurai extends Human {
	public Samurai(int strength, int stealth, int intelligence, String name) {
		super(strength, stealth, intelligence, 200, name);
	}
	
	public void deathBlow(Human target) {
		int health = target.getHealth();
		int damage = health;
		health -= damage;
		target.setHealth(health);
		System.out.printf("The Samurai uses the skill Death Blow for %d! %s health is now %d.\n", damage, target.name, target.health);
	}
	
	public void meditate() {
		int health = this.getHealth();
		int heal = health / 2;
		health += heal;
		this.setHealth(health);
		System.out.printf("The Samurai meditates and recovers %d. Their health is now %d.\n", heal, health);
	}
	
	public static int howMany() {
		int numOf = 0;
		numOf++;
		System.out.println("The number of samurai is: " + numOf);
		return numOf;
	}
}
