package practiceday3_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

       String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       
       char A=str.charAt(str.indexOf("A"));
      char L= str.charAt(str.indexOf("L"));
     char i=  str.toLowerCase().charAt(str.indexOf("I"));
       System.out.println("ALi :" + A + " " + L + " " + i);
       
       
       
    }

}
