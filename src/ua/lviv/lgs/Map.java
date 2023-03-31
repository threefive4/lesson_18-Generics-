package ua.lviv.lgs;

import java.util.*;

public class Map<K, V> {
    private List<MyEntry<K, V>> list = new ArrayList<>();

    public void put(K key, V value) {
        for (MyEntry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new MyEntry<>(key, value));
    }

    public void removeByKey(K key) {
        Iterator<MyEntry<K, V>> iterator = list.iterator();
        while (iterator.hasNext()) {
            MyEntry<K, V> entry = iterator.next();
            if (entry.getKey().equals(key)) {
                iterator.remove();
            }
        }
    }

    public void removeByValue(V value) {
        Iterator<MyEntry<K, V>> iterator = list.iterator();
        while (iterator.hasNext()) {
            MyEntry<K, V> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }

    public void keySet() {
        Set<K> set = new HashSet<>();
        for (MyEntry<K, V> entry : list) {
            set.add(entry.getKey());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (MyEntry<K, V> entry : list) {
            builder.append(entry.toString()).append(", ");
        }
        if (builder.length() > 1) {
            builder.delete(builder.length() - 2, builder.length());
        }

        builder.append("}");
        return builder.toString();
    }
}

