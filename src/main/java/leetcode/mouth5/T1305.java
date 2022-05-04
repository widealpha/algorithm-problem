package leetcode.mouth5;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class T1305 {
    public static void main(String[] args) {
        T1305 t = new T1305();
        System.out.println(t.getAllElements(null, null));
    }

    Stack<Integer> max = new Stack<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if (root1 != null) {
            middle(root1, list);
        }
        if (root2 != null) {
            middle(root2, list);
        }
        Collections.sort(list);
        return list;
    }

    public void middle(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        middle(root.left, list);
//        add(list, root.val);
        list.add(root.val);
        middle(root.right, list);
    }

}
