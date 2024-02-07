package UcakRezervasyon;

import java.util.ArrayList;
import java.util.List;

class Musteri {
    private String ad;
    private List<Ucus> ucuslar;

    public Musteri(String ad) {
        this.ad = ad;
        this.ucuslar = new ArrayList<>();
    }

    public void ucuslarimiListele(){
        System.out.println("------  UÇUŞLARIM ------");
        int i = 1;
        for (Ucus ucus: ucuslar){
            System.out.println("Uçuşum:  " + ucus);
        }
        System.out.println();
    }
    public void koltuklariListele(Ucus ucus){
        System.out.println("------ KOLTUK DURUMU ------");
        int i = 1;
        for (Musteri musteri : ucus.getUcak().getRezervasyonDurumu()){
            System.out.println("Koltuk " + (i++) + ": " + (musteri != null ? "DOLU": "-"));
        }
        System.out.println();
    }
    public void koltukRezervasyonuYap(Ucus ucus,int koltukNumarasi){
        if (koltukNumarasi >= 1 && koltukNumarasi <= ucus.getUcak().getKoltukSayisi()) {
            if (ucus.getUcak().getRezervasyonDurumu()[koltukNumarasi - 1] != null){
                System.out.println(koltukNumarasi + " numaralı koltuk zaten dolu!\n");
            }else{
                ucus.getUcak().getRezervasyonDurumu()[koltukNumarasi - 1] = this; // Dizi indeksi 0'dan başladığı için koltukNumarasi-1
                ucuslar.add(ucus);
                System.out.println(koltukNumarasi + " numaralı koltuk '" + getAd() + "' adlı müşteriye başarıyla rezerve edildi.\n");
            }
        } else {
            System.out.println("Geçersiz koltuk numarası.\n");
        }
    }

    public void koltukRezervasyonunuIptalEt(Ucus ucus, int koltukNumarasi) {
        if (ucuslar.contains(ucus)){
            if (koltukNumarasi >= 1 && koltukNumarasi <= ucus.getUcak().getKoltukSayisi()) {
                if (ucus.getUcak().getRezervasyonDurumu()[koltukNumarasi - 1] == this) {
                    ucus.getUcak().getRezervasyonDurumu()[koltukNumarasi - 1] = null;
                    System.out.println(koltukNumarasi + " numarali koltuk başarı ile iptal edildi.\n");
                }else {
                    System.out.println(koltukNumarasi + " numaralı koltuk size ait değil! İptal edemezsiniz.\n");
                }
            } else {
                System.out.println("Geçersiz koltuk numarası.\n");
            }
        }else{
            System.out.println("Böyle bir uçuşunuz yok!\n");
        }

    }


    public String getAd() {
        return ad;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

}