package leetcode.year2023.month4;


import util.DataUtil;
import util.Description;

/**
 * 给定一个数组 books ，其中 books[i] = [thicknessi, heighti] 表示第 i 本书的厚度和高度。你也会得到一个整数 shelfWidth 。
 * <p>
 * 按顺序 将这些书摆放到总宽度为 shelfWidth 的书架上。
 * <p>
 * 先选几本书放在书架上（它们的厚度之和小于等于书架的宽度 shelfWidth ），然后再建一层书架。重复这个过程，直到把所有的书都放在书架上。
 * <p>
 * 需要注意的是，在上述过程的每个步骤中，摆放书的顺序与你整理好的顺序相同。
 * <p>
 * 例如，如果这里有 5 本书，那么可能的一种摆放情况是：第一和第二本书放在第一层书架上，第三本书放在第二层书架上，第四和第五本书放在最后一层书架上。
 * 每一层所摆放的书的最大高度就是这一层书架的层高，书架整体的高度为各层高之和。
 * <p>
 * 以这种方式布置书架，返回书架整体可能的最小高度。
 *
 */

@Description(difficulty = Description.Difficulty.MIDDLE, solve = false)
public class T1105 {
    public static void main(String[] args) {
        var t = new T1105();
        int[][] arr = DataUtil.toIntTwoArray("[[1,1],[2,3],[2,3],[1,1],[1,1],[1,1],[1,2]]");
        int width = 4;
        System.out.println(t.minHeightShelves(arr, width));
    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[] dp = new int[1000];
        return 0;
    }
    
}
