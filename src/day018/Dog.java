package day018;

public class Dog {

    private String breed;
    private String size;             // Sınıfın ismi ile aynı isimde olan metota KURUCU METOT denir, görmesekte her zaman vardır.
    private int age;                                                        // CONSTRUCTOR METHOD.
    private String color;


    public Dog(String b,String s,int a,String c){      //CONSTRUCTOR METHOD
        breed=b;
        size=s;
        age=a;
        color=c;
    }
    public Dog(){}


}
