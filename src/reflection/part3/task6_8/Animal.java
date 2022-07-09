package reflection.part3.task6_8;

@DeclaredClass()
public class Animal {
    private String species;
    private String classification;
    private int age;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + species + " Classification: " + classification + " Age: " + age;
    }
}
