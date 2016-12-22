public class Array2 {

    /*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder,
    e.g. 5 % 2 is 1.*/
    public int countEvens(int[] nums) {
        int count = 0;
        for(int i:nums) {
            if (i % 2 == 0) count++;
        }
        return count;
    }

    /*Given an array length 1 or more of ints, return the difference between the largest and smallest values in
    the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of
    two values.*/
    public int bigDiff(int[] nums) {
        int maxNum = nums[0];
        int minNum = nums[0];
        for (int i:nums) {
            maxNum = Math.max(maxNum, i);
            minNum = Math.min(minNum, i);
        }
        return maxNum - minNum;
    }

    /*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
    ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore
    just one copy, and likewise for the largest value. Use int division to produce the final average.
    You may assume that the array is length 3 or more.*/
    public int centeredAverage(int[] nums) {
        int totalNum = 0;
        int maxNum = nums[0];
        int minNum = nums[0];

        for (int i:nums) {
            maxNum = Math.max(i, maxNum);
            minNum = Math.min(i, minNum);
            totalNum += i;
        }
        return (totalNum - (maxNum + minNum)) / (nums.length -2);
    }

    /*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very
    unlucky, so it does not count and numbers that come immediately after a 13 also do not count.*/
    public int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13 && i != nums.length - 1) {
                nums[i + 1] = 0;
            }
            if (nums[i] == 13) {
                nums[i] = 0;
            }
            sum += nums[i];
        }
        return sum;
    }

}
