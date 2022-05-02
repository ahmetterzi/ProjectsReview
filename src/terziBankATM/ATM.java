package terziBankATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        System.out.println("<<< TERZI BANK'a Hos Geldiniz >>>");
        System.out.println("=================================");
        System.out.println("[1]=> Bakiye Sorgulama\n[2]=> Para Cekme\n" +
                "[3]=> Para Yatirma\n[4]=> Cikis");
        System.out.println("=================================");

        Scanner scan = new Scanner(System.in);
        int islem = scan.nextInt();
        int bakiye = 1000;

        switch (islem) {
            case 1:
                System.out.println("Bakiye : " + bakiye);
                System.out.println("==================");
                break;
            case 2:
                System.out.println("Bakiye : " + bakiye);
                System.out.println("==================");
                System.out.print("Lutfen yatirmak istediginiz tutari giriniz : ");
                int yatirilanTutar = scan.nextInt();
                if (yatirilanTutar >= 0) {
                    System.out.println("Guncel bakiyeniz : " + (bakiye + yatirilanTutar));

                } else
                    System.out.println("Yanlis deger girdiniz");
                break;
            case 3:
                System.out.println("Bakiye : " + bakiye);
                System.out.println("==================");
                System.out.print("Cekmek istediginiz tutari giriniz : ");
                int cekilenTutar = scan.nextInt();
                if (cekilenTutar >=0) {
                    if (cekilenTutar > bakiye) {
                        System.out.println("Bakiyenizden fazla tutar girdiniz");
                    } else
                        System.out.print("Guncel bakiyeniz : " + (bakiye - cekilenTutar));
                }else
                    System.out.println("Yanlis deger girdiniz");
                break;
            case 4:
                System.out.println("Cikisiniz yapilmistir :)");
                System.out.println("");
                System.out.println("==================");
                System.out.println("<<< TERZI BANK >>>");
                System.out.println("==================");
                break;
        }

    }
}
