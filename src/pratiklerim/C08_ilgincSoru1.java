package pratiklerim;

import java.util.Scanner;

public class C08_ilgincSoru1 {

	public static void main(String[] args) {
		
		
		
		
		
		//(Bir ayın gün sayısı) Kullanıcıdan ay ve yıl bilgisini alan ve yılın bu ayına
	     // ait gün sayısını gösteren bir program yazınız. Örneğin; kullanıcı ay için 2
	     //ve yıl için 2012 girerse, program “Şubat 2012, 29 gündür”(artik yil kontrolu) mesajını
	     //gösterecek. Eğer kullanıcı ay için 3 ve yıl için 2015 girerse, program “Mart
	     //2015, 31 gündür” mesajını gösterecek.
	     
	     
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay rakami girin");
		int ay = scan.nextInt();
		System.out.println("Bir yil rakami girin");
		int yil = scan.nextInt();
		
		if ((ay<12&&ay>0)||(yil>0)) {	
		switch (ay) {
		case 1:
			System.out.print("Januar ");
			break;
		case 2:
			System.out.print("Februar ");
			break;
		case 3: 
			System.out.print("Marz ");
			break;
		case 4:
			System.out.print("April ");
			break;
		case 5:
			System.out.print("MAy ");
			break;
		case 6: 
			System.out.print("June ");
			break;
		case 7: 
			System.out.print("July ");
			break;
		case 8: 
			System.out.print("Agust ");
			break;
		case 9:
			System.out.print("September ");
			break;
		case 10:
			System.out.print("Oktober ");
			break;
		case 11: 
			System.out.print("November ");
			break;
		case 12: 
			System.out.print("Dezember ");
			break;
		//default:
		}
		}else {
			System.out.print("lutfen gecerli aralikta giriniz");
		}if (ay==1||ay==3||ay==5||ay==7||ay==8||ay==10||ay==12) {
			System.out.print(yil);
			String gun =", 31 gundur.";
			System.out.print(gun);
		}else if (ay==4||ay==6||ay==9||ay==11) {
				System.out.print(yil);
				String gun3 =", 30 gundur.";
				System.out.print(gun3);	
			}else if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {
			System.out.print(yil);
			String	gun1=", 29 gundur";
			System.out.print(gun1);
			}else if(ay<=0) {
				System.out.println(" Lutfen ayi gecerli bir aralikta girin");
			}else {
				System.out.print(yil);
				String gun2=", 28 gundur";
				System.out.println(gun2);
			}
		}
	}

	


