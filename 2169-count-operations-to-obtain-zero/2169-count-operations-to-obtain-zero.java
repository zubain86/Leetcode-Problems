class Solution {
    public int countOperations(int num1, int num2) {
        return countOperation(num1,num2,0);
       
    }
        public int countOperation(int num1, int num2,int count)
        {
            if(num1==0||num2==0)
            return count;
        else if(num1<num2)
            return countOperation(num1,num2-num1,++count);
        else 
            return countOperation(num1-num2,num2,++count);
        }
}