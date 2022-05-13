package collections.map.task.t1_3;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private final Map<String, User> repository = new HashMap<>();

    public Map<String, User> getRepository() {
        return repository;
    }
}
