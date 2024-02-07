package UcakRezervasyon;

public class UcusRezervasyonSistemi {

    public static void main(String[] args) {
        // Uçak oluştur
        Ucak ucak = new Ucak("Boeing 737", 5);
        TurkiyeIller kalkisYeri = TurkiyeIller.AGRI;
        TurkiyeIller varisYeri = TurkiyeIller.ISTANBUL;

        Ucus ucus = new Ucus(ucak, kalkisYeri, varisYeri,"01-06-2024 13:45");
        Ucus ucus2 = new Ucus(ucak, kalkisYeri, varisYeri,"01-06-2024 10:00");

        Musteri musteri = new Musteri("Yolcu VARIŞ");

        // Tüm koltukları listele
        musteri.koltuklariListele(ucus);

        musteri.koltukRezervasyonuYap(ucus,4); // ilk etapta boş koltuk rezerve edilebilir
        musteri.koltukRezervasyonuYap(ucus,4); // ikinci etapta rezerve edilemez
        musteri.koltukRezervasyonuYap(ucus,2);

        // Tüm koltukları listele
        musteri.koltuklariListele(ucus);

        // 3 Numaralı koltuk müşteriye ait olmadığından iptal edemz
        musteri.koltukRezervasyonunuIptalEt(ucus,3);

        // ucus2 müşteriye ait olmadığından iptal edemez
        musteri.koltukRezervasyonunuIptalEt(ucus2, 2);

        // 2 Numaralı koltuk müşteriye ait iptal edebilir
        musteri.koltukRezervasyonunuIptalEt(ucus, 2);

        // Tüm koltukları listele
        musteri.koltuklariListele(ucus);








    }
}