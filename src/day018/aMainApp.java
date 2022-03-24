package day018;

public class aMainApp {
    public static void main(String[] args) {

        //ARABA

        Araba araba1=new Araba();             // araba1 ve araba2 HEAP de farklı nesneler olarak oluşur.
        araba1.marka="Audi";
        araba1.silindirHacmi=1.9;
        araba1.yas=11;

        Araba araba2=new Araba();
        araba2.marka="BMW";
        araba2.silindirHacmi=2.0;
        araba2.yas=5;

        araba1.bilgileriGoster();
        araba2.bilgileriGoster();


        // KARE

        Kare k1=new Kare();
        k1.setKenar(7);
        double d1=k1.alanHesapla();

        System.out.println("Alan = "+d1);
        System.out.println("Çevre = "+k1.cevreHesapla());

        //DOG

        Dog dog1=new Dog("Kangal","XXLarge",4,"Gri");



    }
}
