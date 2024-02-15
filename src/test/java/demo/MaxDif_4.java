package demo;

public class MaxDif_4 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 8};
        int maxDifference = findMaxDifference(arr);
        System.out.println("En büyük fark: " + maxDifference);
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
}
