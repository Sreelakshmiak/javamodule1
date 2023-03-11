package Point;

import java.util.Scanner;

public class P2 implements PointIface {
	private int x2;
	private int Y2;
	

	public P2()
	{}
	@Override
	public void draw1() {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//int c=scanner.nextInt();
		System.out.println("enter x2: ");
		int x2=scanner.nextInt();
		System.out.println("enter y2 ");
		int y2=scanner.nextInt();
	}

}
