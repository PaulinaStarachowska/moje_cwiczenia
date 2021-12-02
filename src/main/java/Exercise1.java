public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Witaj świecie!");

        // Wynik dzielenia 13 przez 5 to : _X_, reszta: _Y_
        System.out.println("Wynik dzielenia 13 przez 5 to: " + 13 / 5 + ", reszta: " + 13 % 5);

        int myIntVariable = 10 + 5;
        System.out.println(myIntVariable);

        int x = 5;
        int y = 6;

        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);


            int sum = 0;
            for (int i = 1; i <= 50; i++) {
                sum = sum + i;
                System.out.println(sum);

            }
            System.out.println("\n-zadanie-");

            String text = "cośtam";
            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
            }
        }
    }
}
