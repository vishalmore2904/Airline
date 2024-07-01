package String;

public class StringUtil  {

	// Method to count the occurrences of a character in a string
	    public static int countOccurrences(String str, char ch) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (c == ch) {
	                count++;
	            }
	        }
	        return count;
	    }
	 // Method to reverse a given string
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }
	 // Method to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        String reversed = reverseString(str);
	        return str.equals(reversed);
	    }
	 // Method to capitalize the first letter of each word in a string
	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");   //Split the string into words based on spaces
	        StringBuilder capitalized = new StringBuilder();//Initialize a StringBuilder to construct the capitalized
	        for (String word : words) {
	            if (word.length() > 0) {
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                        .append(word.substring(1).toLowerCase()).append(" ");
	            }
	        }
	        return capitalized.toString().trim(); // Convert the StringBuilder to a string and remove trailing spaces
	    }
	}

