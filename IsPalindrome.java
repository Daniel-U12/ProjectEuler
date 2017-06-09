package pack;

// This program checks to see if a String is a Palindrome used to Solve Project Euler Problems

public class IsPalindrome {
	public static boolean ForNBack ( String s ) {
		int n = s.length() - 1;
		char[] c = s.toCharArray();
		boolean palindrome = false;
		
		for( int i = 0; i < s.length()/2 + 1; i++ ) {
			if ( c[i] == c[n] ) {
				palindrome = true;
			}
			else {
				palindrome = false;
				break;
			}
			n--;
		}
		if( palindrome ) {
			System.out.println("This is a palindrome");
		}
		else { 
			System.out.println("This is not a palindrome");
		}
		return palindrome;
	}
}
