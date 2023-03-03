public class App {
    public static void main(String[] args) throws Exception {
        Dog snoop = new Dog("Snoop Dogg", 'M', 2, 0.42f, 4.2f); // Construtor mais simples
    Dog albus = new Dog("Albus Dumbledog", "poodle", "white", 'M', 2, 0.42f, 10.2f, true); // Construtor mais completo

    
        snoop.description();
        albus.description();

    
        System.out.println(snoop.imcc());
    System.out.println(albus.imcc());
    }
}

class Dog {
    private int age;
    private String breed;
    private String color;
    private boolean hasVaccine;
    private String name;
    private char sex;
    private float size;
    private float thirstMeter;
    private float weight;

    public Dog(String name, char sex, int age, float size, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.breed = "vira-lata";
        this.color = "caramelo";
        this.hasVaccine = false;
    }

    public Dog(
            String name,
            String breed,
            String color,
            char sex,
            int age,
            float size,
            float weight,
            boolean hasVaccine) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.hasVaccine = hasVaccine;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == "") {
            return;
        }

        this.name = name;
    }

    public boolean getHasVaccine() {
        return this.hasVaccine;
    }

    public void setHasVaccine(boolean hasVaccine) {
        this.hasVaccine = hasVaccine;
    }

    public void description() {
        String sexStr = this.sex == 'M' ? "macho" : "fêmea";
        String vaccineStr = this.hasVaccine ? "vacinado" : "não vacinado";

        System.out.printf(
                "%s, %d anos - %s\n%s %s cor %s, de porte %.2f e peso %.2f\n", this.name, this.age, vaccineStr,
                this.breed,
                sexStr, this.color, this.size, this.weight);
    }

    public String imcc() {
        

        String imccDescription;
        float imcc = this.weight / (this.size * this.size);

        if (imcc <= 18.5) {
            imccDescription = "Abaixo do peso";
        } else if (imcc <= 25.0) {
            imccDescription = "Peso normal";
        } else if (imcc <= 30) {
            imccDescription = "Acima do peso";
        } else {
            imccDescription = "Obeso";
        }

        return imccDescription;
    }

    public String bark() {
        String[] barkSounds = { "Woof-woof", "au, au", "bau, bau", "vogh, vogh", "ruff, ruff", "arf, arf", "yap, yap" };
        int i = (int) (Math.random() * barkSounds.length);
        return barkSounds[i];
    }
}
