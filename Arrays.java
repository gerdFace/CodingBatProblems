public class Arrays {

/*Given an array of ints, return true if 6 appears as either the first
or last element in the array. The array will be length 1 or more.*/
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length -1] == 6) {
            return true;
        }
        return false;
    }
/*Given an array of ints, return true if the array is length 1 or more, and the first
element and the last element are equal.*/
    public boolean sameFirstLast(int[] nums) {

        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

/*Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.*/
    public int[] makePi() {
        int[] piArray = new int[] {3, 1, 4};
        return piArray;
    }

/*Given 2 arrays of ints, a and b, return true if they have the same first element or
they have the same last element. Both arrays will be length 1 or more.*/
    public boolean commonEnd(int[] a, int[] b) {
        if ((a[0] == b[0]) || (a[a.length -1] == b[b.length -1])) {
            return true;
        }
        return false;
    }

/*Given an array of ints length 3, return the sum of all the elements.*/
    public int sum3(int[] nums) {
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

/*Given an array of ints length 3, return an array with the elements "rotated left"
so {1, 2, 3} yields {2, 3, 1}.*/
    public int[] rotateLeft3(int[] nums) {
        int willBe0 = nums[1];
        int willBe1 = nums[2];
        int willBe2 = nums[0];

        int[] newArray = new int[]{willBe0, willBe1, willBe2};
        return newArray;
    }

//The for loop would be better if the size is longer or unknown:
    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < 2; i++) {
            nums[i] = nums[i + 1];
        }
        nums[2] = temp;

        return nums;
    }

/*Given an array of ints length 3, return a new array with the elements in reverse
order, so {1, 2, 3} becomes {3, 2, 1}.*/
    public int[] reverse3(int[] nums) {
        int first = nums[2];
        int last = nums[0];
        int middle = nums[1];
        int[] newArray = new int[] {first, middle, last};
        return newArray;
//a good for loop for this one???
    }

}
