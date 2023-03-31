package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        map.put("New object", 4);
        System.out.println(map);
        map.removeByKey("New Object");
        System.out.println(map);
        map.removeByValue(4);
        System.out.println(map);
        map.keySet();
        System.out.println(map);


    }
}
