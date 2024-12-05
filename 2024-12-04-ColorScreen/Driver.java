public class Driver{
    public static void main (String[] args){
step5();
    }   
    public static void step5(){
        int width = 80;
        int height = 30;
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
}