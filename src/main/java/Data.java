import java.time.LocalDate;

public class Data {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Aktualna data: " + now);

        System.out.println("--zadanie 1--");
        System.out.println(zadanie1(5, 7));

        System.out.println("zadanie 2");
        System.out.println(zadanie2("samolot"));


        System.out.println("zadanie 3");
        System.out.println(zadanie3("pociąg"));
    }

    private static int zadanie1(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    public static char zadanie2(String text) {
        return text.charAt(0);
    }

    public static char zadanie3(String text) {
        return text.charAt(text.length() - 1);
    }
}
