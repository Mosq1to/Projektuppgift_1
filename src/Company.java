
import java.util.Scanner;

/**
 * 
 */

/**
 *
 * This program is created to Add/edit and remove employees in an company
 * @author MSINGH2
 *
 */
public class Company {

	/**
	 * Main method where to select choice
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showActions();
		EmployeeController controller = new EmployeeController();

		Boolean quit = false;
		while (!quit) {

			System.out.println("Gör ditt val: ");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();

			switch (choice) {

				case 1:
				    controller.addWhiteCollor();
				    showActions();
					break;
                case 2:
                    controller.editEmployee();
                    showActions();
					break;
				case 3:
                    controller.removeEmployee();
					showActions();
					break;
				case 4:
                    controller.showAllEmployee();
                    showActions();
					break;
				case 5:

				    showActions();
					break;
				case 6:
					quit = true;
					break;
				default:
					System.out.println("Du har inte valt ett valid val, välj om");
			}


		}

	}

	/**
	 * Method to show all the actions
	 */
	public static void showActions(){
	
		System.out.println("Välj ett av Alternativen:");
		System.out.println("1. Lätt till anställd");
		System.out.println("2. Editera anställd");
		System.out.println("3. Remove anställd");
		System.out.println("4. Lista anställd");
		System.out.println("5. Lista om Alternativen");
		System.out.println("6. Stäng av programet");
	}
	


}
