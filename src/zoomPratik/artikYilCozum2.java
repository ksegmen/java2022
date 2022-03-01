package zoomPratik;

import java.time.Year;
import java.util.Scanner;

public class artikYilCozum2 {

	public static void main(String[] args) {
		
     // ARTIK YIL SORUSUNUN YEAR CLASS I ILE COZUMU !!!!!!! 
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir yil giriniz ");
	int yil=scan.nextInt();
	 Year year = Year.of(yil);
     boolean isLeap = year.isLeap();
  System.out.println(isLeap);
  if (isLeap==true) {
	System.out.println(yil + " artik yildir");
} else {
 System.out.println(yil + " artik yil degildir");
}
  scan.close();
	}

}