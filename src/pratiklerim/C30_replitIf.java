package pratiklerim;

import java.util.Scanner;

public class C30_replitIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("lutfen boynuzu ve kilonuzu giriniz");
		   double kilo=scan.nextDouble();
		  double boy=scan.nextDouble();
		   double bmi=kilo/(boy*boy);

		   
		   if (bmi<=18.5) {
		     System.out.println    ( "1." + "Bmi :" +  bmi  );
		     System.out.println("2." + "Zayifsiniz");
		   } else if (bmi<=25) {
		     System.out.println( "1." + "Bmi :" + bmi );
		     System.out.println( "2. " +"Kilonuz idealdir ");
		   } else if (bmi<30) {
		     System.out.println("1." + "Bmi :" + bmi   );
		     System.out.println("2. " +"Sismansiniz");
		   } else if (bmi>=30) {
		     System.out.println("1." + "Bmi :" + bmi  );
		     System.out.println("2. " +"Obezite");
		   } 
		   
		   }{
		     
		   }{
		     
	}

}
