import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        char c = 'a';
        Map<Character,Integer> res = new HashMap<Character, Integer>();
        for (int i = 1;i < 27;i++){
            res.put(c,i);
            c += 1;
        }
        return res;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer L : nums){
            map.put(L,L*L);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String,Integer> counts = new HashMap<>();
        for (String s : words){
            Integer v = counts.get(s);
            if (v == null){
                v = 0;
            }
            counts.put(s,v + 1);
        }
        return counts;
    }
}
