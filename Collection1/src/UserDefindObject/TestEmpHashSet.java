package UserDefindObject;

import java.util.HashSet;
import java.util.List;

public class TestEmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> empSet =new HashSet<Employee>();
		
		Employee emp1= new Employee("sree","female",22,101,"reserach",45000);
		//System.out.println(emp1);

		Employee emp2= new Employee("naaja","female",23,102,"reserach",49000);
		//System.out.println(emp2);

		Employee emp3= new Employee("sree","female",22,101,"reserach",45000);
		//System.out.println(emp3);

		Employee emp4= new Employee("Aminaja","female",30,104,"reserach",69000);
		//System.out.println(emp4);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		System.out.println(empSet.size());
	}
	}


