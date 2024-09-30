import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest{
    //...

    public NumberTester(String fileName) {
        //TODO
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
}