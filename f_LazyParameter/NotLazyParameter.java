package f_LazyParameter;

public class NotLazyParameter {
    public static void main(String[] args) {

        testScore(90, getName("Dzaky"));

        testScore(60, getName("Asep")); // parameter kedua tetap dieksekusi, walaupun tidak diakses
    }

    public static void testScore(int value, String name){
        if(value > 80){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else{
            System.out.println("Coba Lagi Tahu Depan"); //  -> parameter kedua tidak diakses
        }

    }

    public static String getName(String name){
        System.out.println("Method digunakan...");
        return name;
    }
}
