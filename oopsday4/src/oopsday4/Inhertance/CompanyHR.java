package oopsday4.Inhertance;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1= new Employee("sree","female",22,101,"reserach",45000);
System.out.println(emp1);

Employee emp2= new Employee("naaja","female",23,102,"reserach",49000);
System.out.println(emp2);

Employee emp3= new Employee("sree","female",22,101,"reserach",45000);
System.out.println(emp3);

Employee emp4= new Employee("Aminaja","female",30,104,"reserach",69000);
System.out.println(emp4);

	if(emp1.equals(emp3))// emp1==emp3)//checking the hash code
	{
		System.out.println("the object are same");
	}
	else
		System.out.println("diffrent");
	}

}
