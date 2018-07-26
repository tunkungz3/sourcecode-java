
public class WorkshopLoop {

    public static void main(String[] args) {
        generateStar(9);
    }

    private static void generateStar(int length) {
        System.out.println(" **   **");
        lineTwo(length);
        for (int i = 0; i < 6; i++) {
            printWhitespace(i);
            printStar(length);
            length -= 2;
            System.out.println();
        }
    }

    private static void lineTwo(int length) {
        for(int i=0;i<length;i++) {
            if(i == length/2)
                System.out.print(" ");
            else
                System.out.print("*");
        }
        System.out.println();
    }

    private static void printStar(int length) {
        for (int j = 0; j < length; j++) {
            System.out.print("*");
        }
    }

    private static void printWhitespace(int i) {
        for (int z = 0; z < i; z++)
            System.out.print(" ");
    }

}
