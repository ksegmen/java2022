package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {
		Araba honda=new Araba(); // p siz cons da honda obj create edildi 
		honda.setMotor(-300);
		honda.setModel("civic");
		honda.setYil(2021);
         honda.getModel();
         
         
         System.out.println(honda.getYil());
         
         Araba volvo=new Araba("xc9o" , "beyaz " , 20 , 2020);
         Araba ww=new Araba("passat" , " kirmizi" , 1600, -2021);
         System.out.println("araciniz volvo:" +"yili"+ volvo.getYil() + "renk : " + volvo.getRenk() +"motor: "+volvo.getRenk());
          System.out.println("araciniz ww :" + ww.getYil() + ww.getRenk()+ ww.getMotor() );
         
	}

}
