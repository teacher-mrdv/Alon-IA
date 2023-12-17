public class Combination {
    private static long calculateCombinations(int n, int k) { //Combination formula
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    private static long factorial(long number) {  //Factorial formula
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}
