package leetcode.year2022.mouth4;

public class T6 {
    public static void main(String[] args) {
        System.out.println(new T6().convert("PAYPALISHIRING", 3));
    }

    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows >= n) {
            return s;
        }
        StringBuffer[] mat = new StringBuffer[numRows];
        for (int i = 0; i < numRows; ++i) {
            mat[i] = new StringBuffer();
        }
        for (int i = 0, x = 0, t = numRows * 2 - 2; i < n; ++i) {
            mat[x].append(s.charAt(i));
            if (i % t < numRows - 1) {
                ++x;
            } else {
                --x;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuffer row : mat) {
            ans.append(row);
        }
        return ans.toString();
    }
}
