package Testlambdas;
@FunctionalInterface
interface Shape
{
	double area();
}

interface Math
{
	double power(int a, int e);
}

interface Fact
{
int fact(int f);
}



public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
		
		Thread t1=new Thread(r1);
		
		t1.start();
		
		
		Runnable r=()->{
			for(int i=1;i<5;i++)
			{
				System.out.println("in run method"+i);
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		Math m=(int b,int e)->{
			int p=1;
			for(int i=1;i<=e;i++)
			{
				p*=b;
			}
			return p;
		};
		double power=m.power(2, 3);
		System.out.println(power);
		

Fact fa=(int f)->{
	
	int f1=1;

for(int i=1;i<=f;i++) {

	 f1=f1*i;
}
	
	return f1;
}	;
int factorial=fa.fact(5);
System.out.println(factorial);
		

		
		
		
		Shape s=()->{
	return 0.0;
		};
double result=s.area();
System.out.println(result);



	}

	}

