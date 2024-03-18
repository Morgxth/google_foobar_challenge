package ing.grammar.checker;

public class PrimeNumberString {
    public static void main(String[] args) {
        int i = 3; // Пример порядкового номера элемента
        String fiveDigits = solution(i);
        System.out.println(fiveDigits);
    }

    private static String solution(int i) {
        StringBuilder primeStringBuilder = new StringBuilder();
        int count = 0;
        int number = 2;

        if (i < 10000 && i >= 0) {

            while (count < i + 5) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    if (count >= i) {
                        String primeStr = String.valueOf(number);
                        for (int j = 0; j < primeStr.length(); j++) {
                            primeStringBuilder.append(primeStr.charAt(j));
                        }
                    }
                    count++;
                }
                number++;
            }
        }
        return primeStringBuilder.substring(0, 5);
    }
}
