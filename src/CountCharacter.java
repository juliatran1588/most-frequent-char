public class CountCharacter {
    public static Character findFirstMostFrequentCharIn (String str){
        if (str == null) {
            return null;
        }
		if (str.length() == 0) {
            return null;
        }
        Character maxAppear = null;
        int maxCount = 0;

        for(int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            int countX = 0;

            for(int j = 0; j < str.length(); j++) {
                if(x == str.charAt(j)) {
                    countX++;
                }
            }

            if (countX > maxCount) {
                maxCount = countX;
                maxAppear = x;
            }
        }
        return maxAppear;
    }
}
