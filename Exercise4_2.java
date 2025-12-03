Ad Soyad: Şevval Yıldız
Öğrenci No: 250541025

  public class Exercise4_2 {

    // Program buradan başlar
    public static void main(String[] args) {              // 1
        zippo("rattle", 13);                             // 2
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);                       // 5
        zippo("ping", -5);                               // 6
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                                  // 7 (ikinci çağrıda true olacak)
            System.out.println(quince + " zoop");        // 8
        } else {
            System.out.println("ik");                    // 3
            baffle(quince);                              // 4
            System.out.println("boo-wa-ha-ha");          // 9
        }
    }
}
