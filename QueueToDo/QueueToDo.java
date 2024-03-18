package ing.grammar.checker;

    import java.util.ArrayList;
    import java.util.List;

public class QueueToDo {
    public static int solution(int start, int length) {

        int result = start;
        List<Integer> integerList = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();

        for (int i = length; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                tmpList.add(start);
                start++;
            }
            tmpList = tmpList.subList(0, i);
            integerList.addAll(tmpList);
            tmpList.clear();
        }
        integerList.remove(0);
        for (int num : integerList) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(17, 4));  // Output: 14
        System.out.println(solution(0, 3));   // Output: 2
    }
}

