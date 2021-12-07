package pt.caires.hackerrank.advanced.lambdaexpr;

interface PerformOperation {

    boolean check(int a);

}


class MyMath {

    public static boolean checker(final PerformOperation p, final int num) {
        return p.check(num);
    }

    private static boolean checkPrime(final int num) {
        boolean result = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    PerformOperation isPrime() {
        return num -> num <= 3 || checkPrime(num);
    }

    PerformOperation isPalindrome() {
        return num -> {
            final String numStr = Integer.toString(num);
            return numStr.equals(new StringBuilder(numStr).reverse().toString());
        };
    }

}
