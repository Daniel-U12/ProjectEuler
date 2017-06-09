package pack;

public class SearchForElement {
	public static void ThereOrNaw ( String s, String s2 ){ 
		
		String[] words = s.split("\\s");
		for (int i = 0; i < words.length; i++) {
		    //This replaces all non-word characters with whatever the second argument is
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		/*
		 * This Compares whether or not the element exists within the String
		 */
		for ( int i = 0; i < words.length; i++) {
			if( s2.equals(words[i]) ) {
				System.out.println("Found");
			}
		}
	}
}
