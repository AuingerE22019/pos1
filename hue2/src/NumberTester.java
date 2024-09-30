import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String filename;

    public NumberTester(String fileName) {
        this.filename = fileName;
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

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            int numberOfTests = Integer.parseInt(line);

            for (int i = 0; i < numberOfTests; i++) {
                line = br.readLine();
                String[] parts = line.split(" ");
                int testType = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);

                switch (testType) {
                    case 1 -> {
                        if (oddTester != null) {
                            boolean result = oddTester.testNumber(number);
                            System.out.println(result ? "EVEN" : "ODD");
                        }
                    }
                    case 2 -> {
                        if (primeTester != null) {
                            boolean result = primeTester.testNumber(number);
                            System.out.println(result ? "PRIME" : "NO PRIME");
                        }
                    }
                    case 3 -> {
                        if (palindromeTester != null) {
                            boolean result = palindromeTester.testNumber(number);
                            System.out.println(result ? "PALINDROME" : "NO PALINDROME");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumberTester tester = new NumberTester("testfile.txt");

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

        tester.testFile();
    }
}
