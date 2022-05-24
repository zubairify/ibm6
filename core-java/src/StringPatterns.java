
public class StringPatterns {

	public static void main(String[] args) {
		
		String name = "Polo";
		// Name must have first char in caps and min length should be 4
		String namePattern = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(namePattern));
		
		String mobile = "7438203993";
		// Mobile no must start with 7-9 and length should be 10
		String mobilePattern = "[7-9][0-9]{9}";
		System.out.println(mobile.matches(mobilePattern));
		
		String cc = "4382293458491203";
		String ccPattern = "[0-9]{16}";
		
		String email = "polo@email.com";
		String emailPattern = "[a-zA-Z0-9+_.]+@[a-z0-9.]+[a-z]{2,}";
		
	}
}
