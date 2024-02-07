package UcakRezervasyon;

class Ucus {

    private Ucak ucak;
    private TurkiyeIller kalkisYeri;
    private TurkiyeIller varisYeri;
    private String tarih;


    public Ucus(Ucak ucak, TurkiyeIller kalkisYeri, TurkiyeIller varisYeri, String tarih) {
        this.ucak = ucak;
        this.kalkisYeri = kalkisYeri;
        this.varisYeri = varisYeri;
        this.tarih = tarih;

    }

    public Ucak getUcak(){
        return ucak;
    }

    public TurkiyeIller getKalkisYeri() {
        return kalkisYeri;
    }

    public TurkiyeIller getVarisYeri() {
        return varisYeri;
    }

    public String getTarih() {
        return tarih;
    }
}
