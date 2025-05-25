package g_LambdaDiOptional;

public class WithoutOption {
    public static void main(String[] args) {

        sayHello("dzaky");
        sayHello(null);     // error
    }

    public static void sayHello(String name){
        String upperName = name.toUpperCase();
        System.out.println("HELLO " + upperName);
    }
}
