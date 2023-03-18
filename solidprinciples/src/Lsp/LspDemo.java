package Lsp;

public class LspDemo {
public void calculateArea(Shape s)
{
	System.out.println(s.getArea());
}
public static void main(String[] args) {
	
	LspDemo lsp=new LspDemo();
	lsp.calculateArea(new Rectangle (1,4));
	lsp.calculateArea(new squre(5));
}
}
