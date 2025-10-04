package leetcode;

class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits; // directly return the modified array
            }
            digits[i] = 0;
        }

        int newNum[] = new int[length + 1];
        newNum[0] = 1;
        return newNum;
    }

    public static void main(String[] args) {
        PlusOne s = new PlusOne();

        // Example input
        int[] digits = {4, 3, 2, 1};
        int[] result = s.plusOne(digits);

        // Print result
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
