package collections.map;
import java.util.LinkedList;

class HashMap<K, V> {
    private static final double LOAD_FACTOR = 0.75;
    private LinkedList<Entry<K, V>>[]table;
    private int size;
    private int capacity;

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public HashMap() {
        capacity = 16;
        table = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Key: " + key + " Value: " + value;
        }
    }

    public void put(K key, V value) {
        int index = key.hashCode() & capacity - 1;
        Entry<K, V> entry = new Entry<>(key, value);
        if (table[index].size() == 0) {
            table[index].addFirst(entry);
            size++;
            return;
        }
        for (Entry<K, V> entries : table[index]) {
            if (entries.key.hashCode() == key.hashCode() && entries.key.equals(key)) {
                entries.value = value;
                break;
            }
            table[index].addLast(entry);
            size++;
        }
        rehashing();
    }

    public void remove(K key) {
        int index = key.hashCode() & capacity - 1;
        if(table[index].size() != 0) {
            for(Entry<K, V> entries : table[index]) {
                if(entries.key.hashCode() == key.hashCode() && entries.key.equals(key)) {
                    table[index].remove(entries);
                    size--;
                    break;
                }
            }
        }
    }

    public V get(K key) {
        int index = key.hashCode() & capacity - 1;
        if(table[index].size() != 0) {
            for(Entry<K, V> entries : table[index]) {
                if(entries.key.hashCode() == key.hashCode() && entries.key.equals(key)) {
                    return entries.value;
                }
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int index = key.hashCode() & capacity - 1;
        if(table[index].size() != 0) {
            for(Entry<K, V> entries : table[index]) {
                if(entries.key.hashCode() == key.hashCode() && entries.key.equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void rehashing() {
        if (checkLoadFactor()) {
            capacity *= 2;
            LinkedList<Entry<K, V>>[] newTable = new LinkedList[capacity];
            for (int i = 0; i < capacity; i++) {
                newTable[i] = new LinkedList<>();
            }

            for (LinkedList<Entry<K, V>> entryLinkedList : table) {
                if (entryLinkedList.size() != 0) {
                    for (Entry<K, V> entries : entryLinkedList) {
                        newTable[entries.key.hashCode() & capacity - 1].addLast(entries);
                    }
                }
            }
            table = newTable;
        }
    }

    private boolean checkLoadFactor() {
        return (float) size / capacity >= LOAD_FACTOR;
    }

    public void printTable() {
        for (LinkedList<Entry<K, V>> entryLinkedList : table) {
            if (entryLinkedList.size() != 0) {
                for (Entry<K, V> entries : entryLinkedList) {
                    if (entries != null) {
                        System.out.println(entries + " ");
                    }
                }
            }
        }
    }
}
