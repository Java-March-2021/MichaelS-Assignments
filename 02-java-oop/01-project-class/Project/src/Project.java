
public class Project {
	private String name;
	private String description;
	private String unknownName = "Unknown Name";
	private String unknownDesc = "Unknown Description";
	public String ElevatorPitch() {
		return String.format("%s : %s", name, description);
	}
	public Project() {
		name = unknownName;
		description = unknownDesc;
	}
	
	public Project(String name) {
		this.name = name;
		this.description = unknownDesc;
	}
	
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
