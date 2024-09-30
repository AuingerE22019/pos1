public class Demo {
    Calculator add = ((number1, number2) -> number1 + number2);
    Calculator add2 = (Integer::sum);

    Calculator subtract = ((number1, number2) -> number1-number2);

    GenericMapper<float> mapFloat = param -> "This is a float" + param.toString();
    GenericMapper<int> mapInt = param ->  "This is a int" + param.toString();

    TextFormater formater;

    public int add(int number1, int number2) {
        return add.calculate(number1, number2);
    }

    public void isFormatted(TextFormater formater) {
        this.formater = formater;
    }

    public String formatText(String text, TextFormater formater) {
        return formater.format(text);
    }
}
