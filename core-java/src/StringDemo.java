
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";				// String pool
		String s2 = new String("Hello");	// Heap memory area
		String s3 = "Hello";				// String pool
		
		// Compares memory locations
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Comparing values of strings
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));	// index of first occurrence
		System.out.println(s1.lastIndexOf('o'));// index of last occurrence
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		System.out.println(s1.replace('o', 'a'));
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] days = week.split("-");
		for (String day : days) {
			System.out.println(day);
		}
		
		// There are 3 'l' in 'HelloWorld' print index of all 3 occurrences
		
	}
}
