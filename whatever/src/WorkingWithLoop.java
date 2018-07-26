
public class WorkingWithLoop {

    public static void main(String[] args) {
        WorkingWithLoop working = new WorkingWithLoop();
        working.sumation();
        working.subString();
    }

    private void subString() {
        String name = "Kittikunb";
        while (name.length() > 0) {
            System.out.print(name.substring(0, 1));
            name = name.substring(1);
        }
    }

    private void sumation() {
        int countLoop = 1;
        int sum = 0;
        int length = 10;
        while (true) {
            if (countLoop(countLoop, length))
                break;
            sum += countLoop++;
        }
        System.out.println(sum);
    }

    private boolean countLoop(int countLoop, int length) {
        return countLoop > length;
    }

}
