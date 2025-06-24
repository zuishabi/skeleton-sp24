import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int res = 0;
        for (Integer integer : L) {
            res += integer;
        }
        return res;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> res = new ArrayList<Integer>();
        for (Integer integer : L) {
            if (integer % 2 == 0) {
                res.add(integer);
            }
        }
        return res;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer>res = new ArrayList<Integer>();
        for (int i : L1){
            if (L2.contains(i)){
                res.add(i);
            }
        }
        return res;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int time = 0;
        for(String s : words){
            for (int i = 0;i < s.length();i++){
                if (s.charAt(i) == c){
                    time += 1;
                }
            }
        }
        return time;
    }
}
