package ContainerWithMostWater;

public class ContainerWithMostWater {

    public static int enKucuk(int sayi1, int sayi2){
        if (sayi1 < sayi2)
            return sayi1;
        else
            return sayi2;
    }

    public static int enBuyuk(int sayi1, int sayi2){
        if (sayi1 > sayi2)
            return sayi1;
        else
            return sayi2;
    }

    public static int enBuyukAlaniBul(int[] dizi){
        int sol = dizi[0];
        int sag = dizi.length - 1;
        int enBuyukAlan = 0;

        int hesaplananAlan;
        while (sol < sag){
            hesaplananAlan = enKucuk(dizi[sol],dizi[sag]) * (sag - sol);
            enBuyukAlan = enBuyuk(enBuyukAlan,hesaplananAlan);

            if(dizi[sol] < dizi[sag])
                sol++;
            else
                sag--;

            return enBuyukAlan;
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("En büyük alan: " + enBuyukAlaniBul(dizi));

    }
}
