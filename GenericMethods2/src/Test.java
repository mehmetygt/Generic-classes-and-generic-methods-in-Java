
public class Test {
    
    /* //generik olmayan method 
    public static Sayısal birinci_bul(Sayısal s1,Sayısal s2){
        if (s1.puan_hesapla()>s2.puan_hesapla()) {
            return s1;
            
        } else{
            return s2;
        }}
*/ 
    //generik hali
     public static <E extends Aday> E birinci_bul(E genel1,E genel2){
         /* <E extends Aday> burada kasıt sadece adaydan extend edilenlerde geçerlidir demek*/
        if (genel1.puan_hesapla()>genel2.puan_hesapla()) {
            return genel1;
            
        } else{
            return genel2;
        }}
    public static void main(String[] args) {
        
     Sayısal sayısal1=new Sayısal(10, 20,30,40);
     Sayısal sayısal2=new Sayısal(40, 30, 20, 10);
     Sayısal birinci=birinci_bul(sayısal1, sayısal2);
     System.out.println("birincinin puanı : "+birinci.puan_hesapla());
     
     EsitAgırlık esitAgırlık1=new EsitAgırlık(15, 30, 20, 25);
     EsitAgırlık esitAgırlık2=new EsitAgırlık(15, 35, 20, 15);
     
     EsitAgırlık birinci2=birinci_bul(esitAgırlık1, esitAgırlık2);
     System.out.println("birincinin puanı : "+birinci2.puan_hesapla());
     
     
     /*sayısal için kullandığımız birinci bul methodu esitagırlık için olmaz çünkü
     sadece sayısal tipi girdi akbul edip geri gönderiyor/*
     bunun için birinci bul metodunu generikleştirmeliyiz
     */

    
     
   
    }
    
}
