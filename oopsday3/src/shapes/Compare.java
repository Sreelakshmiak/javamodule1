package shapes;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		Triangle t1= new Triangle();
		Triangle t2= new Triangle();
		
		//comparing primitives
		int a=10;
		int b=35;
		
		boolean result= (a==b);//are they same or equal
		System.out.println(result);//false
		
		result =r1==r2;
		System.out.println(result);//false
		
		result =t1==t2;
		System.out.println(result);//false
		
		/*
		 * result =r1==t1;//incompactible
		 *  System.out.println(result);//false
		 */	
		Rectangle r3=r1;
		result =r3==r1;
		System.out.println(result);//true
		
		System.out.println(r1.hashCode());
		
		System.out.println(r3.hashCode());
		
		
		System.out.println(r2.hashCode());
		result= r1.equals(r2);// not applicable 
		System.out.println(result);
		
		result= r1.equals(r3);// not applicable 
		System.out.println(result);
		
		r1.setLength(34.5);
		r1.setBreadth(75.45);
		
		r2.setLength(34.5);
		r2.setBreadth(75.45);
		if(r1.getBreadth()==r2.getBreadth() && r1.getLength()==r2.getLength())
			System.out.println("they have same length and breadth");
			
		
		else 
			
			System.out.println("they are not same");
		
		
		t1.setS1(35.5);
		t1.setS2(45.75);
		t1.setS3(65.5);
		
		if(r1.getLength()==t1.getS1())
		{
			System.out.println("they have same length and breadth");
			
		}
		
		else 
			
			System.out.println("they are not same");
		
		
	}

}
