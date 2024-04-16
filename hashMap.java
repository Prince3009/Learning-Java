import java.util.*;

public class hashMap {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Prince");
        map.put("Actor", "John");
        map.put("Ceo", "Victor");
        map.put("myName", "Kumar");

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + "  " + map.get(key));
        }
    }
}
