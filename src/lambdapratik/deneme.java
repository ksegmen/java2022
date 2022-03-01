package lambdapratik;

public class deneme {
    public static void main(String[] args){
 /* 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
                Test Data:
        Yarım elmas uzunluğu : 7
        Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */

        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                System.out.print("  ");

            }
            for (int t = 0; t < i; t++) {
                System.out.print(" * ");

            }
            System.out.println(" ");
        }
        for (int i =6; i >0;i--) {
            for (int j = i; j <=6; j++) {
                System.out.print(" ");
            }
            for (int t = 0; t <= i; t++) {
                System.out.print(" *");
            }

            System.out.println(" ");

        }
    }
}



