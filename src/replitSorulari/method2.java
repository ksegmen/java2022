package replitSorulari;

public class method2 {

	public static void main(String[] args) {
		//Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

//		Input : Coding is greate.

//		Output : .etaerg si gnidoC
		
		reverse();
		
		
	}

	private static void reverse() {
	
String ters;
		
		String str="Coding is greate.";
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		
	}

}
