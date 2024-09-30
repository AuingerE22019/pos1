import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hallo", "Java", "mit", "ForEach");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);
    }
}
