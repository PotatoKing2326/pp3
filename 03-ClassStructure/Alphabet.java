public class Alphabet {
    static char[] Alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static boolean isAlphabet(String t) {
        boolean correct = true;
        for (int x = 0; x < t.length(); x++) {
            if (t.charAt(x) == Alphabet[x]) {
                continue;
            } else {
                correct = false;
            }
        }
        return correct;
    }

    public static void main(String[] args) {
        System.out.println(isAlphabet("abcdefg"));
        System.out.println(isAlphabet("abcder"));
    }
}
