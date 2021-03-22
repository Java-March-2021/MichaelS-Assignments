
public class HumanTest {

	public static void main(String[] args) {
		Human wizard = new Human(3, 3, 3, 100, "Merlin");
		Human assassin = new Human(3, 3, 3, 100, "Naruto");

		wizard.attack(assassin);
	}

}
