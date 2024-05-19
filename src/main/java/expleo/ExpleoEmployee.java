package expleo;

import java.util.ArrayList;
import java.util.List;

public class ExpleoEmployee {

	private static List<EngineeringExpleoEmployee> employeesList = new ArrayList<>();

	String name;
	int sapID;

	public ExpleoEmployee(String name) {
		this.name = name;
		this.sapID = generateSapID();
	}

	public ExpleoEmployee(String name, int sapID) {
		this.name = name;
		this.sapID = sapID;
	}

	public EngineeringExpleoEmployee hire(String name) {
		EngineeringExpleoEmployee emp = new EngineeringExpleoEmployee(name, generateSapID());
		employeesList.add(emp);
		return emp;
	}

	public void resignOrFire(EngineeringExpleoEmployee emp) {
		employeesList.remove(emp);
	}

	private int generateSapID() {
		return employeesList.size() + 1000;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nSAP ID: " + this.sapID + "\n";
	}

	public static List<EngineeringExpleoEmployee> getEmployeesList() {
		return employeesList;
	}

	public String displayEmployeeList() {
		
		if (employeesList == null) return "The List of employees is empty";
	
		String employees ="---> The List of employees contains: \n";
		
		for (int i = 0; i < employeesList.size(); i++) {
			employees += employeesList.get(i).toString();
		}
		return employees;
	}

}
