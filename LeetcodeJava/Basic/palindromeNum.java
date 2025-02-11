class palindromeNum {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0){
            return false;
        }
        int t = x;
        int reverse = 0;
        while(x>0){
            int temp = x%10;
            x = x/10;
            reverse = (reverse*10) + temp;
        }
        return t==reverse;
    }
}