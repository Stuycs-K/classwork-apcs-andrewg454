public class ColorDemo{
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static final String HIDE_CURSOR = "\u001b[?25l";
    public static final String SHOW_CURSOR = "\u001b[?25h";
    public static final String RESET = "\u001b[0m";
    
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int YELLOW = 33;

    public static final int BOLD = 1;
    public static final int UNDERLINE = 4;

    public static void main(String[] args) throws InterruptedException {

        System.out.print(CLEAR_SCREEN);
        System.out.print(HIDE_CURSOR);

        for (int i = 0; i < 5; i++) {
            System.out.print(getColorAndModifier(RED, BOLD));
            System.out.print("W");
            System.out.print(getColorAndModifier(GREEN, UNDERLINE));
            System.out.print("e");
            System.out.print(getColorAndModifier(BLUE, BOLD));
            System.out.print("l");
            System.out.print(getColorAndModifier(MAGENTA, UNDERLINE));
            System.out.print("c");
            System.out.print(getColorAndModifier(CYAN, BOLD));
            System.out.print("o");
            System.out.print(getColorAndModifier(YELLOW, UNDERLINE));
            System.out.print("m");
            System.out.print(getColorAndModifier(RED, BOLD));
            System.out.print("e");
            System.out.print(RESET);

            System.out.println();
            Thread.sleep(500);
        }

        System.out.print(SHOW_CURSOR);
        System.out.print(RESET);
    }
    public static String getColorAndModifier(int color, int modifier) {
        return "\u001b[" + modifier + ";" + color + "m";
    }
}
