package oopsday4.composition;

public class Employee extends Person {
	private long empId;
	private String deptno;
	private double salary;
	private Adress residenceDaddress;//has a 
	private Adress correspondanceAddress;
	
	
	public Employee(String name, String gender, int age,long empId, String deptno, double salary, Adress residenceDaddress, Adress correspondanceAddress) {
		super(name, gender, age);
		
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
		this.residenceDaddress = residenceDaddress;
		this.correspondanceAddress = correspondanceAddress;
	}


	public Adress getResidenceDaddress() {
		return residenceDaddress;
	}


	public void setResidenceDaddress(Adress residenceDaddress) {
		this.residenceDaddress = residenceDaddress;
	}


	public Adress getCorrespondanceAddress() {
		return correspondanceAddress;
	}


	public void setCorrespondanceAddress(Adress correspondanceAddress) {
		this.correspondanceAddress = correspondanceAddress;
	}


	public Employee(long empId, String deptno, double salary) {
		super();
		this.empId = empId;
		this.deptno = deptno;
		this.salary = salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String gender, int age, long empId, String deptno, double salary) {
		super(name, gender, age);
		this.empId=empId;
		this.deptno=deptno;
		this.salary=salary;
		// TODO Auto-generated constructor stub
		
		
	}


	public long getEmpId() {
		return empId;
	}


	public void setEmpId(long empId) {
		this.empId = empId;
	}


	public String getDeptno() {
		return deptno;
	}


	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee ref=null;
		if(obj!=null)
			ref=(Employee)obj;
	
		if(ref.getEmpId()==this.empId && 			
			ref.getName().equals(this.getName())&&
					ref.getDeptno()==this.deptno)

		return true;
		
		else
			return false;
		
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int code=this.hashCode()*
				32*(int)this.empId*
				this.getName().length()*
				this.deptno.length();
		
		return super.hashCode();
		//return super.hashCode();
	}
	
}
