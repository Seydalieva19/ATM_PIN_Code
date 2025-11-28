import java.util.Scanner;

public class Main{
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int pinCode = 1234;
       int enterPIN ;

       System.out.print("PIN daxil edin:");
       enterPIN = sc.nextInt();

       for(int i = 3; i>0; i--){
           if(enterPIN == pinCode){
               System.out.println("Sistemə daxil oldunuz!");
               break;
           }else{
               System.out.println("Yanlış PİN. Yenidən cəhd edin");

           }
       }

       }

    }



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int pinCode = 1234;
//         int enterPIN;
//         int attempts = 3;

//         while (attempts > 0) {
//             System.out.print("PIN daxil edin: ");
//             enterPIN = sc.nextInt();

//             if (enterPIN == pinCode) {
//                 System.out.println("Sistemə daxil oldunuz!");
//                 break;
//             } else {
//                 attempts--;
//                 if (attempts > 0) {
//                     System.out.println("Yanlış PİN. Yenidən cəhd edin");
//                     System.out.println("Qalib cəhd sayı: " + attempts);
//                 } else {
//                     System.out.println("Kartınız bloklandı!");
//                 }
//             }
//         }

//         sc.close();
//     }
// }
