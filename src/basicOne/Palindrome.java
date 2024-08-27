package basicOne;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() -1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		scan.close();
		System.out.println("The string is: " + isPalindrome(input));
		
		
	}

}
