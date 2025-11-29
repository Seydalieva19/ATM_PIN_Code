import java.util.Scanner;

public class ATM_PIN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pinCode = 1234;
        int enterPIN;
        System.out.println("-_-Xoşgəlmişsiniz-_-");

        for (int i = 3; i > 0; i--) {
            System.out.print("PIN daxil edin:");
            enterPIN = sc.nextInt();  //imput loop daxilinde olmalidi

            if (enterPIN == pinCode) {
                System.out.println("Sistemə daxil oldunuz!");
                break;
            } else if (i - 1 > 0) {
                System.out.println("Yanlış pin yenidən cəhd edin!");
                System.out.println("Qalıq cəhd sayı " + (i - 1));
            } else {
                System.out.println("Yanlış PİN.Sistem bloklandı");

            }

        }

    }

}