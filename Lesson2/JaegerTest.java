public class JaegerTest {
  
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 8);

        System.out.println("ModelName: " + crimsonTyphoon.getModelName());
        System.out.println("Makr:" + crimsonTyphoon.getMark());
        System.out.println("Origin: " + crimsonTyphoon.getOrigin());
        System.out.println("Strength: " + crimsonTyphoon.getStrength());
    }
}