package tests;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import expleo.EngineeringExpleoEmployee;
import expleo.ExpleoEmployee;

public class ExpleoTest {
	
	private static ExpleoEmployee manager;
    private static EngineeringExpleoEmployee engineer1;
    private static EngineeringExpleoEmployee engineer2;
	
	@BeforeClass
    public static void setUp() {
        manager = new ExpleoEmployee("Riham", 12345);
        engineer1 = manager.hire("Mofid");
        engineer2 = manager.hire("Ahmed");
    }

	@Test
	public void TestHire() {
		List<EngineeringExpleoEmployee> employeesList = ExpleoEmployee.getEmployeesList();
		System.out.println("Testing Hire is running ..........: ");
		System.out.println(manager.displayEmployeeList());

		Assert.assertTrue(employeesList.contains(engineer1) && employeesList.contains(engineer2));
	}

	@Test
	public void TestID() {
		System.out.println("TestID:\n" + manager.toString());
		Assert.assertEquals("Name: Riham\nSAP ID: 12345\n", manager.toString());
	}

	@Test
	public void TestResignOrFire() {
		List<EngineeringExpleoEmployee> employeesList = ExpleoEmployee.getEmployeesList();
		System.out.println("TestResignOrFire is running .......");
		System.out.println("Number of employees before resign or fire is: " + employeesList.size());
		System.out.println(manager.displayEmployeeList());

		manager.resignOrFire(engineer2);
		System.out.println("Number of employees after resign or fire is: " + employeesList.size());
		System.out.println(manager.displayEmployeeList());

		Assert.assertFalse(employeesList.contains(engineer2));

	}

	@Test
	public void TestAssign() {
		engineer1.assign(engineer1, "Allianz.de");
		Assert.assertEquals("Allianz.de", engineer1.getProjectName());
		System.out.println(manager.displayEmployeeList());
	}

	
}
