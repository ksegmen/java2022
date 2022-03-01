package replitSorulari;

import java.util.Arrays;

public class method4 {

	public static void main(String[] args) {
		//Create a custom return type method accepts a name as parameter and prints the name as a char array.

				//(do not use toCharArray() method)

			//	Input : John

			//	Output :[J, o, h, n]
		charArray();
		
		
		

	}

	private static void charArray() {
		String name="John";
		String[] ch=name.split("");
		System.out.println(Arrays.toString(ch));
		
	}

}
