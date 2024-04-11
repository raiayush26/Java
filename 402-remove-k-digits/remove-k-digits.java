class Solution {
    public String removeKdigits(String num, int k) {
      int len = num.length();
    if (k >= len) return "0"; // If all digits are removed, return "0"

    StringBuilder sb = new StringBuilder();
    int i = 0;

    while (i < len) {
        
        while (k > 0 && sb.length() > 0 && num.charAt(i) < sb.charAt(sb.length() - 1)) {
            sb.deleteCharAt(sb.length() - 1); // Remove the last digit
            k--;
        }
        sb.append(num.charAt(i)); // Add the current digit
        i++;
    }

    // If there are remaining digits to remove
    while (k > 0 && sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1); // Remove the last digit
        k--;
    }

    // Remove leading zeros
    while (sb.length() > 0 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }

    return sb.length() > 0 ? sb.toString() : "0";
    }
}