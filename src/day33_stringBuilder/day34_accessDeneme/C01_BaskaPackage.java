package day33_stringBuilder.day34_accessDeneme;

import day34_accessModifier_ncapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);// sadece ayni package dakiler ulasabilir 
		//System.out.println(obj.sayiProtected);  ayni pacakege daki classlar ve childclasslar ulasabilir 
		System.out.println(obj.sayiPublic);
		
	}

}
