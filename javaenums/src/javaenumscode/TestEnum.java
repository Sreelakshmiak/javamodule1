package javaenumscode;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DayOfWeek today=DayOfWeek.SATURDAY;
System.out.println("today is"+ today.getName());
switch(today)
{
case MONDAY:
	System.out.println("work hard");
	break;
	
case TUESDAY:
	System.out.println("work hard");
	break;
	
case WEDNESDAY:
	System.out.println("work work little more");
	break;
	
case THURSDAY:
	System.out.println("work work more, weekend is around soon");
	break;
	
case FRIDAY:
	System.out.println("yeah weekend has arrived, party hard");
	break;
	
case SATURDAY:
	System.out.println("enjoy morning coffee, go shopping");
	break;

case SUNDAY:
    System.out.println("do all cleaning works.........");
}
	}

}
