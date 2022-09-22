package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Remove {
    public static String removeVowel(String str){
        Set<Character> vowels = Set.of('a', 'o', 'u', 'i', 'e');
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (Character s:chars){
            if (!vowels.contains(s)){
                sb.append(s);
            }
        }
        return sb.toString();

    }
    public static int firstNonRepeatedCharacter(String str){
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch :chars){
            characterIntegerMap.put(ch,characterIntegerMap.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (characterIntegerMap.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "ice cream";
        String result = removeVowel(str);
        System.out.println(result);
        System.out.println(firstNonRepeatedCharacter("racecars"));
    }
}
