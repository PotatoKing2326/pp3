public class Text {
    String text = "Have a nice day";

    void numberOfCharacters() {
        String textWithoutSpaces = text.replace(" ", "");
        System.out.println(textWithoutSpaces.length());
    }

    void firstNineCharacters() {
        System.out.println(text.substring(0, 9));
    }

    void endOfStringIsDay() {
        if (text.substring(text.length()-4, text.length()) == "day!") {
            System.out.println("True");
        }
    }

    void textNotEmpty() {
        if (text != "") {
            System.out.println("True");
        }
    }

    void indexOfLastE() {
        for (int i = text.length()-1; i >= 0; i--) {
            if (text.substring(i) == "e") {
                System.out.println(i);
            }
        }
    }

    void spaceReplacedByMinus() {
        String newText = text.replace(" ", "-");
        System.out.println(newText);
    }

    void upperCase() {
        String upperCaseText = text.substring(0).toUpperCase();
        System.out.println(upperCaseText);
    }

    public static void main(String[] args) {
        Text testText = new Text();

        testText.numberOfCharacters();
        testText.firstNineCharacters();
        testText.endOfStringIsDay();
        testText.textNotEmpty();
        testText.indexOfLastE();
        testText.spaceReplacedByMinus();
        testText.upperCase();

    }
}
