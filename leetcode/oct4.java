class Solution {
    public boolean isPalindrome(int x) {
        
        String num = String.valueOf(x);
        int right = num.length() - 1;
        int left = 0;
        // 0 1 2
        // 2 1 0
        
        while(left < num.length()){
            if((num.charAt(left) != num.charAt(right))){
                return false;
            }
            left++;
            right--;
        } 
        return true;

        
    }
}