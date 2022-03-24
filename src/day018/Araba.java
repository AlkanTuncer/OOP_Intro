package day018;

public class Araba {  // Burdaki Araba CLASS'tır-Araba Sınıfı- Nesne değildir.MainAppdeki arabalar nesnedir.

    String marka;                  // bunların her biri MEMBER VARIABLE - Üye Değişkenler
    int yas;                       // initialize edilme zorunlulugu yoktur.
    double silindirHacmi;          // burası bir şablon bir tasarım. Nesnemizi mainapp de olusturuyoruz degerleri orda atıyoruz.



    void bilgileriGoster(){
        System.out.println(marka);
        System.out.println(silindirHacmi);
        System.out.println(yas);
        System.out.println();
    }

}
