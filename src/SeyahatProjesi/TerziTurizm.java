package SeyahatProjesi;

import java.util.Scanner;

public class TerziTurizm {
    public static void main(String[] args) {
               /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        
        double kayserKm = 750;
        double erzurumKm = 1200;
        int kisiSayi = 0;
        double biletUcreti = 0;
        double bakiye = 1000;
        double toplamTutar = biletUcreti*kisiSayi;


        System.out.println("=================================");
        System.out.println("<<< TRZ TURIZM'e Hos Geldiniz >>>");
        System.out.println("=================================");
        System.out.println();
        System.out.println("Nereye seyahat etmek istiyorsunuz?");
        System.out.println("----------------------------------\n" +
                "- - - - - - - - - - - -");
        System.out.println("ANKARA : 750 KM\nERZURUM : 1200 KM\n- - - - - - - - - - - -\n** (20 KM başına 5 lira bilet parası alınmaktadir)");
        System.out.print("Secimizi giriniz : ");
        Scanner scan = new Scanner(System.in);
        String sehir = scan.next().toUpperCase();

        switch (sehir) {
            default:
                System.out.println("Liste harici giris yaptiniz.");
                break;
            case "ANKARA":
                System.out.println("Rota : " + sehir);
                System.out.println("- - - - - - - - -");
                biletUcreti = ((kayserKm / 20) * 5);
                System.out.println("Bilet ucreti : " + biletUcreti + " TL");
                System.out.println("-----------------");
                System.out.print("Kaç kişilik bilet almak istiyorsunuz? (Max 2 kişilik alinabilir): ");
                kisiSayi = scan.nextInt();
                System.out.println("----------------------------------------------------------------");

                switch (kisiSayi) {
                    default:
                        System.out.println("Hatali giris yaptiniz");
                        break;
                    case 1:
                        System.out.println("1 kisilik");
                        toplamTutar = biletUcreti*kisiSayi;
                        break;
                    case 2:
                        System.out.println("2 kisilik");
                        toplamTutar = biletUcreti*kisiSayi;
                }//innerSwitch1
                break;
            case "ERZURUM":
                System.out.println("Rota : " + sehir);
                System.out.println("- - - - - - - - -");
                biletUcreti = ((erzurumKm / 20) * 5);
                System.out.println("Bilet ucreti : " + biletUcreti + " TL");
                System.out.println("-----------------------------------");
                System.out.print("Kaç kişilik bilet almak istiyorsunuz? (Max 2 kişilik alinabilir): ");
                kisiSayi = scan.nextInt();
                System.out.println("----------------------------------------------------------------");

                switch (kisiSayi) {
                    default:
                        System.out.println("Hatali giris yaptiniz");
                        break;

                    case 1:
                        System.out.println("1 kisilik");
                        toplamTutar = biletUcreti*kisiSayi;
                        break;
                    case 2:
                        System.out.println("2 kisilik");
                        toplamTutar = biletUcreti*kisiSayi;

                }//innerSwitch2


        }//outerSwitch1
        System.out.println();
        System.out.println();

        System.out.println("*** SEPET ***");
        System.out.println("=============");
        System.out.println("Nereye: " + sehir);
        System.out.println("Kisi Sayisi : " + kisiSayi);
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
        System.out.println("Bakiye : " + bakiye + " TL");
        double paraUstu = bakiye - toplamTutar;
        if (toplamTutar > bakiye) {
            System.out.println("Bakiyeniz yeterli degildir");
        } else {
            System.out.println("Para Ustu : " + paraUstu + "TL");
            System.out.println(">>> IYI YOLCULUKLAR <<<");
        }

    }//main
}
