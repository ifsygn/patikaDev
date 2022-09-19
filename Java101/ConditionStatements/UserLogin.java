/*
Ödev
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
    gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
    sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

package Java101.ConditionStatements;

import java.util.Scanner;

public class UserLogin {

    String savedUsername = "ifsygn";
    String savedPassword = "1234";

    public static void main(String[]args) {

        String userName, userPassword;
        boolean isLogin = false;

        Scanner sc = new Scanner(System.in);

        UserLogin deneme = new UserLogin();

        while (!isLogin) {
            System.out.println("Kullanıcı Adınız: ");
            userName = sc.nextLine();

            System.out.println("Şifreniz: ");
            userPassword = sc.nextLine();

            isLogin = deneme.login(userName, userPassword);
        }
    }

    public boolean login(String userName, String userPassword) {

        Scanner sc = new Scanner(System.in);

        if (!userName.equals(savedUsername)) {
            System.out.println("Kullanıcı adı geçersiz!");
            return false;
        }
        else if (!userPassword.equals(savedPassword)) {
            System.out.println("Şifre yanlış. Yeni şifre almak ister misiniz? :Evet / Hayır");
            String flag = sc.nextLine();

            if (flag.equals("Evet")) {

                for(;;) {
                    System.out.println("Yeni şifrenizi giriniz:");
                    String newPassword = sc.nextLine();

                    if (savedPassword.equals(newPassword)) {
                        System.out.println("Yeni şifreniz eskisi ile aynı olamaz.");
                    }
                    else {
                        System.out.println("Yeni şifreniz oluşturuldu.");
                        savedPassword = newPassword;
                        break;
                    }
                }
            }
            return false;
        }
        else {
            System.out.println("Giriş Yaptınız.");
            return true;
        }
    }
}
