package source.use.mod;
import Source.mod.HelloWorld;

public class UseHelloWorld {

	public static void main(String[] args) {
		try {
			HelloWorld world=new HelloWorld();
			world.message();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		// TODO Auto-generated method stub

	}

}
