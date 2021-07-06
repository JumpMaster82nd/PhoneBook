package phonebookproject;

import java.util.Arrays;

public class Directory {

	Person[] phBook = new Person[0];

	public void searchFirstName(String fName) {
		for (int i = 0; i < phBook.length; i++) {
			if (phBook[i].toString().contains(fName)) {
				System.out.println("Here are the list of people with this first name: " + phBook[i]);
			} else {
				System.out.println("No person(s) matched this first name");

			}
		}

	}

	public void searchLastName(String lName) {
		for (int i = 0; i < phBook.length; i++) {
			if (phBook[i].toString().contains(lName)) {
				System.out.println("Here are the list of people with this last name: " + phBook[i]);
			} else {
				System.out.println("No person(s) matched this last name");

			}
		}

	}

	public void searchStreet(String street) {
		for (int i = 0; i < phBook.length; i++) {
			if (phBook[i].toString().contains(street)) {
				System.out.println("Here are the list of people who match this street address: " + phBook[i]);
			} else {
				System.out.println("No person(s) matched this street address");

			}
		}

	}

	public void searchCity(String city) {
		for (int i = 0; i < phBook.length; i++) {
			if (phBook[i].toString().contains(city)) {
				System.out.println("Here are the list of people who live in this city: " + phBook[i]);
			} else {
				System.out.println("No person(s) matched this city");

			}
		}

	}

	public void searchState(String state) {
		for (int i = 0; i < phBook.length; i++) {
			if (phBook[i].toString().contains(state)) {
				System.out.println("Here are the list of people who live in this state: " + phBook[i]);
			} else {
				System.out.println("No person(s) matched this state");

			}
		}

	}

	public void searchPhoneNumber(String phone) {
		for (int i = 0; i < phBook.length; i++) {
			if (phBook[i].toString().contains(phone)) {
				System.out.println("Here are the list of people with this phone number: " + phBook[i]);
			} else {
				System.out.println("No person(s) matched this phone number");

			}
		}

	}

	public void removeContact(String remove) {
		Person[] perRemove = new Person[phBook.length - 1];

		int a = 0;

		for (int i = 0; i < phBook.length; i++) {
			if (!phBook[i].toString().contains(remove)) {
				perRemove[a] = phBook[i];
				a++;
			}
		}
		phBook = perRemove;
	}

	public void printAll() {
		String[] printAll = new String[phBook.length];

		for (int i = 0; i < phBook.length; i++) {
			printAll[i] = phBook[i].getFullName();
		}
		Arrays.sort(printAll);

		for (int j = 0; j < printAll.length; j++) {
			for (int k = 0; k < phBook.length; k++) {
				if (printAll[j] == phBook[k].getFullName()) {
					System.out.println(phBook[k]);
				}
			}
		}
	}

	public void addNewContact(Person addPerson) {

		Person[] tempArray = new Person[phBook.length + 1];

		for (int i = 0; i < phBook.length; i++) {
			tempArray[i] = phBook[i];
		}

		tempArray[tempArray.length - 1] = addPerson;

		phBook = tempArray;

	}

}
