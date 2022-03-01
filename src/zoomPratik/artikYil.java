package zoomPratik;

import java.util.Scanner;

public class artikYil {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen bir yil giriniz ");
	
	int yil=scan.nextInt();
	boolean artikMi=false;

    if(yil % 4 == 0)
    {
        if( yil % 100 == 0)
        {
            if ( yil % 400 == 0)
                artikMi = true;
            else
                artikMi = false;
        }
        else
            artikMi = true;
    }
    else
        artikMi = false;

    if(artikMi)
        System.out.println(yil + " artık yıldır.");
    else
        System.out.println(yil + " artık yıl değildir.");
	
	
	
	scan.close();

	}

}
