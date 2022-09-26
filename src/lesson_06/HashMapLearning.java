package src.lesson_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {

    public static void main(String[] args) {

        Map<Integer, String> emergencyList = new HashMap<>();

        // 1. INPUT value into map
        emergencyList.put(113, "CSCH");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others A");

        // 2. GET value base on key
        System.out.println(emergencyList.get(113));

        //Get all value in map
        // . đọc là dot notation
        //emergencyList.keySet() -> get toan bo key trong map
            //1st : loop trực tiếp dự trên key
            for (Integer key : emergencyList.keySet()) {
                System.out.println(emergencyList.get(key));
            }

            //2nd
            Set<Integer> allkeys = emergencyList.keySet();
            for (Integer key : allkeys) {
                System.out.println(emergencyList.get(key));
            }

        /* 3. REMOVE
        * Loop over all values
        * if the value is equals "Others A"
        *   then remove
        * (*) Chuỗi giống hoàn toàn thì mới remove
        */

        for (Integer key : allkeys) {
            if (emergencyList.get(key).equals("Others")){
                emergencyList.remove(key);
            }
        }

        // 4. REPLACE
        //1st
        emergencyList.replace(116, "sth new");

        //2st  chuỗi giống hoàn toàn thì mới replace
        emergencyList.replace(116, "Others A", "sth new");

        // 5. ConcurrentModificationException : https://sdetpro.com/article/java-for-qa-engineers/hashmap


        // 6. find value : tim gia tri dung chinh xac

        System.out.println(emergencyList.containsValue("Cap Cuu"));
        System.out.println(emergencyList.containsKey(117));
    }
}
