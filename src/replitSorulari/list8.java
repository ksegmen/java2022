package replitSorulari;

public class list8 {

	public static void main(String[] args) {
		/*
		 * Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

Input :

I love Java.

Output:

Reversed sentence : avaJ evol I. It is not a palindrome"
		 * 
		 * 
		 * 
		 */
		
		
		StringBuilder sb = new StringBuilder("I love Java");
		sb.reverse();
		System.out.println(sb);
		if (sb.equals(sb.reverse())) {
			System.out.println(sb.reverse() + ". It is not a palindrome");
		}

	}

}
