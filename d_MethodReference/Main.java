package d_MethodReference;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // 1. KODE : METHOD REFERENCE STATIC
//        Predicate<String> predicate = (s) -> StaticUtil.isLowerCase(s); -> lambda biasa
        Predicate<String> predicate = StaticUtil::isLowerCase;         // -> lambda reference
        System.out.println(predicate.test("dzaky"));

        // 4. KODE : METHOD REFERENCE PARAMETER
//        Function<String, String> toUpper = (s) -> s.toUpperCase();
        Function<String, String> toUpper = String::toUpperCase;     // -> artinya metthodnya merujuk ke parameter, (kan string punya method tuUpperCase)
    }

    public void run(){
        // 2.  KODE : METHDO REFERENCE NON STATIC
        Predicate<String> predicate = this::isLowerCase;
        System.out.println(predicate.test("dzaky"));
    }

    public void run2(){
        // 3. KODE : METHOD REFERENCE OBJECT
        Main object = new Main();
        Predicate<String> predicate = object::isLowerCase;
        System.out.println(predicate.test("dzaky"));
    }


    public boolean isLowerCase(String s){
        for(Character c : s.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
