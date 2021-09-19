import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static Character findFirstMostFrequentCharIn(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return null;
        }
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        int maxCount = Collections.max(charCountMap.values());
        Character maxAppear = null;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxAppear = entry.getKey();
                break;
            }
        }
        return maxAppear;
    }
}
