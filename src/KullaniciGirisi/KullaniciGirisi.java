package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        // We are taking inputs from the user for the username and password.

        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        //The entered information is being checked for correctness.

        if (userName.equals("patika") && password.equals("java")) {
            System.out.print("Giriş Başarılı !");

            // If the password is entered incorrectly, the user is asked if they want to reset it.

        } else if (userName.equals("patika")) {
            System.out.print("Şifreniz Yanlış ! Şifrenizi Sıfırlamak İster Misiniz? (Evet / Hayır) : ");
            String answer = inp.nextLine();

            //If the user answers "yes," the password is reset, and a new password is requested.

            if (answer.equals("Evet")) {
                System.out.print("Şifreniz Sıfırlandı. Yeni Şifrenizi Giriniz : ");
                password = inp.nextLine();
            }
            //If the password entered by the user is the same as the previous password, they receive an error message.

            if (password.equals("java")) {
                System.out.print("Şifre oluşturulamadı. Lüfen başka şifre giriniz.");

                //If the user answers "No" to the password reset question, they receive a message saying "Operation canceled."

            } else if ((answer.equals("Hayır"))) {
                System.out.print("İşlem İptal Edildi.");

                //When the user successfully changes their password, they receive a message saying "Your password has been created."

            } else {
                System.out.print("Şifreniz oluşturuldu.");
            }
        }
    }
}











