package test;

import mypersons.Person;
import mypersons.Child;
import mypersons.Adult;

import java.util.Scanner;

public class PersonTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Person Person1 = readPerson();
		Person Person2 = readPerson();

		if (Person1 instanceof Adult) {
			System.out.println("Person1 is adult! \nDatas: " + Person1.toString());
		}
		if (Person1 instanceof Child) {
			System.out.println("Person1 is child! \nDatas:" + Person1.toString());
		}
		if (Person2 instanceof Adult) {
			System.out.println("Person1 is adult! \nDatas:" + Person2.toString());
		}
		if (Person2 instanceof Child) {
			System.out.println("Person1 is child! \nDatas:" + Person2.toString());
		}

	}

	public static String readString() {

		String text = sc.nextLine();
		return text;
	}

	public static int readInt() {
		int number = -1;
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Wrong input!");
				sc.next();
			}
			number = sc.nextInt();
		} while (number < 0);
		sc.nextLine();
		return number;
	}

	public static Person readPerson() {
		System.out.println("Give me the name:");
		String name = readString();
		System.out.println("Give me the age:");
		int age = readInt();
		if (age < 18) {
			System.out.println("Give me the school:");
			String school = readString();
			Child pers = new Child();
			pers.setDatas(name, age, school);
			return pers;
		} else {
			System.out.println("Give me the workspace:");
			String workspace = readString();
			Adult pers = new Adult();
			pers.setDatas(name, age, workspace);
			return pers;
		}
	}
}
