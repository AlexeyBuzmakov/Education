package collections.map;

import java.util.Arrays;
import java.util.List;

public class HashMap<K, V> {
    private final Node<K, V>[]map;
    private final int capacity;
    private int size;

    public HashMap() {
        capacity = 50;
        map = new Node[capacity];
    }

    private static class Node<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V>next;

        public Node(int hash, K key, V value, Node<K, V>next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Key: " + key + " Value: " + value;
        }
    }

    public void put(K key, V value) {
        int hash = hash(key);
        int index = getIndex(hash);
        Node<K, V>newNode = new Node<>(hash, key, value, map[index + 1]);
        map[index] = newNode;
    }

    public Node<K, V> get(K key) {
        int index = getIndex(hash(key));
        return map[index];
    }

    public static int hash(Object... values) {
        return hashCode(values);
    }

    public static int hashCode(Object[]a) {
        if(a == null) {
            return 0;
        }
        int result = 1;
        for(Object element : a) {
            result = 31 * result + (element == null ? 0 : element.hashCode());
        }
        return result;
    }

    private int getIndex(int hash) {
        return hash & (capacity - 1);
    }

    public void printMap() {
        for(Node<K, V> maps : map) {
            if(maps != null) {
                System.out.println(maps);
            }
        }
    }
}
