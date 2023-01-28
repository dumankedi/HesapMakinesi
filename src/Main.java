import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sonuc;
        String islem;
        System.out.print("İlk Sayıyı girniz: ");
        sayi1=input.nextInt();
        System.out.print("İKinci Sayıyı girniz: ");
        sayi2=input.nextInt();
        System.out.print("Yapmak istediğiniz İşlem: ");
        islem=input.next();
        switch (islem){
            case "+":
                sonuc=sayi1+sayi2;
                System.out.println(sonuc);
                break;
            case "-":
                sonuc=sayi1-sayi2;
                System.out.println(sonuc);
                break;
            case "*":
                sonuc=sayi1*sayi2;
                System.out.println(sonuc);
                break;
            case "/":
                if (sayi2==0){
                    System.out.println("HATA!!!!!!");
                }
                else{
                    sonuc=sayi1/sayi2;
                    System.out.println(sonuc);
                }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");
        }
    }
}