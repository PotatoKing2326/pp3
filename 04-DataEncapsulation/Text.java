public class Text {
    String text = "Have a nice day";

    void numberOfCharacters(String text) {
        String textWithoutSpaces = text.replace(" ", "");
        System.out.println(textWithoutSpaces.length());
    }

    void firstNineCharacters(String text) {
        System.out.println(text.substring(0, 8));
    }

    void endOfStringIsDay(String text) {
        if (text.substring(text.length()-4, text.length()) == "day!") {
            System.out.println("True");
        }
    }

    void textNotEmpty(String text) {
        
    }
}
