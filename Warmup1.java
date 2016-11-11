package LearningStrings;

public class Warmup1 {
/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.*/
    public boolean loneTeen(int a, int b) {
        boolean isTeenA = a >= 13 && a <= 19;
        boolean isTeenB = b >= 13 && b <= 19;
        return (isTeenA || isTeenB) && !(isTeenA && isTeenB);
    }

/*Given a string, if the string "del" appears starting at index 1, return a
string where that "del" has been deleted. Otherwise, return the string unchanged.*/
    public String delDel(String str) {
        if (str.length() <= 3) {
            return str;
        }
        String findDel = str.substring(1, 4);
        if (findDel.equals("del")) {
            return str.substring(0, 1).concat(str.substring(4));
        }
        return str;
    }

}
