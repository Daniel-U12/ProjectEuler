package pack;

public class SearchForLongestElement {
	public static String largestElement( String s ) {
		/* *******************************************************************************
		 * This Converts a line String into an Array of Strings, so that each word occupies
		 * an index
		 *********************************************************************************/
			String[] words = s.split("\\s+");
			for (int i = 0; i < words.length; i++) {
			    // You may want to check for a non-word character before blindly
			    // performing a replacement
			    // It may also be necessary to adjust the character class
			    words[i] = words[i].replaceAll("[^\\w]", "");
			}
			
		/* *******************************************************************************
		 *This displayed how long each word is.
		 *********************************************************************************/
			for ( int i = 0; i < words.length; i++ ){
				for ( int j = 0; j < words.length; j++ ){
					if( words[j].length() < words[i].length() ) {
						String temp = words[i];
						words[i] = words[j];
						words[j] = temp;
					}
				}
			}
			return(words[0]);
	}
}
