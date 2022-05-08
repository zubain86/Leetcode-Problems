
import java.util.*;
class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        int i,flag=0;
        for(i=left;i<=right;i++)
        {
            int num  = i;
            while(num!=0)
            {
                int r = num%10;
                if(r==0){
                    flag=1;
                    break;
                }
                if(r!=0&&i%r!=0)
                {
                    flag=1;
                    break;
                }
                else
                {
                    num = num/10;
                }
            }
            if(flag==0)
            {
                list.add(i);
            }
            flag = 0;
        }

        return list;
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        if(left>=1&&right>=left&&right<=(int)Math.pow(10,4))
        {
            List<Integer> list1 = selfDividingNumbers(left,right);
            System.out.println(list1);
        }

    }
}