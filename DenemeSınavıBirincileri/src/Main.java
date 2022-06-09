
import java.util.Scanner;


public class Main {
    public static <E extends Aday> E birinci_bul(E og1,E og2,E og3){
         /* <E extends Aday> burada kasıt sadece adaydan extend edilenlerde geçerlidir demek*/
        if (og1.puan_hesapla()>og2.puan_hesapla()&& og1.puan_hesapla()>og3.puan_hesapla()) {
            return og1;
            
        } else if (og2.puan_hesapla()>og1.puan_hesapla()&& og2.puan_hesapla()>og3.puan_hesapla()){
            return og2;
        }
     else if (og3.puan_hesapla()>og2.puan_hesapla()&& og3.puan_hesapla()>og1.puan_hesapla()){
            return og3;}
     else {return og1;}
    }
    public static void main(String[] args) {
        System.out.println();
        
        System.out.println("\t Deneme Sınavı Birinci Bulma Programaına Hoşşgeldiniz");
        Scanner scanner=new Scanner(System.in);
        String islemler="İşlemler \n"
                + "1. işlem : Eşit Ağırlık birincisi \n"
                + "2. işlem : Sayısal birincisi \n"
                + " 3. Çıkış";
        System.out.println("*************");
        System.out.println(islemler);
        System.out.println("**************");
        while (true) {  
           
                
            System.out.println("İstediğiniz işlemi giriniz");
            int islem=scanner.nextInt();
            if (islem==3) {
                System.out.println("program sonlandırılıyor");
                break;
                
            }
            else if (islem==1) {
                System.out.println("eşit ağırlık birincisi bulma bölümündesin");  
                System.out.print("ilk Öğrenci ismi gir : ");
                String isim1=scanner.nextLine();
                scanner.nextLine();
                System.out.println("netleri giriniz");
                System.out.print("türkçe : ");
                int turkce1=scanner.nextInt();
                System.out.print("matematik : ");
                int matematik1=scanner.nextInt();
                System.out.print("edebiyat : ");
                int edebiyat1=scanner.nextInt();
                System.out.print("fizik : ");
                int fizik1=scanner.nextInt();
                
                System.out.print("ikinci Öğrenci ismi gir : ");
                String isim2=scanner.nextLine();
                scanner.nextLine();
                System.out.println("netleri giriniz");
                System.out.print("türkçe : ");
                int turkce2=scanner.nextInt();
                System.out.print("matematik : ");
                int matematik2=scanner.nextInt();
                System.out.print("edebiyat : ");
                int edebiyat2=scanner.nextInt();
                System.out.print("fizik : ");
                int fizik2=scanner.nextInt();
                
                System.out.print("üçüncü Öğrenci ismi gir : ");
                String isim3=scanner.nextLine();
                scanner.nextLine();
                System.out.println("netleri giriniz");
                System.out.print("türkçe : ");
                int turkce3=scanner.nextInt();
                System.out.print("matematik : ");
                int matematik3=scanner.nextInt();
                System.out.print("edebiyat : ");
                int edebiyat3=scanner.nextInt();
                System.out.print("fizik : ");
                int fizik3=scanner.nextInt();
                
                EsitAgırlık ogrenci1=new EsitAgırlık(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgırlık  ogrenci2=new EsitAgırlık(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgırlık  ogrenci3=new EsitAgırlık(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                EsitAgırlık birinci=birinci_bul(ogrenci1,  ogrenci2,  ogrenci3);
                
                System.out.println("Eşit ağırlık birincisi: "+birinci.getIsim());
                 System.out.println("puanı :  "+birinci.puan_hesapla());
                
            }
             else if (islem==2) {
                System.out.println("sayısal birincisi birincisi bulma");
                System.out.print("ilk Öğrenci ismi gir : ");
                String isim1=scanner.nextLine();
                scanner.nextLine();
                System.out.println("netleri giriniz");
                System.out.print("türkçe : ");
                int turkce1=scanner.nextInt();
                System.out.print("matematik : ");
                int matematik1=scanner.nextInt();
                System.out.print("edebiyat : ");
                int edebiyat1=scanner.nextInt();
                System.out.print("fizik : ");
                int fizik1=scanner.nextInt();
                
                System.out.print("ikinci Öğrenci ismi gir : ");
                String isim2=scanner.nextLine();
                scanner.nextLine();
                System.out.println("netleri giriniz");
                System.out.print("türkçe : ");
                int turkce2=scanner.nextInt();
                System.out.print("matematik : ");
                int matematik2=scanner.nextInt();
                System.out.print("edebiyat : ");
                int edebiyat2=scanner.nextInt();
                System.out.print("fizik : ");
                int fizik2=scanner.nextInt();
                
                System.out.print("üçüncü Öğrenci ismi gir : ");
                String isim3=scanner.nextLine();
                scanner.nextLine();
                System.out.println("netleri giriniz");
                System.out.print("türkçe : ");
                int turkce3=scanner.nextInt();
                System.out.print("matematik : ");
                int matematik3=scanner.nextInt();
                System.out.print("edebiyat : ");
                int edebiyat3=scanner.nextInt();
                System.out.print("fizik : ");
                int fizik3=scanner.nextInt();
                
                Sayısal  ogrenci1=new Sayısal(turkce1, matematik1, edebiyat1, fizik1, isim1); 
                Sayısal  ogrenci2=new Sayısal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayısal  ogrenci3=new Sayısal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Sayısal birinci=birinci_bul( ogrenci1,  ogrenci2,  ogrenci3);
                
               System.out.println("Sayısal ağırlık birincisi: "+birinci.getIsim());
                 System.out.println("puanı :  "+birinci.puan_hesapla());
                
            }
             else{System.out.println("Geçersiz işlem.....");}
            
        }
    }
    
}
