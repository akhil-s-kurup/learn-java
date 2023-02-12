package learning.logical.test;

public class CharacterMatchingRegex {
	
	public static void main(String[] args) {
		
		String fullTxt="abc def ghijklm";
		boolean matches = fullTxt.matches(".*[a].*");
		System.out.println(matches);
		
		matches = fullTxt.matches(".*[z].*");
		System.out.println(matches);
		
	}

}
