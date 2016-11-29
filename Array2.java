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

}
