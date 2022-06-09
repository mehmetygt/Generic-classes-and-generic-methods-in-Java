
public class EsitAgırlık extends Aday{


    public EsitAgırlık(int türkçe, int matematik, int edebiyat, int fizik, String isim) {
        super(türkçe, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puan_hesapla() {
          int hesap=getEdebiyat()*4+getFizik()*1+getMatematik()*5+getTürkçe()*5;
       return hesap;
    }

   
}
