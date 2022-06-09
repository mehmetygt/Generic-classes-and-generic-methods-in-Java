
public class Main {
      public static void main(String[] args) {
        //önce generik olmadan nasıl yapıyoruz diye bakalım
        Character[] char_dizi={'j','a','v','a'};
        Integer[] int_dizi={1,2,3,4,5};
        String[] string_dizi={"java","python","c++","php"};
        Ogrenci[] ogrenci_dizi={new Ogrenci("mehmet"),new Ogrenci("rojhat"),new Ogrenci("elif")};
     
        
        // generic methodu çalıştıralım
          yazdir(char_dizi);
          System.out.println("----------");
          yazdir(int_dizi);
          System.out.println("----------");
          yazdir(string_dizi);
          System.out.println("----------");
          yazdir(ogrenci_dizi);
        
}
// generic bir yazdırma methodu yazalım
      public static <E> void yazdir( E[] dizi){// generic method böyle yazılır
      for(E c : dizi){
          System.out.println(c);}}

}
