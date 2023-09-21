public class Main {
    public static void main(String[] args) {
        int numOne = 5;
        int numTwo = 10;
        int numThree = 15;
        int numFour = 20;
        int resultThree = add(numOne, numTwo, numThree, numFour);
        System.out.println(resultThree);
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int sumOne = add(numOne, numTwo);
        int sumTwo = add(sumOne, numThree);
        int sumThree = add(sumTwo, numFour);
        return sumThree;
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}