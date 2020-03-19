package conditionalOperators;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		int x = 4;
		
		switch (x) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thrusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
		default:
			System.out.println("not WEEKday");
		}
	}

}
