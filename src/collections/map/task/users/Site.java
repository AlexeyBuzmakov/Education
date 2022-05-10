package collections.map.task.users;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Site {
    private static int count;
    Repository repository = new Repository();

    public void createRepository() {
        while(count < 10) {
            repository.getRepository().put(generateLogin(), generateUser());
            count++;
        }
    }

    public void printRepository() {
        Set<Map.Entry<String, User>> users = repository.getRepository().entrySet();
        for(Map.Entry<String, User> user : users) {
            System.out.println(user);
        }
    }

    private User generateUser() {
        return new User();
    }

    private String generateLogin() {
        char[] login = new char[6];
        for (int i = 0; i < login.length; i++) {
            login[i] = (char) (65 + Math.random() * 26);
        }
        return String.valueOf(login);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        repository.getRepository().containsKey(scanner.nextLine());
    }
}
