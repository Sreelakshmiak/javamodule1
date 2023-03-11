package Point;

import java.util.Scanner;

public class P1 implements PointIface {
	private double x1;
	private double Y1;
	public P1()
	{
	
		
	}
	
	@Override
	public void draw1() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//int c=scanner.nextInt();
		System.out.println("enter x1: ");
		int x1=scanner.nextInt();
		System.out.println("enter y1 ");
		int y1=scanner.nextInt();
		
	}

}
