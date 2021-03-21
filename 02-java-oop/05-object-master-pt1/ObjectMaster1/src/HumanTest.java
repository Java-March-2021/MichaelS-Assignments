
public class HumanTest {

	public static void main(String[] args) {
		Human warrior = new Human(3, 3, 3, 100);
		Human assassin = new Human(3, 3, 3, 100);

		warrior.attack(assassin);
	}

}
