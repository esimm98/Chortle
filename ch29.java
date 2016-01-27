import java.io.* ;
import java.util.Scanner;

class Title {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "John";
		while( name.length() > 0 ) {
			System.out.println("Please enter your name:");
			name = input.nextLine().trim();
			if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
				System.out.println("Ms. " + name);
			} else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
				System.out.println("Mr. " + name);
			} else {
				System.out.println(name);
			}
		}
	}
}

class Microwave {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cook time --> ");
		String time = input.nextLine();

		if(time.length() == 0) {
			time = "0:00";
		} else if(time.length() == 1) {
			time = "0:0" + time;
		} else if(time.length() == 2) {
			int sec = Integer.valueOf(time.substring(time.length() - 2));
			if (sec >= 60) {
				time = "1:" + (sec - 60);
			} else {
				time = "0:" + time;
			}
		} else {
			int sec = Integer.valueOf(time.substring(time.length() - 2));
			int min = Integer.valueOf(time.substring(0, time.length() - 2));

			if (sec >= 60) {
				min += 1;
				sec -= 60;
			}
			time = min + ":" + sec;
		}

		System.out.println("Your time --> " + time);
	}
}

class Stripper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean shouldPrint = false;

		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.startsWith("/*")) { shouldPrint = true; }
			if (line.startsWith("*/")) { shouldPrint = false; }

			if (shouldPrint || line.startsWith("//") || line.startsWith("*/")) {
				System.out.println(line);
			}
		}
	}
}

class PasswordChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean okay = false;

		System.out.print("Your password must be:\n" + "- At least 7 characters long\n"
			+ "- Contain both upper and lower case letters\n" + "- Contain at least 1 number\n");

		while( !okay ) {
			System.out.println("Enter your password:");
			String password = input.next();
			if (password.length() >= 7 && !password.equals(password.toUpperCase())
				&& !password.equals(password.toLowerCase()) && hasNumber(password)) {
				okay = true;
			}
			if (!okay) { System.out.println("That password is not acceptable."); }
		}
		System.out.println("Acceptable password.");
	}

	public static boolean hasNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) { return true; }
		}
		return false;
	}
}