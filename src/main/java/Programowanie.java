public class Programowanie {
    public static void main(String[] args) {

        zadanie2("samolot");

        System.out.println("\n-zadanie 3-");
        System.out.println(zadanie3());

        System.out.println("\n-zadanie 5-");
        System.out.println(zadanie5("kot"));

        System.out.println("\n-zadanie 7-");
        int[] myIntArray = {4, 5};
        System.out.println(zadanie7(myIntArray));

    }

    private static void zadanie2(String text) {
        System.out.println(text);
    }

    private static int zadanie3() {
        return 5;
    }


    private static int zadanie5(String text) {
        return text.length();
    }

    private static int zadanie7(int[] myIntArray) {
        return myIntArray[0];
    }

}


