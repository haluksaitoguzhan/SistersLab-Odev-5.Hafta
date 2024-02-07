package UcakRezervasyon;

public enum TurkiyeIller {
    ADANA(1, "Adana"),
    ADIYAMAN(2, "Adıyaman"),
    AFYONKARAHISAR(3, "Afyonkarahisar"),
    AGRI(4, "Ağrı"),
    AKSARAY(68, "Aksaray"),
    AMASYA(5, "Amasya"),
    ANKARA(6, "Ankara"),
    ANTALYA(7, "Antalya"),
    ARDAHAN(75, "Ardahan"),
    ARTVIN(8, "Artvin"),
    AYDIN(9, "Aydın"),
    BALIKESIR(10, "Balıkesir"),
    BARTIN(74, "Bartın"),
    BATMAN(72, "Batman"),
    BAYBURT(69, "Bayburt"),
    BILECIK(11, "Bilecik"),
    BINGOL(12, "Bingöl"),
    BITLIS(13, "Bitlis"),
    BOLU(14, "Bolu"),
    BURDUR(15, "Burdur"),
    BURSA(16, "Bursa"),
    CANAKKALE(17, "Çanakkale"),
    CANKIRI(18, "Çankırı"),
    CORUM(19, "Çorum"),
    DENIZLI(20, "Denizli"),
    DIYARBAKIR(21, "Diyarbakır"),
    DUZCE(81, "Düzce"),
    EDIRNE(22, "Edirne"),
    ELAZIG(23, "Elazığ"),
    ERZINCAN(24, "Erzincan"),
    ERZURUM(25, "Erzurum"),
    ESKISEHIR(26, "Eskişehir"),
    GAZIANTEP(27, "Gaziantep"),
    GIRESUN(28, "Giresun"),
    GUMUSHANE(29, "Gümüşhane"),
    HAKKARI(30, "Hakkari"),
    HATAY(31, "Hatay"),
    IGDIR(76, "Iğdır"),
    ISPARTA(32, "Isparta"),
    ISTANBUL(34, "İstanbul"),
    IZMIR(35, "İzmir"),
    KAHIRAMANMARAS(46, "Kahramanmaraş"),
    KARABUK(78, "Karabük"),
    KARAMAN(70, "Karaman"),
    KARS(36, "Kars"),
    KASTAMONU(37, "Kastamonu"),
    KAYSERI(38, "Kayseri"),
    KILIS(79, "Kilis"),
    KIRIKKALE(71, "Kırıkkale"),
    KIRKLARELI(39, "Kırklareli"),
    KIRSEHIR(40, "Kırşehir"),
    KOCAELI(41, "Kocaeli"),
    KONYA(42, "Konya"),
    KUTAHYA(43, "Kütahya"),
    MALATYA(44, "Malatya"),
    MANISA(45, "Manisa"),
    MARDIN(47, "Mardin"),
    MERSIN(33, "Mersin"),
    MUGLA(48, "Muğla"),
    MUS(49, "Muş"),
    NEVSEHIR(50, "Nevşehir"),
    NIGDE(51, "Niğde"),
    ORDU(52, "Ordu"),
    OSMANIYE(80, "Osmaniye"),
    RIZE(53, "Rize"),
    SAKARYA(54, "Sakarya"),
    SAMSUN(55, "Samsun"),
    SIIRT(56, "Siirt"),
    SINOP(57, "Sinop"),
    SIVAS(58, "Sivas"),
    SANLIURFA(63, "Şanlıurfa"),
    SIRNAK(73, "Şırnak"),
    TEKIRDAG(59, "Tekirdağ"),
    TOKAT(60, "Tokat"),
    TRABZON(61, "Trabzon"),
    TUNCELI(62, "Tunceli"),
    USAK(64, "Uşak"),
    VAN(65, "Van"),
    YALOVA(77, "Yalova"),
    YOZGAT(66, "Yozgat"),
    ZONGULDAK(67, "Zonguldak");

    private int plakaKodu;
    private String isim;


    TurkiyeIller(int plakaKodu, String isim) {
        this.plakaKodu = plakaKodu;
        this.isim = isim;
    }

    public int getPlakaKodu() {
        return plakaKodu;
    }

    public String getIsim() {
        return isim;
    }
}
