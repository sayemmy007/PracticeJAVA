package testDemo;

public class SwitchCondition {

	public static void main(String[] args) {
		
		int month = 4;
		String monthString;
		
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "Feb";
			break;
		case 3:
			monthString = "Mar";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		default:
			monthString = "invalid Month";
			break;
		}
		
		System.out.println(monthString);
	}
}


