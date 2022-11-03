package arxangellos.app.testing.main.ess.biz;

/**
 * Utility class for left pad, right pad, center pad and zero fill.
 */
public final class StringUtils {

    public static String left(String string, int length, char fill) {

        if (string.length() < length) {

            char[] chars = string.toCharArray();
            char[] output = new char[length];

            int delta = length - chars.length;

            for (int i = 0; i < length; i++) {
                if (i < delta) {
                    output[i] = fill;
                } else {
                    output[i] = chars[i - delta];
                }
            }

            return new String(output);
        }

        return string;
    }

    public static String right(String string, int length, char fill) {

        if (string.length() < length) {

            char[] chars = string.toCharArray();
            char[] output = new char[length];

            for (int i = 0; i < length; i++) {
                if (i < chars.length) {
                    output[i] = chars[i];
                } else {
                    output[i] = fill;
                }
            }

            return new String(output);
        }

        return string;
    }

    public static String center(String string, int length, char fill) {

        if (string.length() < length) {

            char[] chars = string.toCharArray();

            int delta = length - chars.length;
            int a = (delta % 2 == 0) ? delta / 2 : delta / 2 + 1;
            int b = a + chars.length;

            char[] output = new char[length];
            for (int i = 0; i < length; i++) {
                if (i < a) {
                    output[i] = fill;
                } else if (i < b) {
                    output[i] = chars[i - a];
                } else {
                    output[i] = fill;
                }
            }

            return new String(output);
        }

        return string;
    }

    public static String zerofill(String string, int length) {
        return left(string, length, '0');
    }

    private StringUtils() {
    }

    /**
     * For tests!
     */
    public static void main(String[] args) {

        String string = "123";
        char blank = ' ';

        System.out.println("left pad:    [" + StringUtils.left(string, 10, blank) + "]");
        System.out.println("right pad:   [" + StringUtils.right(string, 10, blank) + "]");
        System.out.println("center pad:  [" + StringUtils.center(string, 10, blank) + "]");
        System.out.println("zero fill:   [" + StringUtils.zerofill(string, 10) + "]");
    }
}