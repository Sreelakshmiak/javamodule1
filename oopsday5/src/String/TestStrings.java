package String;

public class TestStrings {

	public static void main(String[] args) {
//		byte bytes[]= {65,66,67,68,98};
//		
//		String str=new String(bytes);
//		System.out.println(str.length());
//		System.out.println(str);
//		str="welcome to ust global";//letters are converted in to bytes
//		
//		bytes=str.getBytes();
//		for(byte b:bytes) {
//			System.out.println(b);
//		}
//		char chars[]= {'U','S','T',' ','G'};
//		str = new String(chars);
//		System.out.println(str);
//		
//		str.getChars(0,chars.length-1, chars, 0);
//		for(char c:chars) {
//			System.out.println(c);
//		}
//		
//	int count=0;	
//	String string=new String("She sells.sea shells in Sea Shore");
//	for(int i=0;i<string.length();i++)
//	{
//		if(string.charAt(i)=='s'||string.charAt(i)=='S')
//		{
//			count++;
//			//System.out.println();
//		}
//	}
//	
//	
//	System.out.println(count);
	
	String string=new String("She sells. sea shells in Sea Shore");
	String words[]=string.split("[.]");
	
	System.out.println(words.length);
	//System.out.println(words);
	for(String word:words)
	{
		System.out.println(word);
	}
	
	string=new String("cartoon");

	System.out.println(string.startsWith("car"));
	System.out.println(string.endsWith("toon"));
	
	int apos=string.indexOf('a');
	int tpos=string.indexOf('t');
	
	String string2=string.substring(apos,tpos);
	System.out.println(string2);
	string2=string.substring(tpos);
	System.out.println(string2);
			
	
	
	string=new String("madamdam");
	//int mpos=-1;
	int dpos=string.lastIndexOf('d');
	//System.out.println(string2);
	string2=string.substring(dpos,string.length());
	System.out.println(string2);
	
	
	string=new String("sree.ak@ust.com");
	//int mpos=-1;
	int dpos1=string.lastIndexOf('.');
	//System.out.println(string2);
	string2=string.substring(dpos1+1,string.length());
	System.out.println(string2);
	
	String str1=new String ("welcome");
	String str2=new String ("WELCOME");
	
	boolean result=str1.equals(str2);//equals method is over written by the string class
	
	
	boolean result5=str1.equalsIgnoreCase(str2);
	System.out.println(result);
	System.out.println(result5);
	
	
	
	String str3=new String ("WELCOME");
	String str4=new String ("WELCOME");
	
	boolean result1=str3.equals(str4);//equals method is over written by the string class
	System.out.println(result1);
	
	
	
	
	int val=str3.compareTo(str4);//output is 0 when the two strings are equal 
	System.out.println(val);
	
	string ="Diehard";
	
	
	System.out.println(string.toLowerCase());
	System.out.println(string);
	System.out.println(string.toUpperCase());
	System.out.println(string);
	//string is immutable
	string ="16-11-477/6/A/3 Hyderabad 50036";
	
	//Character.isAlphabetic(string);
	char c=0;
	int digit=0;
	int alphabetic=0;
	int count=0;
	int space=0;
	
	
	for(int i=0;i<string.length();i++)
	{
c=string.charAt(i);
//		if(c>='0'&&c<='9')
//		{
//			count++;
//		}
		
		if(Character.isDigit(c))
		{
			digit++;
		}
		else if (Character.isAlphabetic(c)) {
			alphabetic++;
		
		}
		else if(Character.isSpaceChar(c))
			space++;
		else 
			count++;
			
		
	}
	System.out.println(digit);	
	System.out.println(alphabetic);	
	System.out.println(space);
	System.out.println(count);	
}
	
}



//dinomination
//how much they want
//re enter - 2(do and while loop)
//10$ 20 Dispensed

