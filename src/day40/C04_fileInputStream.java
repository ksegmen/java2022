package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_fileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Javada bir dosyaya ulsamk istedigimizde FileInputStream classindan yardim aliriz
		// 
		
		
		
		FileInputStream fis=new FileInputStream("src\\day40\\yazi.txt");
		// java bu kodda olasi bir problem ongoruyor
		// ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// yani alti cizilen her kod cte degildir 
		// bunun icin iki durum sozkonusu 
		//1. try catch kullanarak bu problemi handle edip javanin yoluna devam etmesini saglayabiliriz 
		// 2.eger dosya okunamiyorsa kod calismasin istiyorsaniz olayin farkinda oldugumuzu ve sorumlulugun bizde oldugunu 
		// javaya soylemeliyiz
		
		System.out.println("gorev tamamlandi");
		
		
	}

}
