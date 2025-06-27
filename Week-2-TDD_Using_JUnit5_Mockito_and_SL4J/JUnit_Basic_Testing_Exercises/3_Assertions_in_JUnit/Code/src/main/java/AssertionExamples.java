public class AssertionExamples {

    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public int[] getNumbersArray() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public Object getNullObject() {
        return null;
    }

    public Object getNonNullObject() {
        return new Object();
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public double calculateInterest(double principal, double rate, int years) {
        return principal * rate * years;
    }
}