
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class LockedUI {

/*	•	Code to display the welcome screen. It should display:
		•	Application name and the developer details 
		•	The details of the user interface such as options displaying the user interaction information 
		•	Features to accept the user input to select one of the options listed 
*/
	
	public static void displayMenu()
	{
		System.out.println("Welcome to the file application which is developed by Utku Erkasap");
		System.out.println("Please Select one of the options below\n");
		System.out.println("*************************");
		System.out.println("******* MAIN MENU *******");
		System.out.println("*************************");
		System.out.println("**---------------------**");
		System.out.println("**| 1. List all files |**");
		System.out.println("**| 2. File Operations|**");
		System.out.println("**| 3. Quit           |**");
		System.out.println("**---------------------**");
		System.out.println("*************************");
		System.out.println("*************************");
		System.out.println("*************************");
		/* Submenu of modify files
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Seach a File");
		System.out.println("4. Go back to main menu");
		Counter.setY(100);*/
	}
	
	public static void displaySubMenu()
	{

		System.out.println("*************************");
		System.out.println("****File Operations******");
		System.out.println("*************************");
		System.out.println("**---------------------**");
		System.out.println("**| 4. Add a file     |**");
		System.out.println("**| 5. Delete a file  |**");
		System.out.println("**| 6. Seach a file   |**");
		System.out.println("**| 7. Main Menu      |**");
		System.out.println("**---------------------**");
		System.out.println("*************************");
		System.out.println("*************************");
		System.out.println("*************************");

	}
	
	public static void main(String[] args) throws IOException {

	displayMenu();
	Scanner sc = new Scanner(System.in);
	

	LockedService service = new LockedService();

	while(true) { // current context
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: // List all files
		LockedService disp = new LockedService();
		
		disp.ListAllFiles();
		break;
		
		case 2: //Modify Files Sub Menu
		displaySubMenu();
		break;

//				while(true) { // current context
//				displaySubMenu();
//				int choice2 = sc.nextInt();
//				switch(choice2) {
//				
//				case 4:
//				displaySubMenu();
//				break;
//				
//				case 5:
//				displaySubMenu();
//				break;
//				
//				case 6:
//				displaySubMenu();
//				break;
//				
//				case 7:
//				displayMenu();
//				break;
		
//								}
//							}
					
		case 3://Exit
		System.out.println("Bye!");
		System.exit(0);	
		break;
		
		case 4://Add a file
		System.out.println("Add Operation: Please enter the file name: ");
		LockedService addf = new LockedService();
		String addfname = sc.next();
		
		try {//For exception
			addf.AddFile(addfname);
		} catch (IOException e) {
			
			
			try {//added try catch to use Thread.sleep. Because we need a delay time between printstacktrace() and main(args)
				e.printStackTrace();
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			main(args);//after exception message program runs again
		}
		break;
		
		case 5://Delete a file
		System.out.println("Delete Operation: Please enter the file name: ");
		LockedService delf = new LockedService();
		String delfname = sc.next();
		
		try {//For exception
			delf.DeleteFile(delfname);
		} catch (FileNotFoundException e) {
			
			
			try {//added try catch to use Thread.sleep. Because we need a delay time between printstacktrace() and main(args)
				e.printStackTrace();
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			}
			main(args);//after exception message program runs again
		}
		
		break;
		
		case 6://Search a file
		
		System.out.println("Search Operation: Please enter the file name: ");
		LockedService searchf = new LockedService();
		String searchfname = sc.next();
		searchf.SearchFile(searchfname);
		break;
		
		case 7://Back to main menu
		displayMenu();	
		break;
		
		default:
		System.out.println("Selected option could not be found. Please try again.");
			
		
						}
				}
											}
}
