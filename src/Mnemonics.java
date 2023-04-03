import collections.map.HashMap;
import collections.map.Map;

public class Mnemonics {

    // uninstantiable class
    private Mnemonics() {}

    private static Map<Character, Integer> keypad;

    static {
        keypad = new HashMap<>();

        String alphabet = "abcedfghijklmnopqrstuvwxyz";
        String keys = "2223334445q5566677778889999";

        // TODO create keypad map

        // 2
        keypad.put('a',2);
        keypad.put('b',2);
        keypad.put('c',2);

        // 3
        keypad.put('d',3);
        keypad.put('e',3);
        keypad.put('f',3);

        // 4
        keypad.put('g',4);
        keypad.put('h',4);
        keypad.put('i',4);

        // 5
        keypad.put('j',5);
        keypad.put('k',5);
        keypad.put('l',5);

        // 6
        keypad.put('m',6);
        keypad.put('n',6);
        keypad.put('o',6);

        // 7
        keypad.put('p',7);
        keypad.put('q',7);
        keypad.put('r',7);
        keypad.put('s',7);

        // 8
        keypad.put('t',8);
        keypad.put('u',8);
        keypad.put('v',8);

        // 9
        keypad.put('w',9);
        keypad.put('x',9);
        keypad.put('y',9);
        keypad.put('z',9);

    }

    public static String toNumber(String mnemonic) {

         char[] keys = mnemonic.toCharArray();


        StringBuilder sb = new StringBuilder();
        sb.append('(');

        for (int i = 0; i < keys.length; i++)
        {
            if(i == 4)
            {
                sb.append(')');
                sb.append(" ");
            }

            if (i== 9)
                sb.append('-');

            if( keys[i] != '(' && keys[i] != ')' && keys[i]!= '-' && keys[i] != ' ')
            {
                int value = keypad.get(keys[i]);
                sb.append(value);
            }

        }

        return sb.toString();
    }

    public static String fromDigits(String digits) {

        String[] nums = digits.split(" ");

        Integer[] numbers = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            numbers[i] = Integer.parseInt(nums[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++)
        {


        }

        return "";
    }

}
