package SeminarD2;

public abstract class Animal {
    private String name;
    public abstract void voice();
//    {
//    System.out.println("Животное подаёт голос");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump(){
        System.out.println("Животное прыгает");


    }
}
