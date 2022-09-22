package HashMap;
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
    public static void main(String[] args) {
        String str = "ice cream";
        String result = removeVowel(str);
        System.out.println(result);
    }
}
