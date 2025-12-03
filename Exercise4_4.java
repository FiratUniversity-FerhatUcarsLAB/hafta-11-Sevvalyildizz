Ad Soyad:Şevval Yıldız
Öğrenci No:250541025
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Hiçbir şey olmaz. Metot 42 değerini döndürür ama biz kullanmadığımız için
        // ekrana herhangi bir çıktı verilmez. Sadece değer boşa gider.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Hata verir. Çünkü sayHello() void döner, yani bir değer döndürmez.
        // Bu yüzden 7 ile toplanamaz ve derleme hatası oluşur.
    }
}

