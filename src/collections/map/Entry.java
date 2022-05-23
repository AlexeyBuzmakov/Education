package collections.map;
import java.util.LinkedList;

class Entry<K, V> {
    LinkedList<Entry<K, V>>[] table = new LinkedList[50];

    public Entry() {
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        table[key.hashCode() & table.length - 1].add(new Entry<>());
    }

    public void printTable() {
        for(LinkedList<Entry<K, V>> tables : table) {
            if(tables != null) {
                System.out.println(tables);
            }
        }
    }
}
