import java.util.Arrays;

public class Sort {

    public int[] of(int[] input) {
        Arrays.sort(input);
        return input;
    }

    public int[] offend(int[] input) {
        int length = input.length - 1;
        return sort(input, length);
    }

    private int[] sort(int[] input, int length) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < length; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;
                }
            }
        }

        return input;
    }

}
