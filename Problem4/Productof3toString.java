package pack;

public class Productof3toString extends IsPalindrome {
	public static long theNumber() {
		
		long high = 999;
		long other = 999;
		long num = 0;
		
		String s = String.valueOf( high * other );
		
		boolean palindrome = ForNBack(s);
		while (palindrome == false && other >= 100) {
			other--;
			num = high * other;
			s = String.valueOf( num );
			System.out.println(num);
			palindrome = ForNBack(s);
			if(other == 900) { 
				other = 999; 
				high--;
			}
		}

		if (palindrome) {
			
			System.out.println(high + " * " + other + " = " + s);
		}
		return 0;
	}
}
