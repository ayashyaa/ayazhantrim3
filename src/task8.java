public class task8 {
    public static boolean isDigitString(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isDigitString(s, index + 1);
    }

    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123a12";

        System.out.println(s1 + ": " + (isDigitString(s1,0) ? "Yes" : "No"));
        System.out.println(s2 + ": " + (isDigitString(s2,0) ? "Yes" : "No"));

    }
}
