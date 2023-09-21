public class Main {
    public static void main(String[] args) {
        int resultOne = add(5, 10); 
        System.out.println(resultOne); 
        
        String resultTwo = greeting("Patrick"); 
        System.out.println(resultTwo); 
        
        int resultThree = add(2, 4, 6, 8); 
        System.out.println(resultThree); 
        
        printMe("Hello, world!"); 
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int sumOne = add(numOne, numTwo);
        int sumTwo = add(sumOne, numThree);
        int sumThree = add(sumTwo, numFour);
        return sumThree;
    }

    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}
