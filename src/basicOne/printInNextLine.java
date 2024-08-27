package basicOne;

import java.util.Scanner;

public class printInNextLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextInt()) {
			int number = scan.nextInt();
			System.out.println(number);
		}
		scan.close();
	}

}
