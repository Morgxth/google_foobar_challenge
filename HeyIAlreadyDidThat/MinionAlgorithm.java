package ing.grammar.checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinionAlgorithm {

    public static int solution(String n, int b) {
        List<String> seen = new ArrayList<>();
        int k = n.length();
        while (!seen.contains(n)) {
            seen.add(n);
            String x = calculateX(n);
            String y = calculateY(n);
            String z = calculateZ(x, y, k, b);
            if (z.equals(n) || z.equals("0")) {
                return 1;
            }
            n = z;
        }
        return seen.size() - seen.indexOf(n);
    }

    private static String calculateX(String n) {
        char[] digits = n.toCharArray();
        Arrays.sort(digits);
        return new StringBuilder(new String(digits)).reverse().toString();
    }

    private static String calculateY(String n) {
        char[] digits = n.toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }

    private static String calculateZ(String x, String y, int length, int base){
        StringBuilder z = new StringBuilder(Integer.toString(Integer.parseInt(x, base) - Integer.parseInt(y, base), base));
        while (z.length() < length) {
            z.insert(0, "0");
        }
        return z.toString();
    }

    public static void main(String[] args) {
        int result = solution("210022", 3);
        System.out.println(result);
    }
}
