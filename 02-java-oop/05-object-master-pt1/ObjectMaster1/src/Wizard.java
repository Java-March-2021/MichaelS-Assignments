public class Wizard extends Human {
	public Wizard(int strength, int stealth, String name) {
		super(strength, stealth, 8, 50, name);
	}
	
	public int heal(Human target) {
		int health = target.getHealth();
		health += intelligence;
		target.setHealth(health);
		System.out.printf("The Wizard cast heal, and %s health is now %d.\n", target.name, target.health);
		return health;
	}
	
	public int fireball(Human target) {
		int damage = intelligence * 3;
		int health = target.getHealth();
		health -= damage;
		target.setHealth(health);
		System.out.printf("The Wizard cast fireball for %d. %s health is now %s.\n", damage, target.name, target.health);
		return health;
	}
}
