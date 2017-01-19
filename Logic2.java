
public class Logic2 {
    /*We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and
    big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks*/
    public boolean makeBricks(int small, int big, int goal) {
        if (big * 5 + small < goal) {
            return false;
        }
        if (goal % 5 > small) {
            return false;
        }
        return true;
    }

    /*Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
    it does not count towards the sum.*/
    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    /*Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards
    the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.*/
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    /*Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
    inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public
    int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you
    avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level
    as the main noTeenSum().*/
    public int noTeenSum(int a, int b, int c) {
        int checkForTeen = 0;

        checkForTeen += fixTeen(a);
        checkForTeen += fixTeen(b);
        checkForTeen += fixTeen(c);
        return checkForTeen;
    }

    public int fixTeen(int n) {
        if ((n >= 13 && n < 15) || (n >= 17 && n <= 19)) {
            n = 0;
        }
        return n;
    }

    /*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so
    15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
    so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition,
    write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and
    at the same indent level as roundSum().*/
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int rightDigit = num % 10;
        num -= rightDigit;
        if (rightDigit >= 5) {
            num += 10;
        }
        return num;
    }

}


