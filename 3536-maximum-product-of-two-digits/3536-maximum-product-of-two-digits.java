class Solution {
    public int maxProduct(int n) {
    String str=String.valueOf(n);
    char[] digit=str.toCharArray();
    Arrays.sort(digit);
    int max1=Character.getNumericValue(digit[digit.length-1]);
    int max2=Character.getNumericValue(digit[digit.length-2]);
    return max1*max2;
    }
}