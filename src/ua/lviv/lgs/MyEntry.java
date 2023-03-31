package ua.lviv.lgs;
// 1 завдання:
// У Intreger можна додати String, використовуючи метод parseInt, але це не відноситься до теми уроку.
// А в List<Integer> не можна додати об'єкти типу String, тому тоді порушиться система типізації.
// До List<Interger> можна додати лише об'єкти типу Integer, але не об'єкти інших типів.
//Об'єкти різних типів можна зберігати в List<Object>, але можуть бути проблеми при запуску програми і за завданням потрібно додати до Integer.

//2 завдання:
public class MyEntry<K,V> {
     K key;
     V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

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

    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
