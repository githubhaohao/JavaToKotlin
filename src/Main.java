import java.util.*;

/**
 * Created by HaohaoChang on 2017/5/25.
 */
public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Kotlin");
        map.put(3, "iOS");
        map.put(4, "React Native");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }

        List<String> list = Arrays.asList("java", "c++", "Android", "Kotlin", "iOS");

        for(int i = 0; i < list.size(); i++ ) {
            list.set(i, "Hello " + list.get(i));
            if (!list.get(i).contains("c")) {
                System.out.println(list.get(i));
            }
        }


    }
}
