package week_2;

public class Switch {

	public static void main(String[] args) {
	
		/*
		 * Day 0 ---> Sunday
		 * Day 1 ---> Monday
		 * Day 2 ---> Tuesday
		 * Day 3 ---> Wednesday
		 * Day 4 ---> Thursday
		 * Day 5 ---> Friday
		 * Day 6 ---> Saturday
		 */
		
	//	int day = 50;
	//	String str = "";
		
	//	if (day==0) {
	//		str = "sunday";
	//	}else if (day==1){
	//		str = "Monday";
	//	}else if(day==2){
	//		str = "Tuesday";
	//	}else if (day==3){
	//		str = "Wednesday";
	//	}else if (day==4){
	//		str = "Thursday";
	//	}else if (day==5){
	//		str = "Friday";
	//	}else if (day == 6){
	//		str = "Sunday";
	//	}else {
	//		str = "Invaild day";
	//	}
	//	System.out.println(str);
		
		int day = 50;
		String str ="";
		day = 0;
		System.out.print("Hello, today is ");
		switch(day) {
		case 0: 	
		System.out.print("Sunday");
		break;
		case 1:	
		System.out.print("Monday");
		break;
		case 2:
		System.out.print("Tuesday");
		break;
		case 3:
		System.out.print("Wednesday");
		break;
		case 4:
		System.out.print("Thursday");
		break;
		case 5:
		System.out.print("Friday");
		break;
		case 6:
		System.out.print("Saturday");
		break;
		default: 
		System.out.print("Invalid Day");	
		}
		
		
		
	}

}
