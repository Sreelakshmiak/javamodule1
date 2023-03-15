package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Adress resAddress=new Adress("31","mannath","worli","mumbai",1234);
	Adress commAdd=new Adress("32","kannur","pmg","kerala",12234);
	
	
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
