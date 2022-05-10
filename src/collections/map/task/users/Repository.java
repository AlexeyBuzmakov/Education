package collections.map.task.users;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private final Map<String, User> repository = new HashMap<>();

    public Map<String, User> getRepository() {
        return repository;
    }
}
