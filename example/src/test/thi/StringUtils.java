package test.thi;

/**
 * Created by ThiLH on 4/18/2017.
 */
public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

}
