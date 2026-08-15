class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0;

        // Loop from right to left until both strings are exhausted and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to integer
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to integer
                j--;
            }

            // Append the remainder (the current bit) to the string builder
            result.append(sum % 2);
            // Calculate the new carry (either 0 or 1)
            carry = sum / 2;
        }

        // Since bits were added from right to left, reverse the result
        return result.reverse().toString();
    }
}