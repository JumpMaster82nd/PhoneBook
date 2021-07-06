package phonebookproject;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Directory phBook = new Directory();

		Scanner in = new Scanner(System.in);
		
		boolean quit = false;
		
		while (!quit) {
			System.out.println("Press 0 to view options:");
			int enter = in.nextInt();
			in.nextLine();
			
			
			switch (enter) {
			
			case 0:
				printMenu();
				break;

			case 1:
				System.out.println("Add a new entry to the phone book in this format: "
						+ "John Doe, 114 Market St, St Louis, MO, 63403, (636)643-5698");
				String contactAdd = in.nextLine();
				String[] entry = contactAdd.split(",");
				
				Person addPerson = new Person(entry[0], entry[1], entry[2], entry[3], entry[4], entry[5]);
				phBook.addNewContact(addPerson);
				if(addPerson != null) {
					System.out.println("New person added successfully! " + addPerson);
				}
				break;

			case 2:
				System.out.println("Enter first name to be searched");
				String fName = in.nextLine();
				phBook.searchFirstName(fName);
				break;

			case 3:
				System.out.println("Enter last name to be searched");
				String lName = in.nextLine();
				phBook.searchLastName(lName);
				break;

			case 4:
				System.out.println("Enter phone number to be searched");
				String phone = in.nextLine();
				phBook.searchPhoneNumber(phone);
				break;

			case 5:
				System.out.println("Enter city name to be searched");
				String city = in.nextLine();
				phBook.searchCity(city);
				break;

			case 6:
				System.out.println("Enter last name to be searched");
				String state = in.nextLine();
				phBook.searchState(state);
				break;

			case 7:
				System.out.println("Enter users phone number to be deleted");
				String phoneNum = in.nextLine();
				phBook.searchPhoneNumber(phoneNum);
				break;

			case 8:
				System.out.println("Showing all contacts:");
				phBook.printAll();
				break;
				
			case 9:
				System.out.println("Exiting!Thanks for using the phonebook");
				quit = true;
				break;

			}
		

		}
		in.close();
	}

	public static void printMenu() {
		System.out.println("*******************************************");
		System.out.println("Enter 1 to add a new entry to the phonebook:");
		System.out.println("*******************************************");
		System.out.println("Enter 2 to search using first name:");
		System.out.println("*******************************************");
		System.out.println(" Enter 3 to search using last name:");
		System.out.println("*******************************************");
		System.out.println("Enter 4 to search using phone number:");
		System.out.println("*******************************************");
		System.out.println("Enter 5 to search by city:");
		System.out.println("*******************************************");
		System.out.println("Enter 6 to search by state:");
		System.out.println("*******************************************");
		System.out.println("Enter 7 to delete a contact:");
		System.out.println("*******************************************");
		System.out.println("Enter 8 to show all contacts:");
		System.out.println("*******************************************");
		System.out.println("Enter 9 to EXIT:");
		System.out.println("*******************************************");
	}

}