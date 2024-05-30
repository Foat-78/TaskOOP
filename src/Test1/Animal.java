package Test1;

public class Animal {
    protected String name;
    protected String voice;
    protected double weight;

    public Animal(String name, String voice, double weight) {
        if (name == null || name.length() < 3){
            this.name = "<Имя>";
        }else {
            this.name = name;
        }
        this.voice = voice;
        if (weight < 3 || weight > 50){
            this.weight = 45;
        }else {
            this.weight = weight;
        }
    }
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public String getName() {
        return name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void initDisplay(/*String name, String voice, double weight*/){
        System.out.printf("%s бежит %s и у него вес составляет %s\n", name, voice, weight);
    }

}
