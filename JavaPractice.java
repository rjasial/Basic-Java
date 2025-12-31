import java.util.Arrays;

// Arrays Practice

public class JavaPractice {
    public static void main(String[] args) {
        question1();
        printing();
        question2();
        printing();
        question3();
        printing();
        question4();
        printing();
        question5();
        printing();
        question6();
        printing();
        question7();
        printing();
        question8();
        printing();
        question9();
        printing();
        question10();
        printing();
        question11();
        printing();
        question12();
        printing();
        question13();
        printing();
        question14();
        printing();
        question15();
        printing();
        question16();
        printing();
        question17();
        printing();
        question18();
    }

    public static void printing() {
        System.out.println("Next Question: ");
    }

    // Print array elements

    public static void question1() {
        int[] newArr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    // Sum of array elements

    public static int question2() {
        int[] newArr = { 1, 2, 3, 4, 5 };
        int total = 0;

        for (int i = 0; i < newArr.length; i++) {
            total += newArr[i];

        }
        System.out.println(total);
        return total;

    }

    // Count even numbers

    public static int question3() {
        int[] newArr = { 1, 2, 3, 4, 5, 6 };
        int total = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] % 2 == 0) {
                total++;
            }

        }
        System.out.println(total);
        return total;

    }

    // Cound odd number
    public static int question4() {
        int[] newArr = { 1, 2, 3, 4, 5, 6 };
        int total = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] % 2 != 0) {
                total++;
            }

        }
        System.out.println(total);
        return total;

    }

    // Find Largest Element

    public static void question5() {
        int[] newArr = { 5, 2, 9, 4, 7, 1 };
        int largeElement = newArr[0];

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > largeElement) {
                largeElement = newArr[i];
            }
        }
        System.out.println(largeElement);
    }

    // Find smallest element

    public static void question6() {
        int[] newArr = { 5, 2, 9, 4, 7, 1 };
        int smallestElement = newArr[0];

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] < smallestElement) {
                smallestElement = newArr[i];
            }
        }
        System.out.println(smallestElement);
    }

    // Check if number exists

    public static void question7() {
        int[] newArr = { 1, 2, 3, 4, 5, 6 };
        int target = 4;

        // boolean found = false;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == target) {

                System.out.println("Found number 4 exists at index: " + i);
            }
        }
    }

    // Count frequency of a number
    public static int question8() {
        int[] newArr = { 6, 1, 2, 3, 2, 2, 5, 2 };
        int found = 2;

        int count = 0;

        // boolean found = false;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == found) {
                count++;
            }

        }
        System.out.println(count);
        return count;

    }

    // array in reverse

    public static void question9() {
        int[] newArr = { 1, 2, 3, 4, 5, 6 };
        int[] revArr = new int[newArr.length];

        int j = 0;

        for (int i = newArr.length - 1; i >= 0; i--) {
            revArr[j] = newArr[i];
            j++;
        }
        System.out.println(Arrays.toString(revArr));
    }

    // Difference between max and min

    public static int question10() {
        int[] newArr = { 5, 10, 3, 8, 6, 2 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > max) {
                max = newArr[i];
            }
        }
        for (int j = 0; j < newArr.length; j++) {
            if (newArr[j] < min) {
                min = newArr[j];
            }
        }

        diff = max - min;
        System.out.println(diff);
        return diff;
    }

    // Move zeroes to end: Two pointers approach

    public static void question11() {
        int[] arr = { 1, 0, 2, 0, 3, 0 };

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));

    }

    // Second Largest Element

    public static void question12() {
        int[] newArr = { 5, 10, 3, 8, 6, 2 };
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > max) {
                secMax = max;
                max = newArr[i];
            } else if (newArr[i] > secMax) {
                secMax = newArr[i];
            }
        }
        System.out.println(secMax);
    }

    // if array is sorted

    public static void question13() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("not sorted");
                ;
            }
        }
        System.out.println("sorted");
        ;
    }

    // Find missing number (1 to n)
    public static void question14() {
        int[] arr = { 1, 2, 4, 5, 6 };

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != 1) {
                System.out.println(arr[i] + 1);
            }
        }
    }

    // Sum of odd elements
    public static void question15() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int oddTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddTotal += arr[i];
            }
        }
        System.out.println(oddTotal);
    }

    // Print only even elements

    public static void question16() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    // First repeating element
    public static void question17() {
        int[] arr = { 1, 2, 3, 2, 4, 1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
        return;
    }

    // First non-repeating element
    public static void question18() {
        int[] arr = { 1, 2, 3, 2, 4, 1 };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);
            }

        }

    }

}
