package ing.grammar.checker;

public class FuelInjectionPerfection {
     public static int solution(String x) {
            int steps = 0;
            long n = Long.parseLong(x);

            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else if (n == 3 || (n % 4 == 1)) {
                    n--;
                } else {
                    n++;
                }
                steps++;
            }

            return steps;
        }

        public static void main(String[] args) {
            // Примеры использования
            System.out.println(solution("4"));   // Должно вернуть 2
            System.out.println(solution("15"));  // Должно вернуть 5
        }
}
