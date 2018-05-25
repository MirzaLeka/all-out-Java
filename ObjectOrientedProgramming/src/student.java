
class student {
String name;
String city;
String school;
int age;
int grade;

public void introduce() {
	
	if (grade == 0) {
			System.out.println("My name is " + name + "\n"
					+ "and I'm " + age + " years old.\n"
							+ "I'm from " + city + " and I go to " + school + ".\n"
									+ "I'm too young to go to school.");
	}
	
	else {
		System.out.println("My name is " + name + "\n"
				+ "and I'm " + age + " years old.\n"
						+ "I'm from " + city + " and I go to " + school + ".\n"
								+ "I go to " + grade + ". grade.");
	}

}

public void Nos() {
	
	school = "SMTŠ";
	System.out.println("My highschool is " + school);
	// znaèi ne trebam unutar argumenta pisati school jer je school varijabla pripada klasi, pa datu metodu pozivam preko objekta.
	
}

public void Loop(int limit) {
	
	for (int counter = 0; counter < limit; counter++) {
		System.out.println(counter);
	}
	


}

/*public static boolean stolica()  {
	return false;
} */
	
public boolean monitor() {

	return true;
}

}
