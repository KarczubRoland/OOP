package test;

import mypersons.Employee;
import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;

import java.util.Arrays;
import java.util.Scanner;

public class Run {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Person Person1 = readPerson();
		// Person Person2 = readPerson();

		if (Person1 instanceof Child) {
			System.out.println("Person1 is child! \nDatas: " + Person1.toString());
		} else if (Person1 instanceof Adult) {
			if (Person1 instanceof Employee) {
				System.out.println("Person1 is Employee! \nDatas:" + Person1.toString());
			} else {
				System.out.println("Person1 is adult and Employee! \nDatas: " + Person1.toString());
			}
		}
		System.out.println("Give me the n value!");
		int n = readInt();
		Person[] array = new Person[n];
		fillup(n, array);

		Arrays.sort(array, (a, b) -> a.getAge() - b.getAge());
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
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
			if (workspace.isEmpty()) {
				Adult pers = new Adult();
				pers.setDatas(name, age, workspace);
				return pers;
			} else {
				System.out.println("Give me the salary! ");
				int salary = readInt();
				Employee pers = new Employee();
				pers.setDatas(name, age, workspace, salary);
				return pers;
			}
		}
	}

	public static void fillup(int n, Person[] array) {
		for (int i = 0; i < n; i++) {
			array[i] = readPerson();
		}
	}
}
