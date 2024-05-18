package dioProjetos;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text;

		System.out.print("Type a message: ");
		text = sc.next();

		System.out.println(text);
		sc.close();
	}

}
