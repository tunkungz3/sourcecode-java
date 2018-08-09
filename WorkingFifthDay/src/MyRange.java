//    solution
//       1.[ = include
//       3.]
//       2.( = exclude
//       4.)
//       5.defaultValue
//       6.finalValue
//       7. result defaultValue ... finalValue
public class MyRange {

    private String input;
    private int startNumber;
    private int endNumber;
    private static final int asciiCodeZero = 48;

    public MyRange(String input) {
        this.input = input;
        this.input = this.input.replaceAll(",", "");
        this.startNumber = input.charAt(1) - asciiCodeZero;
        this.endNumber = input.charAt(input.length() - 2) - asciiCodeZero;
    }

    public boolean checkRange() {
        return startNumber - endNumber <= 0;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public boolean endWithInclude() {
        return input.endsWith("]");
    }

    public int getStartNumber() {
        if (startWithInclude()) {
            return this.startNumber;
        }
        return this.startNumber + 1;
    }

    public int getEndNumber() {
        if (endWithInclude()) {
            return this.endNumber;
        }
        return this.endNumber - 1;
    }

    public String getResult() {
        if (!checkRange()) {
            return "";
        }
        String result = "";
        for (int i = getStartNumber(); i <= getEndNumber(); i++) {
            result += i + ",";
        }
        return result.substring(0, result.length() - 1);
    }
}
