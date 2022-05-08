class Solution {
    public static int numberOfSteps(int num) {
         int count = 0;
        while(num!=0)
        {
        if(num%2==0)
        {
            num = num/2;
            count++;
        }
        else
        {
         count++;
         num--;
        }
    }
        return count;
}
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the number");
    n = sc.nextInt();
    int s = numberOfSteps(n);
    System.out.println("Number of steps to reduce the number to zero is: "+s);
}
}
