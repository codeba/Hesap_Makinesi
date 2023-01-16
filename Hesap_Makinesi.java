package patika;

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        int num1,num2,select,sonuc;
        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        num1=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        num2=scan.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("seçiminiz:");
        select=scan.nextInt();
        switch (select){
            case 1:
                sonuc = num1 + num2;
                System.out.println("sonuc = " + sonuc);
                break;
            case 2:
                sonuc=num1-num2;
                System.out.println("sonuc = " + sonuc);
                break;
            case 3:
                sonuc=num1*num2;
                System.out.println("sonuc = " + sonuc);
                break;
            case 4:
                if(num2!=0){
                    sonuc=num1/num2;
                    System.out.println("sonuc = " + sonuc);

                }else {
                    System.out.println("bir sayı sıfıra bölünemez");
                }

                break;
            default:
                System.out.println("yalnış seçim yaptınız tekrar deneyin!!!");

        }




    }
}
