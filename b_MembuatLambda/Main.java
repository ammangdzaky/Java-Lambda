package b_MembuatLambda;

public class Main {
    public static void main(String[] args) {

        // KODE : LAMBDA WWITH PARAMETER
        ActionWithParameter action1 = (name) -> {
            return "hello " + name;
        };


        // KODE : LAMBDA WITHOUT BLOK
        ActionWithParameter action2 = (name) -> "Hello " + name;


        System.out.println(action1.action("Asep"));
        System.out.println(action2.action("Dzaky"));
    }
}
