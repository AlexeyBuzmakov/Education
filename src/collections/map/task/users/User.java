package collections.map.task.users;

public class User {
    private final Gender gender;
    private final int age;
    private final String password;

    public User(Gender gender, int age, String password) {
        this.gender = gender;
        this.age = age;
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Пароль: " + password + " Пол: " + gender + " Возраст: " + age;
    }
}
