package generics.generics1;

public class Identifier<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void showIdentifier(K key, V value) {
        System.out.println("Ключ: " + key + " Значение: " + value);
    }
}
