package UserDefindObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee emp1= new Employee("sree","female",22,101,"reserach",45000);
		//System.out.println(emp1);

		Employee emp2= new Employee("naaja","female",23,102,"reserach",49000);
		//System.out.println(emp2);

		Employee emp3= new Employee("sree","female",22,101,"reserach",45000);
		//System.out.println(emp3);

		Employee emp4= new Employee("Aminaja","female",30,104,"reserach",69000);
		//System.out.println(emp4);
		ArrayList<Employee> empList =new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		HashSet<Employee> empSet =new HashSet<Employee>();
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		
		TreeSet<Employee> empSet1 =new TreeSet<Employee>();
		empSet1.add(emp1);
		empSet1.add(emp2);
		empSet1.add(emp3);
		empSet1.add(emp4);
		
		HashMap<String,Collection> dataMap =new HashMap<>();
		dataMap.put("empList",empList);
		dataMap.put("empTreeSet",empSet);
		dataMap.put("empSet", empSet1);
		
		System.out.println(dataMap);
		
		
		
		Collection<Employee> list= dataMap.get("empList");
		Iterator<Employee>iter=list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		Collection<Employee> set=dataMap.get("empset");
		iter= set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		Collection<Employee>Tree=dataMap.get("empTreeSet");
		iter=Tree.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}