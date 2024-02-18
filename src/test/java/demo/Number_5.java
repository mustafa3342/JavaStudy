package demo;

/*
Bir string ve integer array alan bir fonksiyon yazın. İnteger array, string de ki herhangi bir harfin index pozisyonunu belirtir.
Örnek :
String: hackerrank
Array : 1,4,5
1: birinci sıradaki a
4: dördüncü sıradaki e
5: beşinci sıradaki  r

Fonksiyon array olarak verilen indexlerdeki harfin en yakınındaki (sağa yada sola doğru) aynı harfin pozisyonunu dönecek. Aynı harften hiç yoksa -1 , birden fazla varsa en yakınındaki

Örnek üzerinden gidersek
1: a ya en yakın diğer a 7
4: başka e olmadığı için -1
5: r ye en yakın r 6

 */
public class Number_5 {

    public static void main(String[] args) {
        String str = "hackerrank";
        int[] indexes = {1,4,5};
        for(int index : indexes){
            int result = findNearestSameCharacter(str, index);
            System.out.println(result);
        }

    }

    public static int findNearestSameCharacter(String str, int index){

        char targetChar = str.charAt(index);
        int leftIndex = index-1;
        int rightIndex = index+1;

        while (leftIndex>=0 || rightIndex<str.length()) {
            if (leftIndex>=0 && str.charAt(leftIndex) == targetChar) {
                return leftIndex;
            }
            if (rightIndex<str.length() && str.charAt(rightIndex) == targetChar) {
                return rightIndex;
            }
            leftIndex--;
            rightIndex++;
        }
            return -1;


    }
}
