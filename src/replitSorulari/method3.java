package replitSorulari;

public class method3 {

	public static void main(String[] args) {
		//Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

		//input : ade1r4d3

		//output : 8

		  //   Hint :
		   //  Use Character.isDigit()
		    // Integer.valueOf()
		    
		
		/*int l = stng.length();
		  int sum = 0;
		  for (int i = 0; i < l; i++) 
		  {
		    if (Character.isDigit(stng.charAt(i))) 
			{
		      String tmp = stng.substring(i,i+1);
		      sum += Integer.parseInt(tmp);
		    }
		  }
		*/
		
		
		sumOfDigit();
		
}

	private static void sumOfDigit() {
		String str="ade1r4d3";
        int x=str.length();
        int sum=0;
        for (int i = 0; i < x; i++) {
			if (Character.isDigit(str.charAt(i))) {
				String str2=str.substring(i,i+1);
				sum+=Integer.parseInt(str2);
			}
		}
		
	}
}
