import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int n = Integer.parseInt(reader.readLine()); // Anzahl der Testfälle
            for (int i = 0; i < n; i++) {
                String[] parts = reader.readLine().split(" ");
                int testType = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);
                testNumber(testType, number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testNumber(int testType, int number) {
        switch (testType) {
            case 1:
                System.out.println(oddTester.testNumber(number) ? "EVEN" : "ODD");
                break;
            case 2:
                System.out.println(primeTester.testNumber(number) ? "PRIME" : "NO PRIME");
                break;
            case 3:
                System.out.println(palindromeTester.testNumber(number) ? "PALINDROME" : "NO PALINDROME");
                break;
        }
    }

    public static void main(String[] args) {
        NumberTester tester = new NumberTester("numbers.txt");

        // Lambdas für die Tester
        tester.setOddEvenTester(n -> n % 2 == 0);
        tester.setPrimeTester(n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        });
        tester.setPalindromeTester(n -> {
            String s = String.valueOf(n);
            return s.equals(new StringBuilder(s).reverse().toString());
        });

        // Datei testen
        tester.testNumber(1, 6);  // Ausgabe: EVEN
        tester.testNumber(2, 11); // Ausgabe: PRIME
        tester.testNumber(3, 12344321); // Ausgabe: PALINDROME
    }
}

@FunctionalInterface
interface NumberTest {
    boolean testNumber(int number);
}
