package Firsttest;

public class Calculator {
public int power(int b,int e)
{
	
	int p=1;
	int i=1;
	if(b==0||e==0)
		return 0;
	else {
		
	
	while (i<=e) {
		
	p*=b;
	i++;
	}
}
	return p;
}



public int factorial(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
		
	}
	return fact;
}



public boolean palindrome(int n)
{
	int rev=0;
	int temp=n;
	int mod=0;
	while(n!=0) {
		mod=n%10;
		rev=rev*10+mod;
		n=n/10;
		
	}
	if(rev==temp)
		return true;
	
	return false;
}
}
