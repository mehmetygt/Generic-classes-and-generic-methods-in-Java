
public abstract class Aday {
    private int türkçe;
    private int matematik;
    private int edebiyat;
    private int fizik;
    
    public Aday(int türkçe, int matematik, int edebiyat, int fizik) {
       this.türkçe = türkçe;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    } 
    public abstract int puan_hesapla();

    public int getTürkçe() {
        return türkçe;
    }

    public void setTürkçe(int türkçe) {
        this.türkçe = türkçe;
    }
    
    
    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }


    
    
}
