package demo;

/*
Bir array deki her elemanin kendinden once gelen elemanlarla arasindaki farka bakip en buyuk farki bulmamiz gerekiyor.
Ornek: const arr = [5, 3, 4, 8]
ilk elemani atliyorum oncesi yok cunku.
2. eleman icin:
3-5 =0
3. eleman icin:
4-3 = 1
4-5 = -1
4. eleman icin:
8-4=4
8-3=5
8-5=3
Bu array icin sonuc 5 donmeli. Eger en buyuk fark bir pozitif sayi degil ise -1 donmeli.

 */


public class MaxDif_4 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 8};
        int maxDifference = findMaxDifference(arr);
        System.out.println("En büyük fark: " + maxDifference);
        System.out.println(maximumDifference(arr));
    }

    public static int findMaxDifference(int[] arr) {
        if (arr.length <= 1) {
            return -1; // Dizide en az iki eleman olmalıdır.
        }

        int maxDiff = Integer.MIN_VALUE; // Başlangıçta en büyük farkı en küçük değerle başlat
        int minSoFar = arr[0]; // Şu ana kadar görülen en küçük değeri sakla

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minSoFar); // En büyük farkı güncelle
            minSoFar = Math.min(minSoFar, arr[i]); // Şu ana kadar görülen en küçük değeri güncelle
        }

        return maxDiff > 0 ? maxDiff : -1; // Eğer en büyük fark pozitifse, maxDiff'i döndür; aksi halde -1 döndür
    }

    public static int maximumDifference(int[] arr){
        //if(arr.length<1){ //array length should be 2 at least
        //    return -1;
        //}
        int maxdiff = Integer.MIN_VALUE;
        int minSoFar = arr[0]; //min value of array so far
        for(int i=1; i<arr.length; i++){
            maxdiff = Math.max(maxdiff, arr[i]-minSoFar);
            minSoFar = Math.min(minSoFar, arr[i]);

        }
        if (maxdiff>0){
            return maxdiff;
        }else {
            return -1;
        }
    }
}
