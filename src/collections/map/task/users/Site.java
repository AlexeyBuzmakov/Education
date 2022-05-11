package collections.map.task.users;

import java.util.*;

public class Site {
    Utils utils = new Utils();
    Repository repository = new Repository();

    public void openMenu() {
        createRepository();
        showRepository();
        input();
    }

    private void createRepository() {
        int count = repository.getRepository().size();
        while (count < 10) {
            repository.getRepository().put(generateLogin(), generateUser());
            count++;
        }
    }

    public void showRepository() {
        Set<Map.Entry<String, User>> users = repository.getRepository().entrySet();
        for (Map.Entry<String, User> user : users) {
            System.out.println( "Логин: " + user.getKey() + " " + user.getValue());
        }
    }

    private User generateUser() {
        return new User(generateLogin() ,generateGender(), generateAge(), generatePassword());
    }

    private String generateGender() {
        Random random = new Random();
        boolean gender = random.nextBoolean();
        if (gender) {
            return "Male";
        }
        return "Female";
    }

    private int generateAge() {
        return (int) (18 + Math.random() * 60);
    }

    private String generateLogin() {
        char[] login = new char[6];
        for (int i = 0; i < login.length; i++) {
            login[i] = (char) (65 + Math.random() * 26);
        }
        return String.valueOf(login);
    }

    private String generatePassword() {
        char[] password = new char[6];
        for (int i = 0; i < password.length; i++) {
            password[i] = (char) (48 + Math.random() * 9);
        }
        return String.valueOf(password);
    }

    private void input() {
        System.out.println("Введите логин");
        if (inputLogin()) {
            System.out.println("Введите пароль");
            if (inputPassword()) {
                showInfoCurrentUser();
                return;
            }
            System.out.println("Неверный пароль. Попробуйте ещё раз");
            input();
        }
        System.out.println("Такого пользователя не существует. Зарегистрируйтесь");
        registrationUser();
    }

    private void registrationUser() {
        System.out.println("Укажите ваш пол.");
        System.out.println("1. Мужской \n2. Женский");
        String gender = indicateGender();
        System.out.println("Укажите ваш возраст.");
        int age = indicateAge();
        System.out.println("Придумайте логин (6 символов)");
        String login = createLogin();
        System.out.println("Введите пароль (6 символов");
        String password = createPassword();
        User user = createUser(login ,gender, age, password);
        addUser(user.getLogin(), user);
        System.out.println("Поздравляем! Пользователь зарегистрирован");
    }

    private void addUser(String login, User user) {
        repository.getRepository().put(login, user);
    }

    private User createUser(String login, String gender, int age, String password) {
        return new User(login ,gender, age, password);
    }

    private String createLogin() {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        if(login.length() != 6) {
            System.out.println("Логин должен состоять из 6 символов");
            createLogin();
        }
        if(repository.getRepository().containsKey(login)) {
            System.out.println("Логин уже занят. Повторите ввод");
            createLogin();
        }
        return login.toUpperCase();
    }

    private String indicateGender() {
        Scanner scanner = new Scanner(System.in);
        switch(scanner.nextInt()) {
            case 1: return "Male";
            case 2: return "Female";
            default:
                System.out.println("Ошибка ввода");
                indicateGender();
        }
        return null;
    }

    private int indicateAge() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        System.out.println("Некорректный ввод");
        indicateAge();
        return 0;
    }

    private String createPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(password.length() != 6) {
            System.out.println("Пароль должен состоять из 6 символов");
            createPassword();
        }
        return password;
    }


    private boolean inputLogin() {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine().toUpperCase();
        utils.setCurrentUser(repository.getRepository().get(login));
        return repository.getRepository().containsKey(login);
    }

    private boolean inputPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        return utils.getCurrentUser().getPassword().equals(password);
    }

    private void showInfoCurrentUser() {
        System.out.println("Пол:" + utils.getCurrentUser().getGender() + " Возраст:" + utils.getCurrentUser().getAge());
    }


    public void showCountUsers() {
        System.out.println(repository.getRepository().size());
    }

    public void showListLogins() {
        System.out.println(repository.getRepository().keySet());
    }
}
