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

    /*Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to
    the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.*/
    public int sum67(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        nums[j] = 0;
                        i = j;
                        break;
                    }
                }
            }
            sum += nums[i];
        }
        return sum;
    }

    /*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.*/
    public boolean has22(int[] nums) {
        boolean has22 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }
        }
        return has22;
    }

    /*Given an array of ints, return true if the array contains no 1's and no 3's.*/
    public boolean lucky13(int[] nums) {
        boolean hasNo13 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                hasNo13 = false;
            }
        }
        return hasNo13;
    }

    /*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.*/
    public boolean sum28(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                result += 2;
            }
        }
        return (result == 8);
    }

    /*Given an array of ints, return true if the number of 1's is greater than the number of 4's*/
    public boolean more14(int[] nums) {
        int total1 = 0;
        int total4 = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                total1 += 1;
            }
            if (nums[i] == 4) {
                total4 += 1;
            }
        }
        return (total1 > total4);
    }

    /*Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement
    for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
    The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)*/
    public int[] fizzArray(int n) {
        int[] fizzArray = new int[n];

        for(int i = 1; i < fizzArray.length; i++) {
            fizzArray[i] = fizzArray[i-1] + 1;
        }
        return fizzArray;
    }

    /*Given an array of ints, return true if every element is a 1 or a 4.*/
    public boolean only14(int[] nums) {
        boolean all14 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                all14 = false;
            }
        }
        return all14;
    }

    /*Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" ..
    through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String
    form of most types. The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)*/
    public String[] fizzArray2(int n) {
        String[] fizzStringArray = new String[n];
        int numberToString = 0;

        for (int i = 0; i < fizzStringArray.length; i++) {
            fizzStringArray[i] = String.valueOf(numberToString);
            numberToString += 1;
        }
        return fizzStringArray;
    }

    /*Given an array of ints, return true if it contains no 1's or it contains no 4's.*/
//    First Solution:
    public boolean no14(int[] nums) {
        boolean containsNo1 = true;
        boolean containsNo4 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                containsNo1 = false;
            }
            if (nums[i] == 4) {
                containsNo4 = false;
            }
        }
        return (containsNo1 || containsNo4);
    }
//    Second Solution:
    public boolean no14(int[] nums) {
        boolean containsNo14 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        containsNo14 = false;
                    }
                }
            }
        }
        return containsNo14;
    }

    /*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one
    of the pair is that value. Return true if the given value is everywhere in the array.*/
    public boolean isEverywhere(int[] nums, int val) {
        boolean intIsEverywhere = true;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != val && nums[i+1] != val) {
                intIsEverywhere = false;
            }
        }
        return intIsEverywhere;
    }

    /*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.*/
    public boolean either24(int[] nums) {
        boolean contains22 = false;
        boolean contains44 = false;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                contains22 = true;
            }
            if (nums[i] == 4 && nums[i+1] == 4) {
                contains44 = true;
            }
        }
        if (contains22 && contains44) {
            return false;
        }
        return (contains22 || contains44);
    }

    /*Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in
    nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.*/
    public int matchUp(int[] nums1, int[] nums2) {
        int matchUp = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2) {
                matchUp++;
            }
            if (nums1[i] == nums2[i]) {
                matchUp--;
            }
        }
        return matchUp;
    }

    /*Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
    separated by one element, such as with {7, 1, 7}.*/
    public boolean has77(int[] nums) {
        boolean has77 = false;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 7) {
                if (nums[i+1] == 7) {
                    has77 = true;
                }
                if (i + 2 < nums.length && nums[i+2] == 7) {
                    has77 = true;
                }
            }
        }
        return has77;
    }

    /*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.*/
    public boolean has12(int[] nums) {
        boolean has12 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        has12 = true;
                    }
                }
            }
        }
        return has12;
    }

    /*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.*/
    public boolean modThree(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == nums[i+1] % 2) && (nums[i+1] % 2 == nums[i+2] % 2)) {
                return true;
            }
        }
        return false;
    }

    /*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.*/
    public boolean haveThree(int[] nums) {
        int haveThree = 0;

        if(nums.length >= 1 && nums[0] == 3)
            haveThree++;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == 3 && nums[i] == 3)
                return false;

            if(nums[i] == 3)
                haveThree++;
        }

        return haveThree == 3;
    }

    /*Given an array of ints, return true if every 2 that appears in the array is next to another 2.*/
    public boolean twoTwo(int[] nums) {

        if(nums.length == 1 && nums[0] == 2) {
            return false;
        }

        if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) || (nums[nums.length-1] == 2 && nums[nums.length -2] != 2))) {
            return false;
        }

        for (int i = 1; i < nums.length -1; i++) {
            if (nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2) {
                return false;
            }
        }
        return true;
    }
    /*Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6},
    the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.*/
    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0, j = nums.length - len; i < len; i++, j++)
            if (nums[i] != nums[j]) return false;
        return true;
    }

    /*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.*/
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length -2; i++) {
            if ((nums[i] == nums[i+1] - 1) && (nums[i+1] == nums[i+2] -1)) {
                return true;
            }
        }
        return false;
    }

    /*Given start and end numbers, return a new array containing the sequence of integers from start up to but not
    including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start
    number. Note that a length-0 array is valid. (See also: FizzBuzz Code)*/
    public int[] fizzArray3(int start, int end) {
        int[] newFizzArray = new int[end-start];
        for (int i = start, j = 0; i < end; i++, j++) {
            newFizzArray[j] = i;
        }
        return newFizzArray;
    }

}
