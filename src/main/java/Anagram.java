public class Anagram {
    public static void main(String[] args) {

        String text1 = "bacca";
        String text2 = "cabac";

    }

    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length())
            return false;

        for (int i = 0; i < text1.length(); i++) {
            int sumA = 0;
            int sumB = 0;
            for (int j = 0; j < text1.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) sumA++;
                if (text1.charAt(i) == text2.charAt(j)) sumB++;
            }
            if (sumA != sumB)
                return false;
        }
        return true;

    }
}






