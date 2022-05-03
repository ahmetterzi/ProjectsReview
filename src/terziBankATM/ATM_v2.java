package terziBankATM;

import java.util.Scanner;

public class ATM_v2 {

    static int bakiye = 1000;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("<<< TERZI BANK'a Hos Geldiniz >>>");
        islem();
    }

    private static void islem() {
        System.out.println("=================================");
        System.out.println("[1]=> Bakiye Sorgulama\n[2]=> Para Cekme\n" +
                "[3]=> Para Yatirma\n[4]=> Cikis");
        System.out.println("=================================");
        System.out.print("Seciminizi giriniz : ");
        int islem = scanner.nextInt();
        switch (islem) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                paraYatirma();
                break;
            case 4:
                cikis();
                break;

        }
    }

    private static void cikis() {
        System.out.println("Cikisiniz yapilmistir :)");
        System.out.println("");
        System.out.println("==================");
        System.out.println("<<< TERZI BANK >>>");
        System.out.println("==================");

    }

    private static void paraYatirma() {
        System.out.println("Bakiye : " + bakiye);
        System.out.println("==================");
        System.out.print("Lutfen yatirmak istediginiz tutari giriniz : ");
        int yatirilanTutar = scanner.nextInt();
        if (yatirilanTutar >= 0) {
            bakiye += yatirilanTutar;
            System.out.println("Guncel bakiyeniz : " + (bakiye));

        } else
            System.out.println("Yanlis deger girdiniz");
        System.out.println("Isleme devam etmek istiyorsaniz [1]\n" +
                "Isleme devam etmek istemiyorsaniz [0]'ye basiniz.");
        int karar = scanner.nextInt();
        if (karar == 1) {
            islem();
        } else cikis();
    }

    private static void paraCekme() {
        System.out.println("Bakiye : " + bakiye);
        System.out.println("==================");
        System.out.print("Cekmek istediginiz tutari giriniz : ");
        int cekilenTutar = scanner.nextInt();
        if (cekilenTutar >= 0) {
            if (cekilenTutar > bakiye) {
                System.out.println("Bakiyenizden fazla tutar girdiniz");
            } else {
                bakiye -= cekilenTutar;
                System.out.println("Guncel bakiyeniz : " + (bakiye));
            }
        } else
            System.out.println("Yanlis deger girdiniz");

        System.out.println("Isleme devam etmek istiyorsaniz [1]\n" +
                "Isleme devam etmek istemiyorsaniz [0]'ye basiniz.");
        int karar = scanner.nextInt();
        if (karar == 1) {
            islem();
        } else cikis();
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiye : " + bakiye);
        System.out.println("==================");
        System.out.println("Isleme devam etmek istiyorsaniz [1]\n" +
                "Isleme devam etmek istemiyorsaniz [0]'ye basiniz.");

        int karar = scanner.nextInt();
        if (karar == 1) {
            islem();
        } else cikis();
    }
}
