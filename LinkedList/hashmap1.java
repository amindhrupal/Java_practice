import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 130);
        map.put("china", 150);
        map.put("USA", 30);

        // System.out.println(map);

        // if (map.containsKey("UA")) {
        // System.out.println("key exists");
        // } else {
        // System.out.println("key doesnt exist");
        // }

        // int arr[] = { 1, 3, 5 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int val : arr) {
        // System.out.print(val + " ");
        // }

        System.out.println();

        // for (Map.Entry<String, Integer> e : map.entrySet()) {
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());

        // }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("china");

    }

}