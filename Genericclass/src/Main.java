
public class Main {
    //generic claslar türden bağımsız hareket edebildiğimiz claslardır
    public static void main(String[] args) {
        //önce generik olmadan nasıl yapıyoruz diye bakalım
        Character[] char_dizi={'j','a','v','a'};
        Integer[] int_dizi={1,2,3,4,5};
        String[] string_dizi={"java","python","c++","php"};
        Ogrenci[] ogrenci_dizi={new Ogrenci("mehmet"),new Ogrenci("rojhat"),new Ogrenci("elif")};
        
        
       CharYazdır.yazdir(char_dizi);
        System.out.println("---------");
       IntYazdır.yazdir(int_dizi);
        System.out.println("----------");
       StringYazdır.yazdir(string_dizi);
        System.out.println("---------");
       OgrenciYazdır.yazdir(ogrenci_dizi);
        System.out.println("***************");
       /* burda türleri farklı olan her bir diziyi bastırmak için
       farklı yzdır  classları oluşturmak zorunda kaldık
       halbuki hepsi aynı sadece bastırma görevi farklı türler için yapmaktadır
       burada generic clas ile hepsini yazdırabiliriz*/
        
       /*yazdırma sınıfını oluşturduktan sonra her bir dizi türü için bir obje oluşturuyoruz*/
       YazdırmaClas<Character> charYazdırmaClas=new YazdırmaClas<Character>();
       YazdırmaClas<Integer> intYazdırmaClas=new YazdırmaClas<Integer>();
       YazdırmaClas<String> stringYazdırmaClas=new YazdırmaClas<String>();
       YazdırmaClas<Ogrenci> ogrenciYazdırmaClas=new YazdırmaClas<Ogrenci>();

       //şimdi yazdırmaya başlayabiliriz
        charYazdırmaClas.yazdır(char_dizi);
         System.out.println("---------");
        intYazdırmaClas.yazdır(int_dizi);
         System.out.println("---------");
        stringYazdırmaClas.yazdır(string_dizi);
         System.out.println("---------");
        ogrenciYazdırmaClas.yazdır(ogrenci_dizi);
        
        
        // böylece tek class ile bütün dizilerimizi yazdırabiliriz
       
    }
    
}
