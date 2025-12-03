Ad Soyad: Şevval Yıldız
Öğrenci No: 250541025

    public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);                 // 3
        if (bob == 5) {                           // 4 (true)
            ping("not ");                         // 5
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;                             // 1
        int buzz = 2;                             // 1.1
        zoop("just for", bizz);                   // 2
        clink(2 * buzz);                          // 6
    }

    public static void clink(int fork) {
        System.out.print("It's ");                // 7
        zoop("breakfast ", fork);                 // 8
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more "); // 5.1 ve 9
    }
}
