package util;

import com.google.gson.Gson;

public class DataUtil {
    static Gson gson = new Gson();

    public static String[] toStringArray(String s) {
        return gson.fromJson(s, String[].class);
    }

    public static int[] toIntArray(String s) {
        return gson.fromJson(s, int[].class);
    }

    public static int[][] toIntTwoArray(String s) {
        return gson.fromJson(s, int[][].class);
    }

    public static double[] toDoubleArray(String s) {
        return gson.fromJson(s, double[].class);
    }

    public static double[][] toDoubleTwoArray(String s) {
        return gson.fromJson(s, double[][].class);
    }
}
