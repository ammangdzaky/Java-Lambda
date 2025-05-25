package f_LazyParameter;

import java.util.function.Supplier;

public class LazyParameter {
    public static void main(String[] args) {


        testScore(90, () -> getName("Dzaky"));
        testScore(60, () -> getName("Asep"));       // -> parameter kedua tidak akan dieksekusi
    }

    public static void testScore(int value, Supplier<String> name) {
        if (value > 80){
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else{
            System.out.println("Coba Lagi Tahun Depan");    //  -> parameter kedua tidak diakses
        }
    }

    public static String getName(String name){
        System.out.println("Method diguanakan.....");
        return name;
    }
}
