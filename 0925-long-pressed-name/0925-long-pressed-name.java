class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(typed.length()<name.length())
            return false;
       
        int i = 0, j = 0;
        int count = 1;
        int count1 = 1;
        while(i<name.length() && j<typed.length())
        {
            if(name.charAt(i)==typed.charAt(j)){
        while(i!=name.length()-1 && name.charAt(i)==name.charAt(i+1))
        {
            i++;
            count++;
        }
        while(j!=typed.length()-1 && typed.charAt(j)==typed.charAt(j+1))
        {
            j++;
            count1++;
        }
        if(count>count1)
        {
            return false;
        }
        count = 1;
        count1= 1;
        i++;
        j++;
            }
            else
            {
                return false;
            }

        }
        System.out.println(i);
        System.out.println(j);
        if(i==name.length() && j<=typed.length()-1)
            return false;
        if(j==typed.length()&&i<=name.length()-1)
             return false;
        return true;
    }
    
    }
