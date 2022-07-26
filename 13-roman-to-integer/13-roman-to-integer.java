class Solution {
    public int romanToInt(String s) {
        int sum  = 0;
        String[] m = {"I","V","X","L","C","D","M","IV","IX","XL","XC","CD","CM"};
        int [] arr = {1,5,10,50,100,500,1000,4,9,40,90,400,900};
        HashMap <String,Integer> map = new HashMap<>();
        for(int i = 0;i<m.length;i++)
            map.put(m[i],arr[i]);
        int i = 0;
        while(i<s.length())
        {   
            String c;
            if(i!=s.length()-1)
             c = s.substring(i,i+2);
            else
             c = s.substring(i);
            if(map.containsKey(c))
            {
            sum = sum + map.get(c);
            i+=2;
            }
            else
            {
                String ch1 = c.substring(0,1);
                sum = sum + map.get(ch1);
                i++;
            }
                
        }
        
        return sum;
    
}}