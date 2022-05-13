package collections.map.task.t1_3;

public class User {
    private final String login;
    private final String gender;
    private final int age;
    private final String password;

    public User(String login, String gender, int age, String password) {
        this.login = login;
        this.gender = gender;
        this.age = age;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getGender() {
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
        return password + " Пол: " + gender + " Возраст: " + age;
    }
}
