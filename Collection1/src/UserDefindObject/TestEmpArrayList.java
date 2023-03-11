package UserDefindObject;

import java.util.ArrayList;

public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList =new ArrayList<Employee>();
		
		Employee emp1= new Employee("sree","female",22,101,"reserach",45000);
		//System.out.println(emp1);

		Employee emp2= new Employee("naaja","female",23,102,"reserach",49000);
		//System.out.println(emp2);

		Employee emp3= new Employee("sree","female",22,101,"reserach",45000);
		//System.out.println(emp3);

		Employee emp4= new Employee("Aminaja","female",30,104,"reserach",69000);
		System.out.println(emp4);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println(empList);
	}

}
