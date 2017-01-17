public class Logic1 {
    /*When squirrels get together for a party, they like to have cigars. A squirrel party is successful
    when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no
    upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.*/
    public boolean cigarParty(int cigars, boolean isWeekend) {
        boolean weekdayCigars = cigars >= 40 && cigars <= 60;
        boolean weekendCigars = cigars >= 40;
        if ((!isWeekend && weekdayCigars) || (isWeekend && weekendCigars)) return true;
        return false;
    }
    //Alternative solution:
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }

    /*You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of
    your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the
    table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the
    result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no).
    Otherwise the result is 1 (maybe).*/
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    /*The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is
    between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int
    temperature and a boolean isSummer, return true if the squirrels play and false otherwise.*/
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) return (temp >= 60 && temp <= 100);
        if (!isSummer) return (temp >= 60 && temp <= 90);
        return false;
    }

    /*You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as
    an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed
    is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is
    your birthday -- on that day, your speed can be 5 higher in all cases.*/
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int result = 0;

        if ((!isBirthday && (speed > 60 && speed <= 80)) || (isBirthday && (speed > 65 && speed <= 85))) {
            result = 1;
        }

        if ((!isBirthday && speed > 80) || (isBirthday && speed > 85)) {
            result = 2;
        }
        return result;
    }

    /*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that
    case just return 20.*/
    public int sortaSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;
    }

    /*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
    return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
    and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and
    weekends it should be "off".*/
    public String alarmClock(int day, boolean vacation) {
        String alarm = "7:00";

        if (((vacation) && (day >= 1 && day <= 5)) || ((!vacation) && (day == 0 || day == 6))) {
            alarm = "10:00";
        }

        if ((vacation) && (day == 0 || day == 6)) {
            alarm = "off";
        }
        return alarm;
    }

    /*The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum
    or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.*/
    public boolean love6(int a, int b) {
        boolean hasSix = false;

        if (a == 6 || b == 6) {
            hasSix = true;
        }
        if ((a + b == 6) || (Math.abs(a - b) == 6)) {
            hasSix = true;
        }
        return hasSix;
    }

    /*Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return
    true if the number is less or equal to 1, or greater or equal to 10.*/
    public boolean in1To10(int n, boolean outsideMode) {
        boolean inRange = false;

        if ((!outsideMode) && (n >= 1 && n <= 10)) {
            inRange = true;
        }
        if ((outsideMode) && (n <= 1 || n >= 10)) {
            inRange = true;
        }
        return inRange;
    }

    /*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return
    true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod*/
    public boolean specialEleven(int n) {
        boolean isSpecial = false;

        if (n%11 == 0 || n%11 == 1) {
            isSpecial = true;
        }
        return isSpecial;
    }

    /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod*/
    public boolean more20(int n) {
        if ((n % 20 == 1) || (n % 20 == 2)) {
            return true;
        }
        return false;
    }

    /*Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod"
    operator -- see Introduction to Mod*/
    public boolean old35(int n) {
        return ((n % 3 == 0 && n % 5 != 0) || (n % 5 == 0 && n % 3 != 0));
    }

    /*Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39
    return true, but 40 returns false. See also: Introduction to Mod*/
    public boolean less20(int n) {
        return (((n+1)%20 == 0) || ((n+2)%20 == 0));
    }

    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
    remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod*/
    public boolean nearTen(int num) {
        return (((num+1)%10 == 0) || ((num+2)%10 == 0) || (num%10 == 1) || (num%10 == 2) || (num%10 ==0));
    }

    /*Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
    So if either value is a teen, just return 19.*/
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }

    /*Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
    answer if it is your mom calling. In all cases, if you are asleep, you do not answer.*/
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }

        if (isMorning && !isMom) {
            return false;
        }

        return true;
    }

    /*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return
    the given array, or return a new array.*/
    public int[] shiftLeft(int[] nums) {
        if (nums.length >= 2) {
            int lastNum = nums[0];
            for (int i = 0; i < nums.length -1; i++ ) {
                nums[i] = nums[i+1];
            }
            nums[nums.length -1] = lastNum;
        }
        return nums;
    }

    /*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.*/
    public int[] tenRun(int[] nums) {
        int temp = -1;
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i]%10 == 0) {
                temp = nums[i];
            }
            else if (temp != -1) {
                nums[i] = temp;
            }
        }
        return nums;
    }

    /*We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad,
    1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is
    at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy
    is less than 5, the party is always bad (0).*/
    public int teaParty(int tea, int candy) {
        int outcome = 0;
        if (candy >= 5 && tea >= 5) {
            outcome += 1;
            if ((tea >= candy *2) || (candy >= tea *2)) {
                outcome += 1;
            }
        }
        return outcome;
    }

    /*Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If
    both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
    (See also: FizzBuzz Code)*/
    public String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && !endsWithB) {
            str = "Fizz";
        }
        if (!startsWithF && endsWithB) {
            str = "Buzz";
        }
        if (startsWithF && endsWithB) {
            str = "FizzBuzz";
        }
        return str;
    }

    /*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the
    number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if
    divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so
    23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code
    and Introduction to Mod)*/
    public String fizzString2(int n) {
        String stringOfN = String.valueOf(n) + "!";
        boolean div3 = n % 3 == 0;
        boolean div5 = n % 5 == 0 ;

        if (div3 && !div5) {
            stringOfN = "Fizz!";
        }
        if (!div3 && div5) {
            stringOfN = "Buzz!";
        }
        if (div3 && div5) {
            stringOfN = "FizzBuzz!";
        }
        return stringOfN;
    }

    /*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.*/
    public boolean twoAsOne(int a, int b, int c) {
        boolean aPlusB = a + b == c;
        boolean aPlusC = a + c == b;
        boolean bPlusC = b + c == a;

        return (aPlusB || aPlusC || bPlusC);
    }

    /*Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the
    exception that if "bOk" is true, b does not need to be greater than a.*/
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean bBiggerA = a < b;
        boolean cBiggerB = b < c;

        if (bOk && cBiggerB) {
            return true;
        }
        if (bBiggerA && cBiggerB) {
            return true;
        }
        return false;
    }

    /*Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not
    6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.*/
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean ascendingInts = a < b && b < c;
        boolean equalInts = a <= b && b <= c;

        if (ascendingInts && !equalOk) {
            return true;
        }
        if (equalInts && equalOk) {
            return true;
        }
        return false;
    }

    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are
    non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.*/
    public boolean lastDigit(int a, int b, int c) {
        int modA = a % 10;
        int modB = b % 10;
        int modC = c % 10;

        if (modA == modB || modA == modC || modB == modC) {
            return true;
        }
        return false;
    }

    /*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.*/
    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
    }

    /*Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two
    dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.*/
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1;
            } else {
                die1 += 1;
            }
            return die1 + die2;
        }
        return die1 + die2;
    }

    /*Given two int values, return whichever value is larger. However if the two values have the same remainder when
    divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0.
    Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.*/
    public int maxMod5(int a, int b) {
        boolean sameRemainder = a % 5 == b % 5;

        if (a == b) {
            return 0;
        }
        if (sameRemainder) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value
    2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c
    are different from a, the result is 1. Otherwise the result is 0.*/
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    /*You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
    the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
    the result is 10.*/
    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || b == c || a == c) {
            return 10;
        }
        return 0;
    }

    /*You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc,
    and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise
    if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.*/
    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10;
        }
        if (a - c == 10 || b - c == 10) {
            return 5;
        }
        return 0;
    }

    /*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as
    the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)*/
    public boolean shareDigit(int a, int b) {
        int firstDigitA = a / 10;
        int lastDigitA = a % 10;
        int firstDigitB = b / 10;
        int lastDigitB = b % 10;

        return ((firstDigitA == firstDigitB || firstDigitA == lastDigitB) ||
                (lastDigitA == firstDigitB || lastDigitA == lastDigitB));
    }

    /*Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
    If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a
    non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)*/
    public int sumLimit(int a, int b) {
        String stringA = String.valueOf(a);
        String stringSum = String.valueOf(a + b);

        if (stringSum.length() == stringA.length()) {
            return a + b;
        }
        return a;
    }

}

