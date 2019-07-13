public class Wolf {

    String male = "Male";
    String name = "Ben";
    float weight = 10.1f;
    int age = 6;
    String color = "Brown";

    void go() {
        System.out.println("Wolf " + name + " moves");
    }

    void sit() {
        System.out.println("Wolf " + name + " sits");
    }

    void run() {
        System.out.println("Wolf " + name + " runs");
    }

    String howl() {
        return "Hooooow";
    }

    void hunt() {
        System.out.println("Wolf " + name + " hunt");
    }
}