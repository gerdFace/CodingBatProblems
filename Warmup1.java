public class Warmup1 {

/*CodingBat problem --must return first and second character if they
* are 'o' or 'z', respectively.*/
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)== 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)== 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

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

    /*Given three int values, a b c, return the largest.*/
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

}
