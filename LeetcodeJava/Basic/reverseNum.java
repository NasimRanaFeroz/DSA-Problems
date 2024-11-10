class reverseNum {
    
    public int reverse(int x) {

       int reversed = 0;
       int INT_MIN = -2147483648;
       int INT_MAX = 2147483647;

       while(x != 0){
        int temp = x%10;
        x /= 10;
        if(reversed>(INT_MAX/10) || reversed<(INT_MIN/10)){
            return 0;
        }
        reversed = (reversed*10) + temp;
       }
       return reversed;
    }
}