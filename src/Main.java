import java.util.Scanner;





public class Main {
    public static void main(String[] args) {

                String username, password;
                int degisim;

                Scanner input = new Scanner(System.in);
                System.out.println("Kullanıcı Adını Giriniz:");
                username = input.nextLine();

                System.out.println("Şifrenizi Giriniz: ");
                password = input.nextLine();

                if (username.equals("patika") && password.equals("java123")) {
                    System.out.println("Giriş Yaptınız");
                } else {
                    System.out.println("Kullanıcı Adı veya Şifreniz Hatalı:");
                    System.out.println("Şifrenizi Değiştirmek için 1'e tıklayınız");
                    degisim = input.nextInt();

                    switch (degisim) {
                        case 1:
                            System.out.println("Lütfen Yeni Şifrenizi Giriniz: ");
                            input.nextLine(); // Consume the newline character left by input.nextInt()

                            // Use the correct comparison operator (== instead of ;)
                            if (input.nextLine().equals("java1234")) {
                                System.out.println("Şifre Oluşturulamadı lütfen Tekrar Deneyiniz:");
                            } else {
                                System.out.println("Şifre Oluşturuldu");
                            }
                            break;
                        default:
                            System.out.println("Geçersiz seçim.");
                    }
                }
            }
        }

