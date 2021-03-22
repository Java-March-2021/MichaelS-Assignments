
public class DnDController {

	public static void main(String[] args) {
		Wizard wiz = new Wizard(1, 1, "Merlin");
		Ninja nin = new Ninja(3, 2, 75, "Naruto");
		Samurai sam = new Samurai(10, 2, 2, "Hanzo");
		
		wiz.fireball(sam);
		nin.steal(sam);
		nin.recover();
		nin.runAway();
		wiz.heal(nin);
		sam.deathBlow(nin);
		sam.meditate();
		sam.howMany();
	}

}
