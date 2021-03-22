
public class IPhone extends MyPhone implements Ringable{
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		System.out.printf("iPhone X says %s\n", this.getRingTone());
		return null;
	}
	
	@Override
	public String unlock() {
		System.out.println("Unlocking via facial recognition\n");
		return null;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("iPhone X from %s\n", this.getCarrier());
	}
}
