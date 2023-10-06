import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 1, 1, 3, 4};
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int element : arr) {
            countMap.put(element, countMap.containsKey(element) ? countMap.get(element) + 1 : 1);
        }
        int maxValue = 0;
        int maxFreqValue = -1;
        for (Integer key : countMap.keySet()) {
            if (maxValue < countMap.get(key)) {
                maxValue = countMap.get(key);
                maxFreqValue = key;
            }
        }

        System.out.println("Số " + maxFreqValue + " xuất hiện nhiều nhất (" + maxValue + " lần).");
    }
}