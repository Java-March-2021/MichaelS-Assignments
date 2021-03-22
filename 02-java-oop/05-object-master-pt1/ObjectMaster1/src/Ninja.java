public class Ninja extends Human {
	public Ninja(int strength, int intelligence, int health, String name) {
		super(strength, 10, intelligence, health, name);
	}
	
	public void steal(Human target) {
		int damage = stealth;
		int health = target.getHealth();
		health -= damage;
		target.setHealth(health);
		System.out.printf("The Ninja uses the skill Steal and took %s health for %d damage!\n", target.name, damage);
	}
	
	public void recover() {
		int recover = stealth;
		int health = this.getHealth();
		health += recover;
		this.setHealth(health);
		System.out.printf("The Ninja recovers %d from the skill Steal!\n", stealth);
	}
	
	public void runAway() {
		int selfDamage = 10;
		int health = this.getHealth();
		health -= selfDamage;
		this.setHealth(health);
		System.out.printf("The Ninja runs away and loses %d health.\n", selfDamage);
	}
}
