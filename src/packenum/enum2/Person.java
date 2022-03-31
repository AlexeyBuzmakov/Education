package packenum.enum2;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender determineGenderPerson(String genderPerson) {
        switch(genderPerson) {
            case "Male" -> {return Gender.MALE;}
            case "Female" -> {return Gender.FEMALE;}
        }
        return null;
    }
}
