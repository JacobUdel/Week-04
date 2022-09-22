import java.util.*;
public class Application {

	public static void main(String[] args) {
		String a = new String("Hello");
		String b = new String("Hello");
		String c = "Hello";
		String d = "Hello";
		System.out.println("String a: " + a);
		System.out.println("String b: " + b);
		System.out.println("String c: " + c);
		System.out.println("String d: " + d);
		System.out.print("a == b: ");
		System.out.println(a == b); //FALSE! This is coming out true if Strings are setup w/o new e.g. String a = "Hello";
		System.out.print("a.equals(b) ");
		System.out.println(a.equals(b)); //TRUE!
		System.out.print("c == d: ");
		System.out.println(c == d); //TRUE! This is coming out true if Strings are setup w/o new e.g. String a = "Hello";
		System.out.print("c.equals(d) ");
		System.out.println(c.equals(d)); //TRUE!
		
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		System.out.println(firstName.concat(lastName));
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
	//	System.out.println(fullName.deleteCharAt(5));
	//	System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4,  9, "Tompson"));
		System.out.println(fullName.reverse());
		
		System.out.print("testing\n");
		System.out.println("testing");
		
		//List<E> list of E where E is the generic that will be replaced with a type
		//List<String> reads as "list of String"
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		//sports.remove(1);
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
	}
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();;
		for (int i = 0; i < num; i++) {
			result.append(str);;
		}
		return result.toString();
	}

}
