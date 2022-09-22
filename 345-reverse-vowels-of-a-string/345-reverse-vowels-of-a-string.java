class Solution {
    static boolean checkVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        else
            return false;
    }
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        while(i<j)
        {
            if(set.contains(arr[i])&&set.contains(arr[j]))
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(set.contains(arr[i]))
            {
                j--;
            }
            else
            {
                i++;
            }
            
        }
        
        String m = "";
        for(int k = 0;k<s.length();k++)
        {
            m = m + arr[k];
        }
        return m;
    }
}