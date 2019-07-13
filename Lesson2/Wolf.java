public class Wolf {

    private String male;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");  
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Wolf " + name + " moves");
    }

    public void sit() {
        System.out.println("Wolf " + name + " sits");
    }

    public void run() {
        System.out.println("Wolf " + name + " runs");
    }

    public String howl() {
        return "Hooooow";
    }

    public void hunt() {
        System.out.println("Wolf " + name + " hunt");
    }
}