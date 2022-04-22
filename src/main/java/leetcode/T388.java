package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class T388 {
    public static void main(String[] args) {
        System.out.println(new T388().lengthLongestPath("skd\n\talskjv\n\t\tlskjf\n\t\t\tklsj.slkj\n\t\tsdlfkj.sdlkjf\n\t\tslkdjf.sdfkj\n\tsldkjf\n\t\tlskdjf\n\t\t\tslkdjf.sldkjf\n\t\t\tslkjf\n\t\t\tsfdklj\n\t\t\tlskjdflk.sdkflj\n\t\t\tsdlkjfl\n\t\t\t\tlskdjf\n\t\t\t\t\tlskdjf.sdlkfj\n\t\t\t\t\tlsdkjf\n\t\t\t\t\t\tsldkfjl.sdlfkj\n\t\t\t\tsldfjlkjd\n\t\t\tsdlfjlk\n\t\t\tlsdkjf\n\t\tlsdkjfl\n\tskdjfl\n\t\tsladkfjlj\n\t\tlskjdflkjsdlfjsldjfljslkjlkjslkjslfjlskjgldfjlkfdjbljdbkjdlkjkasljfklasjdfkljaklwejrkljewkljfslkjflksjfvsafjlgjfljgklsdf.a"));
    }

    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        StringBuilder builder = new StringBuilder();
        int level = 0;
        int levelNow = 0;
        int i = 0;
        boolean firstFile = false;
        while (true) {
            if (i < input.length() && input.charAt(i) != '\n') {
                builder.append(input.charAt(i));
                i++;
            } else {
                stack.push(builder.length());
                if (builder.toString().contains(".")) {
                    firstFile = true;
                    maxLength = builder.length();
                }
                break;
            }
        }
        while (i < input.length() - 1) {
            if (input.charAt(i) == '\n') {
                levelNow = 0;
                builder = new StringBuilder();
                while (input.charAt(++i) == '\t') {
                    levelNow++;
                }
            }
            while (i < input.length() && input.charAt(i) != '\n') {
                builder.append(input.charAt(i));
                i++;
            }
            String s = builder.toString();
            boolean isFile = s.length() > 2 && s.substring(1, s.length() - 1).contains(".") && s.charAt(0) != '.';
            while (levelNow < level) {
                level--;
                stack.pop();
            }
            if (levelNow > level) {
                while (levelNow - 1 > level) {
                    level++;
                    stack.push(stack.peek());
                }
                if (!isFile) {
                    level++;
                    stack.push(stack.peek() + s.length());
                }
            }
            if (isFile) {
                if (firstFile) {
                    maxLength = Math.max(maxLength, s.length());
                } else if (levelNow == 0) {
                    maxLength = Math.max(maxLength, s.length());
                } else {
                    if (level == levelNow){
                        stack.pop();
                        level--;
                    }
                    int l = stack.peek() + s.length() + stack.size();
                    if (l > maxLength) {
                        maxLength = l;
                    }
                }

            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(s.length());
                } else {
                    stack.push(stack.peek() + s.length());
                }
            }
        }
        return maxLength;
    }
}