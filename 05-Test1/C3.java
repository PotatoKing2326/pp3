public class C3 {
    static char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static boolean isAlphabet(String t) {
        for (int x = 0; x < t.length(); x++) {
            if (t.charAt(x) != alphabetArray[x]) {

                return false;

            }

        }
        return true;
    }

    static String hideText(String t) {
        String asterisk = "";
        if (t.length() > 2){
            for (int x = 0; x < t.length()-2; x++) {
                asterisk += "*";
            }
        }
        return t.substring(0, 1) + asterisk + t.substring(t.length()-1, t.length()); 
    }

    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abcdefg"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("ok"));
    }
}
