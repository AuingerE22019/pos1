import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest{
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
        //TODO
    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}