package leetcode.year2023.month4;

import util.Description;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出一个单词数组 words ，其中每个单词都由小写英文字母组成。
 * </p>
 * 如果我们可以 不改变其他字符的顺序 ，在 wordA 的任何地方添加 恰好一个 字母使其变成 wordB ，那么我们认为 wordA 是 wordB 的 前身 。
 * </p>
 * 例如，"abc" 是 "abac" 的 前身 ，而 "cba" 不是 "bcad" 的 前身
 * 词链是单词 [word_1, word_2, ..., word_k] 组成的序列，k >= 1，其中 word1 是 word2 的前身，word2 是 word3 的前身，依此类推。一个单词通常是 k == 1 的 单词链 。
 * </p>
 * 从给定单词列表 words 中选择单词组成词链，返回 词链的 最长可能长度 。
 */
@Description(difficulty = Description.Difficulty.MIDDLE, solve = false)
public class T1048 {
    public static void main(String[] args) {
        var t = new T1048();
        var arr = new String[]{"a", "b", "ba", "bca", "bda", "bdca"};
        System.out.println(t.longestStrChain(arr));
    }

    public int longestStrChain(String[] words) {
        int n = words.length;
        String[][] dp = new String[n + 1][20];
        for (int i = 1; i <= n; i++) {
            String word = words[i];
            if (dp[i][word.length() - 1] == null){
                dp[i][word.length()] = word;
            } else {

            }
        }
        return 0;
    }
}
