public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 9, 2, 7};
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}

