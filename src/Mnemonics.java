import collections.map.HashMap;
import collections.map.Map;

public class Mnemonics {

    // uninstantiable class
    private Mnemonics() {}

    private static Map<Character, Integer> keypad;

    static {
        keypad = new HashMap<>();

        String alphabet = "abcedfghijklmnopqrstuvwxyz";
        String keys = "22233344455566677778889999";

        // TODO create keypad map
    }

    public static String toNumber(String mnemonic) {
        // TODO

        return "";
    }

    public static String fromDigits(String digits) {
        // TODO

        return "";
    }

}
