Ad Soyad: Şevval Yıldız
Öğrenci No: 250541025

    public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // multadd(a, b, c) = a * b + c
        return a * b + c;
    }

    public static double expSum(double x) {
        // expSum(x) = x * e^(-x) + sqrt(1 - e^(-x))
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {

        // Test 1: basit multadd
        System.out.println(multadd(1.0, 2.0, 3.0)); 
        // Beklenen çıktı: 5.0

        // Test 2: expSum fonksiyonu
        System.out.println(expSum(2.0));
        // x = 2 için expSum hesaplar
    }
}

