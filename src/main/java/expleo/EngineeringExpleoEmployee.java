package expleo;

public class EngineeringExpleoEmployee extends ExpleoEmployee {

	private String projectName;

	public EngineeringExpleoEmployee(String name, int sapID) {
		super(name, sapID);
	}
	

	public void assign(EngineeringExpleoEmployee emp, String projectName) {
		emp.setProjectName(projectName);
		
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		if (this.projectName == null) this.projectName = "Not assigned to a porject";
		return super.toString() + "Project: " + this.projectName + "\n";
	}
	
	
	

}
