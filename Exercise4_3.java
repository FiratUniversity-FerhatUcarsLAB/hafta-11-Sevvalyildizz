public class Exercise4_3 {

    public static void zoop() {
        baffle();                              // 3
        System.out.print("You wugga ");        // 6
        baffle();                              // 7
    }

    public static void main(String[] args) {
        System.out.print("No, I ");            // 1
        zoop();                                // 2
        System.out.print("I ");                // 9
        baffle();                              // 10
    }

    public static void baffle() {
        System.out.print("wug");               // 4 ve 8 ve 11
        ping();                                // 5 ve 12
    }

    public static void ping() {
        System.out.println(".");               // 5.1 ve 12.1
    }
}
