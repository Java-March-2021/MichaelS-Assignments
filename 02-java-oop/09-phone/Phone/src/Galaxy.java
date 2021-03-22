
public class Galaxy extends MyPhone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		System.out.printf("Galaxy S9 says %s\n", this.getRingTone());
		return null;
	}
	
	@Override
	public String unlock() {
		System.out.println("Unlocking via finger print\n");
		return null;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("Galaxy S9 from %s\n", this.getCarrier());
	}
}
