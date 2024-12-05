public class Driver {
    public static int width = 80;
    public static int height = 30;

    public static void main(String[] args) {
        step5();
        step67();
    }

    public static void step5() {
        int borderColor = Text.MAGENTA;
        int middle = Text.WHITE;
        Text.color(borderColor);
        for (int i = 0; i < width; i++) {
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < height - 2; i++) {
            Text.color(middle);
            System.out.print(" ");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            System.out.println();
        }
        Text.color(borderColor);
        for (int i = 0; i < width; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void step67() {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            double rand = Math.random();
            numbers[i] = (int)(rand * 100);
        }

        int spacing = 26;
        Text.go(2, 10);

        for (int i = 0; i < 3; i++) {
            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.WHITE, Text.BLACK);
            }

            System.out.print(numbers[i]);

            if (i < 2) {
                for (int j = 0; j < spacing; j++) {
                    System.out.print(" ");
                }
            }
        }

        System.out.println();
        Text.color(Text.MAGENTA); 
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();

        Text.go(31, 0);
        System.out.print(Text.RESET);
    }
}
