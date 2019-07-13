public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        // private String male = "Male";
        // private String name = "Ben";
        // private float weight = 10.1f;
        // private int age = 6;
        // private String color = "Brown";

        wolfOne.setMale("Male");
        wolfOne.setName("Ben");
        wolfOne.setWeight(10.1f);
        wolfOne.setAge(10);
        wolfOne.setColor("Brown");

        System.out.println("Gender: " + wolfOne.getMale());
        System.out.println("Name: " + wolfOne.getName());
        System.out.println("Weight: " + wolfOne.getWeight());
        System.out.println("Age: " + wolfOne.getAge());
        System.out.println("Color: " + wolfOne.getColor());

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}