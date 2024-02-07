package UcakRezervasyon;

public class Ucak {
    private String ucakAdi;
    private int koltukSayisi;
    private Musteri[] rezervasyonDurumu;


    public Ucak(String ucakAdi, int koltukSayisi) {
        this.ucakAdi = ucakAdi;
        this.koltukSayisi = koltukSayisi;
        this.rezervasyonDurumu = new Musteri[koltukSayisi];
    }

    public String getUcakAdi() {
        return ucakAdi;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public Musteri[] getRezervasyonDurumu() {
        return rezervasyonDurumu;
    }
}
