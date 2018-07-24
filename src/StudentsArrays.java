import java.util.Scanner;

public class StudentsArrays {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int userStudentRow = -1;
		String userInfoChoice = null;
		boolean infoInput;
		String response = "n";
		
		System.out.println("Welcome to our Java class. ");
		

		do {

		//Validation for the number.
		userStudentRow = Validator.getInt(scan,"Which student would you like to learn more about? (enter a number 1-15) ", 1, 15) -1;
		
		//scan.nextLine();
		
		//Students name
		String studentName = getInfo(userStudentRow, 0);
		System.out.println(studentName);

		do {
			infoInput = true;
			System.out.println("What would you like to know about " + studentName
					+ "? (enter or \"hometown\" or \"favorite food\"):");
			userInfoChoice = scan.nextLine();
			if (userInfoChoice.equalsIgnoreCase("hometown")) {
				//Student hometown
				System.out.println(getInfo(userStudentRow, 1));
			} else if (userInfoChoice.equalsIgnoreCase("favorite food")) {
				//Student favorite food
				System.out.println(getInfo(userStudentRow, 2));
			} else {
				System.out.println("That data does not exist. Please try again.");
				infoInput = false;
			} 
		} while (infoInput == false);
		System.out.println("Would you like to know more? (enter \"yes\" or \"no\")");
		response = scan.nextLine();
		
		} while (response.equalsIgnoreCase("y"));
		
		
		
		System.out.println("Goodbye!");
		
		}

	private static String getInfo(int userStudentRow, int userInfoColumn) {

		//String array with 15 rows and 3 columns
		//Row ? Column 0 = Names
		//Row ? Column 1 = Hometown
		//Row ? Column 2 = Favorite Food
		String[][] studentsArray = {{"Janice", "Janice is from Detroit.", "Her favorite food is french fries."},
									{"Cheo", "Cheo is from Detroit.", "His favorite food is steak."},
									{"Julia", "Julia is from Elk Rapids.", "Her favorite food is french fries."},
									{"Alexander", "Alexander is from Chelsea.", "His favorite food is chocolate."},
									{"Brandon", "Brandon is from ?.", "His favorite food is ?."},
									{"Joseph", "Joseph is from Deaborn.", "His favorite food is pasta."},
									{"Jacob", "Jacob is from DeForest.", "His favorite food is pizza"},
									{"John", "John is from Detroit", "His favorite food is sushi"},
									{"Michele", "Michele is from Hong Kong", "Her favorite food is sushi"},
									{"Matthew", "Matthew is from Virginia Beach", "His favorite food is french fries"},
									{"Kaelan", "Kaelan is from Rochester Hills", "His favorite food is flavored popcorn"},
									{"Tiffany", "Tiffany is from Detroit", "Her favorite food is black olives"},
									{"Camila", "Camila is from Belo Horizonte", "Her favorite food is chocolate"},
									{"Antonella", "Antonella is from Detroit", "Her favorite food is lasagna"},
									{"Ben", "Ben is from Georgetown", "His favorite food is pizza"}};
		
		String requestedInfo = studentsArray[userStudentRow][userInfoColumn];
		
		return requestedInfo;
	}
		
		
	}


