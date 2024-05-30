package Test1;

import java.util.List;

public class Zoo {
    List<Animal> animalList;

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animalList=" + animalList +
                '}';
    }

    public Dog getDog(String name, double age){
        for (Animal animals: animalList) {
          if (animals instanceof Dog){
              Dog dog = (Dog)animals;
              if (dog.getName().equals(name) && dog.getAge() == age ){
                  return dog;
              }
          }
        }
        return null;
    }

}
