
public class WorkingWithLoop {

    public static void main(String[] args) {
        int countLoop = 1;
        int sum = 0;
        int length = 10;
        while (true) {
            if (sumation(countLoop,length))
                break;
            sum += countLoop++;
        }
        System.out.println(sum);
    }

    private static boolean sumation(int countLoop,int length) {
        return countLoop > length;
    }

}
