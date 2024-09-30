import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Demon demo = new Demo();

        TextFormater ask = text -> text + ")";
        TextFormater etc = text -> text + "";

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("8");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);
    }
}
