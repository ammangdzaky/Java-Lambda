package A_PengenalanLambda;

public class Main {
    public static void main(String[] args) {

        // Menggunakan anonymous class
        ActionInterface action1 = new ActionInterface(){
            @Override
            public String action(){
                return "Action 1";
            }
        };

        // Menggunakan Lambda
        ActionInterface action2 = () ->{
            return "Action 2";
        };

        System.out.println(action1.action());
        System.out.println(action2.action());
    }
}
