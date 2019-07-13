public class JaegerTest {
  
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger();

    // private String modelName;
    // private String mark;
    // private String origin;
    // private float height;
    // private float weight;
    // private int speed;
    // private int strength;
    // private int armor;
        
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.2f);
        crimsonTyphoon.setWeight(1.722f);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);

        System.out.println("ModelName: " + crimsonTyphoon.getModelName());
        System.out.println("Makr: " + crimsonTyphoon.getMark());
        System.out.println("Origin: " + crimsonTyphoon.getOrigin());
        System.out.println("Height: " + crimsonTyphoon.getHeight());
        System.out.println("Weight: " + crimsonTyphoon.getWeight());
        System.out.println("Speed: " + crimsonTyphoon.getSpeed());
        System.out.println("Strength: " + crimsonTyphoon.getStrength());
        System.out.println("Armor: " + crimsonTyphoon.getArmor());
    }
}