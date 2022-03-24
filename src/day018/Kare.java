package day018;

public class Kare {

    private double kenar;

    public double getKenar() {
        return kenar;
    }
    public void setKenar(double kenar) {
        if (kenar>0.0) {
            this.kenar = kenar;
        }
    }


    public double alanHesapla(){
        return kenar*kenar;
    }

    public double cevreHesapla(){
        return kenar*4;
    }



}
