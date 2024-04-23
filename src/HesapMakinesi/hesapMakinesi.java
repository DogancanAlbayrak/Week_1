package HesapMakinesi;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        // Kullanıcıdan, işlem yapmak istediği sayıları gireceği alanı oluşturuyoruz.

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        n2 = input.nextInt();

        // Kullanıcıdan hangi işlemi yapmak istediğini seçmesini istiyoruz.

        System.out.println("1- Toplama\n2- Çıkarma \n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminizi yapınız : ");
        select = input.nextInt();

        // Girilen veri ve istenilen işleme göre yapılacak adımlar:

        switch (select) {
            case 1:
                System.out.print("Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Sonuç : " + (n1 * n2));
                break;
            case 4:

                //Bir sayının 0'a bölünemediğini belirttiğimiz hata mesajı.

                switch (n2) {
                    case 0:
                        System.out.print("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.print("Sonuç : " + (n1 / n2));
                        break;
                }
                break;

            //Kullanıcı işlem sayılarından farklı bir sayı girerse alacağı hata mesajı:

            default:
                System.out.print(" Hatalı giriş yaptınız. Tekrar deneyiniz.");
        }
    }
}