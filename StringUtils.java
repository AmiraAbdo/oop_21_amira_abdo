package main;

public class StringUtils {
	
	
	public static boolean included(String original, String userinput) {
		userinput= userinput.trim();
		userinput= userinput.toUpperCase();
		original= original.toUpperCase();
		if(original.contains(userinput)) {
			return true;
		}
		else return false;
	}
}
