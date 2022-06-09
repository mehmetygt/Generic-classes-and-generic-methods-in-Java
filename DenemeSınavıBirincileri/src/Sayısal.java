

public class Sayısal extends Aday{

    public Sayısal(int türkçe, int matematik, int edebiyat, int fizik, String isim) {
        super(türkçe, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puan_hesapla() {
         int hesap=getEdebiyat()*1+getFizik()*4+getMatematik()*5+getTürkçe()*5;
       return hesap;
    }
}