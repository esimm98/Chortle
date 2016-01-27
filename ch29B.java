import java.io.*;
import java.util.Scanner;

class SecretCode {
	public static void main(String[] args) {
		Scanner code = new Scanner (System.in);
		String key = code.nextLine();
		String decoded = "";

		while (code.hasNextInt()) {
			decoded += key.charAt(code.nextInt());
		}
		System.out.println(decoded);
	}
}