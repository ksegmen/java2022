package _12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		
		concat();
		
		
		
		concat("h", " a" ," c"," e", "  r" );
		
		
		concat("hanim", "  basarili", "   qa  ");
		
		
		
	

}

	private static void concat(String ...str ) {
	String yeniStr="";
	for (String w : str) {
		yeniStr=yeniStr.concat(w);
	}
		System.out.println(yeniStr);
	}
}