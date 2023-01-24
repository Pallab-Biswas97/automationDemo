	package javaAssiginment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaQ12 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "P");
        map.put(2, "a");
        map.put(3, "l");
        map.put(4, "l");
        map.put(5, "a");
        map.put(6, "b");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valueList = new ArrayList<>(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);

	}

}
