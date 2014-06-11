package org.beh.gamedev;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testCreateEmployee() {
		Employee e = new Employee("94,0,\"Kairo君\",\"Kairo\",32,20,6,9000,65536,45,30,200,200,200,200,5,7,0,3,3,5,2,2,2,5,5,\"感谢你发现我!!\"");
		System.out.println(e);
	}

}
