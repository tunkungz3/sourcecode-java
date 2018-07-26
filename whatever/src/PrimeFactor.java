
public class PrimeFactor {

    public String of(int input) {
        StringBuilder result = new StringBuilder();
        int i = 2;
        while (input > 1) {
            if (input % i == 0) {
                result.append(i);
                input /= i;
            } else {
                i++;
            }
        }

        return result.toString();
    }

}
